package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paciente;

public class PruebaPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.setIdPaciente(1);
        p1.setNombre("Carlos");
        p1.setApellidos("Espinosa Ruiz");
        p1.setDni("53825142N");
        p1.setDireccion("Calle Constitucion 13");
        p1.setTelefono("9167725104");
        p1.setEmail("espinosa.carlos@gmail.com");
        System.out.println(p1.toString());

        //Instanciar otra vez la clase
        Paciente p2 = new Paciente(2,"Manolo","Gonzalez","523625184G","Calle Real 45","915652515","gonzales_manolo@yahoo.es");
        System.out.println(p2.toString());

    }
}
