package com.corenetworks.presentacion;

import com.corenetworks.modelo.Bicicleta;
import com.corenetworks.modelo.BicicletaElectrica;
import com.corenetworks.modelo.Factura;

import java.time.LocalDate;

public class ProbarPOO {
    public static void main(String[] args) {
        //Instanciar una Factura
        Factura f1 = new Factura(1, LocalDate.now(),"Efectivo","Compañia de transporte",350);
        System.out.println(f1.toString());
        System.out.println(f1.calcularIva());
        System.out.println(f1.calcularIva(0.04));

        //Instanciar la Bicicleta con nombre del objeto b1
        Bicicleta b1 = new Bicicleta(2,13,14);
        System.out.println(b1.toString());
        b1.incrementar(5);
        System.out.println(b1.toString());

        BicicletaElectrica bE1 = new BicicletaElectrica(1,12,0,30);
        System.out.println(bE1.toString());
        bE1.incrementar(20);
        System.out.println(bE1.toString());

        //Polimorfismo
        Bicicleta b2 = bE1;
        //Aunque es una bicicleta electrica no podemos ver la potencia
        System.out.println(b2.getPinones());
        //Excepcion los metodos sobreescritos
        System.out.println(b2.toString());

    }
}
