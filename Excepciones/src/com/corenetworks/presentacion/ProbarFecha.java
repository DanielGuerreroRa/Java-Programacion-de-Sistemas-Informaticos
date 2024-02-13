package com.corenetworks.presentacion;

import com.corenetworks.modelo.Fecha;

public class ProbarFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha();
        try{
            f1.setMes(13);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        try {
            f2.setDia(40);
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }
    }
}
