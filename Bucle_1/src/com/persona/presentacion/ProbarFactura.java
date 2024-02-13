package com.persona.presentacion;

import com.persona.modelo.Factura;

import java.util.Scanner;

public class ProbarFactura {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        Factura  c1 = new Factura();
        System.out.println("Rellene los datos de la factura");
        System.out.println("Escriba el id de la factura -> ");
        c1.id= teclado.nextInt();
        System.out.println("Escribe el importe de la factura -> ");
        c1.importe= teclado.nextDouble();
        System.out.println("Escribe el nombre del cliente -> ");
        c1.cliente=teclado.next();
        System.out.println("Escribe la dirrección de entrega -> ");
        c1.direccion= teclado.next();

        System.out.println("El id factura: " + c1.id + " importe factura: " + c1.importe + " nombre cliente: " + c1.cliente + " direccion entrega: " + c1.direccion);
        c1.calcularIva();

        System.out.println("El iva es -> " + c1.calcularIva());
        System.out.println("El iva es -> " + c1.calcularIva(0.04));
    }

}
