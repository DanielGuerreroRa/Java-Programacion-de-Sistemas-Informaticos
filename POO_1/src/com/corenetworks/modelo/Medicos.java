package com.corenetworks.modelo;

public class Medicos {
    //Atributos
    private int idMedico;
    private String nombre;
    private String apellidos;
    private String cmp;

    //Metodos


    @Override
    public String toString() {
        return "Medicos{" +
                "idMedico=" + idMedico +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cmp=" + cmp +
                '}';
    }
    //Constructores


    public Medicos() {
    }

    public Medicos(int idMedico, String nombre, String apellidos, String cmp) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cmp = cmp;
    }
    //Getters y Setters


    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }
}
