package com.corenetworks.modelo;

public class Barcaza implements INautico{

    @Override
    public String toString() {
        return "Barcaza{}";
    }

    @Override
    public String atracar() {
        return "La Barcaza esta atracando";
    }

    @Override
    public String navegar() {
        return "La Barcaza esta navegando";
    }
}
