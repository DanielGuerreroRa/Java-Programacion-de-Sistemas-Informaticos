package com.corenetworks.modelo;

public class Conductor implements IVehiculo {
    //Atributos
    private IVehiculo vehiculo;

    //Métodos

    @Override
    public String moverse() {
        return null;
    }

    public String conducir(){
        return "El coche se está moviendo";

    }
    public String conducir(IVehiculo vehiculo){
        return "El coche se está moviendo";

    }
    //Constructores


    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    //Setters y Getters

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
