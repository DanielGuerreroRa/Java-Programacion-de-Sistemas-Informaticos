package com.corenetworks.presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor;
import com.corenetworks.modelo.IVehiculo;

public class ProbarVehiculo {
    public static void main(String[] args) {

    Coche1 c1 = new Coche1(20);
    Conductor c2 = new Conductor(c1);
        System.out.println(c2.conducir());


}
}






