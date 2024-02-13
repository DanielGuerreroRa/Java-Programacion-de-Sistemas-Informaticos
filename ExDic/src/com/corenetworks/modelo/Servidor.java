package com.corenetworks.modelo;
import java.util.ArrayList;
public class Servidor {
    //Atributos
    private String[] ip;

    //Métodos


    //public String leerPaquetes(Paquete[] paquetes) {}

    public boolean verificarPaquetes(Paquete[] paquetes)
    {
        return true;
    }

    //Constructores


    public Servidor() {
    }

    public Servidor(String[] ip) {
        this.ip = ip;
    }


    //Setters y Getters


    public String[] getIp() {
        return ip;
    }

    public void setIp(String[] ip) {
        this.ip = ip;
    }
}
