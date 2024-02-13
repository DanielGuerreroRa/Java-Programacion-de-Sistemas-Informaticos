package com.corenetworks.modelo;

public class Pedido {
    private int idPedido;
    private double importe;
    private char formaDePago;
    public double calcularIva(double porcentaje){
        return importe * porcentaje;
    }
    public String mostrarInfo(){
        return "Id Pedido: " + idPedido + " Importe: " + importe + " Forma de pago: " + formaDePago;
    }

    public void setIdPedido(int idPedido){
        this.idPedido=idPedido;
    }
    public void setImporte(double importe){
        this.importe=importe;
    }
    public void setFormaDePago(char formaDePago){
        this.formaDePago=formaDePago;
    }
    public int getIdPedido(){
        return idPedido;
    }
    public double getImporte(){
        return importe;
    }
    public char getFormaDePago(){
        return formaDePago;
    }





    }

