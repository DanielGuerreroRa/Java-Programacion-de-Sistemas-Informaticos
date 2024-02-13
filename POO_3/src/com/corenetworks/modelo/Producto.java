package com.corenetworks.modelo;

import java.util.Objects;

public class Producto implements Comparable {
    //Atributos
    private int id;
    private  int cantidadExistencias;
    private double precio;

    //Métodos
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", cantidadExistencias=" + cantidadExistencias +
                ", precio=" + precio +
                '}'+"\n";
    }
    @Override
    public int compareTo(Object o)  {
        Producto parametro = null;
        if (o instanceof Producto) {
             parametro = (Producto) o;
        }
            if (cantidadExistencias>parametro.getCantidadExistencias()){
                return 1;
            } else if (cantidadExistencias==parametro.getCantidadExistencias()) {
                return 0;
            }else {
                return -1;
            }
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && cantidadExistencias == producto.cantidadExistencias && Double.compare(precio, producto.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidadExistencias, precio);
    }
    //Constructores

    public Producto() {
    }

    public Producto(int id, int cantidadExistencias, double precio) {
        this.id = id;
        this.cantidadExistencias = cantidadExistencias;
        this.precio = precio;
    }
    //Setters y Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadExistencias() {
        return cantidadExistencias;
    }

    public void setCantidadExistencias(int cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
