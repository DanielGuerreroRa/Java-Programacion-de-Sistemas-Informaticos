package com.corenetworks.modelo;

public class TablaMultimplicar {
    //1. Atrubutos:
    private int tablas;
    //2. Metodos:
    public String tablasMultiplicar(){
        String resultado = "";
        for (int i = 1; i <=10; i++){
            resultado += tablas + " x " + i + " = " + (tablas*i) + "\n";
        }
        return resultado;
   }
   //3. Constructor:
    public TablaMultimplicar(){

    }
   public TablaMultimplicar(int tablas){
        this.tablas=tablas;
   }
   //4.Setters y Getters

    public int getTablas() {
        return tablas;
    }

    public void setTablas(int tablas) {
        this.tablas = tablas;
    }
}

