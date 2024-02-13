package com.corenetworks.presentacion.cajero;

import com.corenetworks.persistencia.AccesoCuentaBancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Arrays;

public class ServidorCajero {
    private static double saldo;
    public static void main(String[] args) {
        BufferedReader mR = null;
        PrintWriter mAE= null;
        String[] datos=null;
        AccesoCuentaBancaria aCB= new AccesoCuentaBancaria();
            try(ServerSocket sv= new ServerSocket(3000);){
             while (true) {
                 System.out.println("Esperando peticion...");
                 Socket s1 = sv.accept();
                 mR=new BufferedReader(new InputStreamReader(s1.getInputStream()));
                 //Dar formato alos datos
                 datos=mR.readLine().split(",");
                 double cantidad = Double.parseDouble(datos[2]);
                 System.out.println(Arrays.toString(datos));
                 saldo=aCB.solicitarSaldo(datos[1]);
                 mAE=new PrintWriter(s1.getOutputStream(),true);
                 switch (datos[0]){
                     case "1":mAE.println("Su saldo es -> "+saldo);
                     break;
                     case "2":if(saldo>=cantidad){
                         aCB.actualizarSaldo(datos[1],cantidad*-1);
                         saldo= aCB.solicitarSaldo(datos[1]);
                         mAE.println("Su saldo es -> "+(saldo-cantidad));
                     }else {
                         mAE.println("Saldo insuficiente "+(saldo));
                     }
                     break;
                     case "3":aCB.actualizarSaldo(datos[1],cantidad);
                     saldo= aCB.solicitarSaldo(datos[1]);
                     mAE.println("Su saldo es -> "+(saldo+cantidad));

                     break;
                 }
             }
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
                System.out.println(e.toString());
            } catch (ClassNotFoundException e) {
                System.out.println(e.toString());
            }
    }
}
