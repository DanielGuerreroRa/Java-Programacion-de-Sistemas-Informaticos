package com.corenetworks.presentacion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EJERCICIO3 {
    public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(1200)) {
         while (true) {
                Socket socket = serverSocket.accept();
            }

    } catch (IOException e) {
      System.out.println(e.toString());

      }
    }
}
