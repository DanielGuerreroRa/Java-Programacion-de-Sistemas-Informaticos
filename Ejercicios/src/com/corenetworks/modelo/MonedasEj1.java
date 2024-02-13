package com.corenetworks.modelo;

public class MonedasEj1 {
    public final float b50 = 50;
    public final float b20 = 20;

    public final float b10 = 10;

    public final float b5 =5;

    public final float m1 = 1;
    public final float mc50 = 0.5f;
    public final float mc20 = 0.2f;

    public final float mc10 = 0.1f;
    public final float mc5 = 0.05f;

    public final float mc2 = 0.02f;
    public final float mc1 =0.01f;

    public String cambioBilletes(float pago, float cobra){
        String literalCambio="";
        float cambio;
        cambio = pago - cobra;
        //para saber cuantos billetes de 50 son necesarios
        if (cambio / b50 >= 1)
        {
            //Obtiene los billetes de 50
            //la función floor obtiene el entero más bajo de un número con decimales
            literalCambio += Math.floor(cambio/b50)+ " billete(s) de 50, ";
            //Obtiene el resto para saber cuanto falta del cambio.
            cambio = cambio % b50;
        }
        if (cambio / b20 >= 1)
        {
            literalCambio += Math.floor(cambio/b20)+ " billete(s) de 20, ";
            cambio = cambio % b20;
        }
        if (cambio / b10 >= 1)
        {
            literalCambio += Math.floor(cambio/b10)+ " billete(s) de 10, ";
            cambio = cambio % b10;
        }
        if (cambio / b5 >= 1)
        {
            literalCambio += Math.floor(cambio/b5)+ " billete(s) de 5, ";
            cambio = cambio % b5;
        }
        if (cambio / m1 >= 1)
        {
            literalCambio += Math.floor(cambio/m1)+ " moneda(s) de 1, ";
            cambio = cambio % m1;
        }
        if (cambio / mc50 >= 1)
        {
            literalCambio += Math.floor(cambio/mc50)+ " moneda(s) de 50 céntimos, ";
            cambio = cambio % mc50;
        }
        if (cambio / mc20 >= 1)
        {
            literalCambio += Math.floor(cambio/mc20)+ " moneda(s) de 20 céntimos, ";
            cambio = cambio % mc20;
        }
        if (cambio / mc10 >= 1)
        {
            literalCambio += Math.floor(cambio/mc10)+ " moneda(s) de 10 céntimos, ";
            cambio = cambio % mc10;
        }
        if (cambio / mc5 >= 1)
        {
            literalCambio += Math.floor(cambio/mc5)+ " moneda(s) de 5 céntimos, ";
            cambio = cambio % mc5;
        }
        if (cambio / mc2 >= 1)
        {
            literalCambio += Math.floor(cambio/mc2)+ " moneda(s) de 2 céntimos, ";
            cambio = cambio % mc2;
        }
        literalCambio += Math.round(cambio * 100) + " moneda(s) de 1 céntimo. ";
        return literalCambio;

    }





}
