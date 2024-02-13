package com.corenetworks.modelo;

public class Ave implements IObjetoVolador{
    public static void main(String[] args) {
    }
    //Atributos



    //Métodos

    @Override
    public String toString() {
        return "Ave{}";
    }

    @Override
    public String despegar() {
        return "El ave esta despegando";
    }

    @Override
    public String volar() {
        return "El ave esta volando";
    }

    @Override
    public String aterrizar() {
        return "El ave esta aterrizando";
    }
    public String hacerNido(){
        return "El ave esta haciendo un nido";
    }
    public String ponerHuevo(){
        return "El ave esta poniendo huevo...";
    }
}
