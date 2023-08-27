package org.example.controlador;

import java.awt.event.MouseAdapter;

import org.example.Vista.ventana;
import org.w3c.dom.events.MouseEvent;

public class controlbotones2 extends MouseAdapter{
    private ventana view2;

    public controlbotones2(ventana view2) {
        this.view2 = view2;
        this.view2.getBotonregresar().addMouseListener(this);
    }

//Documento esto para q jale sin pedos el programa pero en si esta oparte es para el boton de regresar 
//trabajo en ello.

/*\
    public void mouseClicked(MouseEvent e) {
        if (e.getSource==this.view2.getBotonregresar()) {
            System.out.println("evento sobre boton regresar");
        
        }


    }*/

        
    
}
