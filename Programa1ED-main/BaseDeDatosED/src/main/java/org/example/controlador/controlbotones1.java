package org.example.controlador;

import org.example.Vista.VentanaBaseDeDatos;
import org.example.Vista.ventana;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class controlbotones1 extends MouseAdapter {
    private VentanaBaseDeDatos view;

    public controlbotones1(VentanaBaseDeDatos view) {
        this.view = view;
        this.view.getBotonInicio().addMouseListener(this);
        this.view.getBotonSalir().addMouseListener(this);
        
    }
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==this.view.getBotonInicio()) {
            System.out.println("evento sobre boton inicio");
            ventana view2=new ventana("hola", null, view);

        }
        if(e.getSource()==this.view.getBotonSalir()){
            System.out.println("evento sobre boton salir");
            System.exit(0);

        }


    }
            
}
