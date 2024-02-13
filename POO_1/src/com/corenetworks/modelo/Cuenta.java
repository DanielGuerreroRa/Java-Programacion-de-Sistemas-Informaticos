package com.corenetworks.modelo;

public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;

    //Metodos

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingreso(double importe) {
        if (importe>0) {
            cantidad = cantidad + importe;



        }
    }

    public void retirar(double importe) {
        if (importe<cantidad) {
            cantidad = cantidad - importe;


        }
    }

        //Constructores

    public Cuenta(String titular) {
            this.titular = titular;
        }

    public Cuenta(String titular, double cantidad){
            this.titular = titular;
            this.cantidad = cantidad;
        }
        //Getters y Setters

        public String getTitular () {
            return titular;
        }

        public void setTitular (String titular){
            this.titular = titular;
        }

        public double getCantidad () {
            return cantidad;
        }

        public void setCantidad ( double cantidad){
            this.cantidad = cantidad;
        }
}

