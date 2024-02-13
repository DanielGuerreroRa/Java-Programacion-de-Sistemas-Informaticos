package com.corenetworks.modelo;

public class Coche1 implements IVehiculo {
    //Atributos
    private int deposito;

    //Métodos

    @Override
    public String toString() {
        return "Coche1{" +
                "deposito=" + deposito +
                '}';
    }

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se está moviendo";
        } else
            return "--SIN GASOLINA--";
    }
        //Constructor

            public Coche1() {
        }

             public Coche1( int deposito){
            this.deposito = deposito;
        }
        //Setters y Getters

        public int getDeposito () {
            return deposito;
        }

        public void setDeposito ( int deposito){
            this.deposito = deposito;

        }
    }



