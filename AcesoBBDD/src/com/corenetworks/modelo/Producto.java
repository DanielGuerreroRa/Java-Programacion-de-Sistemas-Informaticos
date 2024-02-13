package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    private int IdProducto;
    private String nombrePrpdicto;
    private double precioUnitario;
    private int unidadesStock;

    //Métodos

    @Override
    public String toString() {
        return "Producto{" +
                "IdProducto=" + IdProducto +
                ", nombrePrpdicto='" + nombrePrpdicto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return IdProducto == producto.IdProducto && Double.compare(precioUnitario, producto.precioUnitario) == 0 && unidadesStock == producto.unidadesStock && Objects.equals(nombrePrpdicto, producto.nombrePrpdicto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdProducto, nombrePrpdicto, precioUnitario, unidadesStock);
    }
    //Contructor
    public Producto() {
    }
    public Producto(int idProducto, String nombrePrpdicto, double precioUnitario, int unidadesStock) {
        IdProducto = idProducto;
        this.nombrePrpdicto = nombrePrpdicto;
        this.precioUnitario = precioUnitario;
        this.unidadesStock = unidadesStock;
    }
    //Setters y Getters

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getNombrePrpdicto() {
        return nombrePrpdicto;
    }

    public void setNombrePrpdicto(String nombrePrpdicto) {
        this.nombrePrpdicto = nombrePrpdicto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }
}
