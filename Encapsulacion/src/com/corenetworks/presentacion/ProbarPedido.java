package com.corenetworks.presentacion;

import com.corenetworks.modelo.Pedido;

import java.util.Scanner;

public class ProbarPedido {
    public static void main(String[] args) {
        //Declarar variables
        Pedido p1 = new Pedido();
        Scanner teclado = new Scanner(System.in);

        //Solicitar datos.
        System.out.println("Escriba el Id del pedidio -> ");
        p1.setIdPedido(teclado.nextInt());
        System.out.println("Escriba el importe -> ");
        p1.setImporte(teclado.nextDouble());
        System.out.println("Escriba la forma de pago -> ");
        p1.setFormaDePago(teclado.next().charAt(0));

        System.out.println(p1.mostrarInfo());

        System.out.println("El iva es: " + p1.calcularIva(0.21));


    }
}
