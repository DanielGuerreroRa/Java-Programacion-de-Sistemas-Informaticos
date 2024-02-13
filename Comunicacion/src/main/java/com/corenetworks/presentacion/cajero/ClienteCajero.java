package com.corenetworks.presentacion.cajero;

import com.corenetworks.modelo.CuentaBancaria;
import com.corenetworks.persistencia.AccesoCuentaBancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Scanner;

public class ClienteCajero {
    private static Scanner teclado = new Scanner(System.in);
    private static String cuenta;

    public static void main(String[] args) {

        try {
            if (solicitarPIN()) {
                while (true) {
                    CuentaBancaria cB1 = solicitarDatos();
                    if (cB1.getTipoOperacion() == null) {
                        break;
                    }
                    System.out.println(cB1.toString());
                    try (Socket cliente = new Socket("localhost", 3000);) {
                        PrintWriter mensajeAEnviar = new PrintWriter(cliente.getOutputStream(), true);
                        mensajeAEnviar.println(cB1.getTipoOperacion() + "," + cB1.getId() + "," + cB1.getCantidad());
                        System.out.println("Esperando respuesta del servidor...");
                        BufferedReader mesajeRecibido = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                        System.out.println(mesajeRecibido.readLine());
                    } catch (UnknownHostException e) {
                        System.out.println(e.toString());
                    } catch (IOException e) {
                        System.out.println(e.toString());
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    private static boolean solicitarPIN() throws SQLException, ClassNotFoundException {
        int contador = 0;
        String pin = null;
        AccesoCuentaBancaria aCB1 = new AccesoCuentaBancaria();
        System.out.printf("Escribir la cuenta:  ");
        cuenta = (teclado.nextLine());
        while (true) {
            System.out.println("Escriba el PIN: ");
            pin = teclado.nextLine();
            if (pin.equals(aCB1.obtenerPin(cuenta))) {
                return true;
            } else {
                System.out.println("PIN INCORRECTO");
                contador++;
                if (contador == 3) {
                    System.out.println("Recoja su tarjeta en nuestra sucursal.");
                    return false;
                }
            }
        }
    }

    private static CuentaBancaria solicitarDatos() {
        CuentaBancaria cB1 = new CuentaBancaria();

        int tipoOperacion = 0;

        System.out.printf("%s %n", "-".repeat(50));
        System.out.printf("%s %n", "MENU BANCARIO");
        System.out.printf("%s %n", "-".repeat(50));
        System.out.printf("%s %n", "1) Consultar Saldo");
        System.out.printf("%s %n", "2) Retirar una cantidad");
        System.out.printf("%s %n", "3) Ingresar una cantidad");
        System.out.printf("%s %n", "4) Salir");
        System.out.printf("Escriba la opción -> ");
        tipoOperacion = teclado.nextInt();
        teclado.nextLine();
        if (tipoOperacion == 4) {
            return cB1;
        }
        cB1.setId(cuenta);
        if (tipoOperacion == 2 || tipoOperacion == 3) {
            System.out.printf("Escribir la cantidad: ");
            cB1.setCantidad(teclado.nextDouble());
        }
        cB1.setTipoOperacion(Integer.toString(tipoOperacion));
        return cB1;


    }
}