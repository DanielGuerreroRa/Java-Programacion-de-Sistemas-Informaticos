package com.corenetworks.presetacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class ProbarEmpleado {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Pedro",1700,350);
        System.out.println(g1.toString());
        System.out.println("El sueldo del Gerente es: " + g1.calcularNomina());
        Vendedor v1 = new Vendedor("Raul",1105,780,0.15);
        System.out.println(v1.toString());
        System.out.println("El sueldo del Vendedor es: " + v1.calcularNomina());
        Operador o1 = new Operador("Enrique",1200,812,0.20);
        System.out.println(o1.toString());
        System.out.println("El sueldo del Operador es: " + o1.calcularNomina());
    }
}
