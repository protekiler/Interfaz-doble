package org.example;

import org.example.Vista.VentanaBaseDeDatos;
import org.example.Vista.ventana;
import org.example.controlador.controlbotones1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaBaseDeDatos view=new VentanaBaseDeDatos("Estructura De Datos");
        //ventana ventana2=new ventana("Hola", null);
        controlbotones1 botones=new controlbotones1(view);

    }
}