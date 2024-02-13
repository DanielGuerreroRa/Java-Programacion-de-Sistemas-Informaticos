package com.corenetworks.modelo;

public class Paquete {
    //Atributos
    private int ipOrigen;
    private int ipDestino;
    private String mensaje;
    private int contadorPaquetes;
    private int leerPaquete;
    //Métodos

    //Constructores

    public Paquete() {

    }

    public Paquete(int ipOrigen, int ipDestino, String mensaje, int contadorPaquetes) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contadorPaquetes = contadorPaquetes;
    }
//Setters y Getters


    public int getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(int ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public int getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(int ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}
