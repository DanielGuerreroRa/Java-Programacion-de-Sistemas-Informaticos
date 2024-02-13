package com.corenetworks.modelo;

public class HidroAvion implements IObjetoVolador, INautico{

    //Métoodos

    @Override
    public String toString() {
        return "HidroAvion{}";
    }

    @Override
    public String atracar() {
        return "El Hidroavión esta atracando";
    }

    @Override
    public String navegar() {
        return "El Hidroavión esta navegando";
    }

    @Override
    public String despegar() {
        return "El Hidroavión esta despegando";
    }

    @Override
    public String volar() {
        return "El Hidroavión esta volando";
    }

    @Override
    public String aterrizar() {
        return "El Hidroavión esta aterrizando";
    }
}
