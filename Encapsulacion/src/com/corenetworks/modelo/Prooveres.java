package com.corenetworks.modelo;

public class Prooveres {
    private int idProveedores;
    private String nombre;
    private String telefono;
    private int cantidadEmpleados;

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setCantidadEmpleados(int cantidadEmpleados){
        this.cantidadEmpleados=cantidadEmpleados;
    }
    public int getIdProveedores(){
        return idProveedores;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public int getCantidadEmpleados(){
        return cantidadEmpleados;
    }
}

