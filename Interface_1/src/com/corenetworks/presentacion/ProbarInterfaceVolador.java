package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarInterfaceVolador {
    public static void main(String[] args) {
        //Instanciar un avión con nombre de objeto ax2.
        Avion ax2 = new Avion("plata");
        //Polimorfismo
        IObjetoVolador ax3 = new Avion("rojo");
        IObjetoVolador ave1 = new Ave();
        IObjetoVolador superman1 = new Superman();
        IObjetoVolador ha1 = new HidroAvion();
        IObjetoVolador[] volaores = {ax2, ax3, ave1, superman1, ha1};


        for (IObjetoVolador elemento : volaores) {
            System.out.println(elemento.toString());
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar());

            if (elemento instanceof Ave) {
                System.out.println(((Ave) elemento).ponerHuevo());
                System.out.println(((Ave) elemento).hacerNido());
            }
            if (elemento instanceof Superman) {
                System.out.println(((Superman) elemento).detenerBalas());
                System.out.println(((Superman) elemento).saltarEdificio());
            }
            if (elemento instanceof HidroAvion) {
                System.out.println(((HidroAvion) elemento).atracar());
                System.out.println(((HidroAvion) elemento).navegar());

            }
        }
        INautico b1 = new Barcaza();
        INautico[] nauticos = {b1, (INautico) ha1};

        for (INautico elemento : nauticos) {
            System.out.println(elemento.toString());
            System.out.println(elemento.atracar());
            System.out.println(elemento.navegar());
            if (elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).despegar());
                System.out.println(((HidroAvion) elemento).aterrizar());
                System.out.println(((HidroAvion) elemento).volar());
            }
        }
    }
}
