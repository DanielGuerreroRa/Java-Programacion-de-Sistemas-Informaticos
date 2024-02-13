package com.corenetworks.modelo;

public class Proyeco {
    //Atributos:
    private int idProyecto;
    private String nombreProyecto;
    private double horas;
    private double tarifa;

    //Metodos
    //Sin parametros
    public double calcularImporte(){
        return horas*tarifa;
    }
    //Con parametros
    public double calcularImporte(double descuento){
        return calcularImporte() - (calcularImporte()*descuento);
    }

    @Override
    public String toString() {
        return "Proyeco{" +
                "idProyecto=" + idProyecto +
                ", nombreProyecto='" + nombreProyecto + '\'' +
                ", horas=" + horas +
                ", tarifa=" + tarifa +
                '}';
    }
    //Constructores

    public Proyeco() {
    }

    public Proyeco(int idProyecto, String nombreProyecto, double horas, double tarifa) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    //Setters y Getters

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
}
