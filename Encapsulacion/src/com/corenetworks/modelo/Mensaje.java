package com.corenetworks.modelo;

public class Mensaje {
    private String saludo;
    private String ipOrigen;
    private String ipDestino;
    public String mostrarInfo(){
        return "El Saludo es: " + saludo + ". El origen: -> " + ipOrigen + ". El destino es: " + ipDestino;
    }

    public int numeroDePalabras(){
        String[]palabras= saludo.split(" ");
        return palabras.length;
    }
    public void setSaludo(String saludo){
        this.saludo=saludo;
    }
    public void setIpOrigen(String ipOrigen){
        this.ipOrigen=ipOrigen;
    }
    public void setIpDestino(String ipDestino){
        this.ipDestino=ipDestino;
    }
    public String getSaludo(){
        return saludo;
    }
    public String getIpOrigen(){
        return ipOrigen;
    }
    public String getIpDestino(){
        return ipDestino;
    }
}
