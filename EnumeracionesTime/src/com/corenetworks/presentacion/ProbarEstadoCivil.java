package com.corenetworks.presentacion;

import com.corenetworks.modelo.EstadoCivil;
import com.corenetworks.modelo.EstadoCivilAvanzado;

public class ProbarEstadoCivil {
    public static void main(String[] args) {
        EstadoCivil emilio = EstadoCivil.SOLTERO;
        System.out.println("El Estado Civil de Emilio es: " + emilio);
        EstadoCivil laura = EstadoCivil.valueOf("CASADO");
        System.out.println("El Estado Civil de Laura es: " + laura);
        System.out.println("Las constantes de estadoCivil: ");
        for (EstadoCivil elemento : EstadoCivil.values()){
            System.out.println(elemento);
        }

        System.out.println("Las constantes de estadoCivil con for: ");
        for (int i = 0; i<EstadoCivil.values().length; i++){
            System.out.println(EstadoCivil.values()[i]);

        }
        System.out.println("Enumeraciones Avanzadas: ");
        EstadoCivilAvanzado luis = EstadoCivilAvanzado.CASADO;
        System.out.println("Estado Civil avanzado de Luis: " + luis);

        System.out.println("Recorrer el Estado Civil Avanzado: ");
        for (EstadoCivilAvanzado elemento: EstadoCivilAvanzado.values()){
            System.out.println(elemento);
            System.out.println(elemento.getDescripcion());
            System.out.println(elemento.name());
            System.out.println(elemento.toString());
            System.out.println(elemento.ordinal());

        }

    }
}
