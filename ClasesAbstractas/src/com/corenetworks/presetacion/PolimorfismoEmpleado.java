package com.corenetworks.presetacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class PolimorfismoEmpleado {
    public static void main(String[] args) {
        //Probar plimorfismo
        Gerente g1 = new Gerente("Jose", 2_000, 500);
        Empleado e1 = new Gerente("Raúl",3_000,700);
        System.out.println("Calcular nómina: " + e1.calcularNomina());
        System.out.println(e1.toString());
        Gerente g2 = (Gerente) e1;
        System.out.println("Bono: " + g2.getBono());

        Empleado e2 = new Vendedor("Luis", 1_500,20_000,0.01);
        System.out.println("Calcular nómina: " + e2.calcularNomina());
        System.out.println(e2.toString());

        Empleado e3 =new Operador("Pedro",1_000,1_000,0.02);
        System.out.println("Calcular nómina: " + e3.calcularNomina());
        System.out.println(e3.toString());

        Empleado[] empleados = new Empleado[3];
        empleados[0] = e1;
        empleados[1] = e2;
        empleados[2] = e3;

        for (Empleado elemento:empleados){
            if(elemento instanceof Empleado) {
                System.out.println("Entra al bucle --");
            }
            if (elemento instanceof Gerente) {
                System.out.println("Bono: " + ((Gerente) elemento).getBono()); //elemento.getBono
            }
            if (elemento instanceof Vendedor){
                System.out.println("Vendedor: " + ((Vendedor) elemento).getVentas()); //elemento.getVentas
            }
            if (elemento instanceof Operador){
                System.out.println("Operador: " + ((Operador) elemento).getPiezas()); //elemento.getOperador
            }
            System.out.println("Calcular nómina: " + elemento.calcularNomina());
            System.out.println(elemento.toString());

        }
    }
}
