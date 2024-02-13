package com.corenetworks.presentacion;

import com.corenetworks.modelo.Camisa;
import com.corenetworks.modelo.Pantalon;
import com.corenetworks.modelo.Zapatos;

import java.io.*;
public class ProbarRop{
    public static void main(String[] args) {

        // Crear fichero datos ropa
        try (FileOutputStream fSalida = new FileOutputStream("ropa.dat");
             ObjectOutputStream ropa = new ObjectOutputStream(fSalida)) {

            // Instanciar datos ejercicio
            Pantalon p2 = new Pantalon("Vaquero");
            p2.vender("Vendido");
            ropa.writeObject(p2);

            Camisa c1 = new Camisa(true, 12.5);
            c1.vender("No vendido");
            ropa.writeObject(c1);

            Zapatos z1 = new Zapatos(10);
            z1.vender("Vendido");
            ropa.writeObject(z1);
            ropa.flush();
            ropa.close();
            fSalida.close();

        } catch (IOException e) {
        }

        // Leer datos desde el fichero
        try (FileInputStream fEntrada = new FileInputStream("ropa.dat");
             ObjectInputStream ropa = new ObjectInputStream(fEntrada)) {

            Pantalon p2 = (Pantalon) ropa.readObject();
            System.out.println(p2.toString());

            Camisa c1 = (Camisa) ropa.readObject();
            System.out.println(c1.toString());

            Zapatos z1 = (Zapatos) ropa.readObject();
            System.out.println(z1.toString());
            ropa.close();
            fEntrada.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }
}