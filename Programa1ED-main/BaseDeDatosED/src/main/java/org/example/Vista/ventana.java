package org.example.Vista;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ventana extends JFrame{
    private GridLayout layout;
    private VentanaBaseDeDatos view;
    private JPanel Panel12;
    private JPanel Panel22;
    private JButton Botonregresar;

    public ventana(String arg0, GraphicsConfiguration arg1, VentanaBaseDeDatos view) {
        super(arg0, arg1);
        this.setSize(500, 500);
        layout=new GridLayout(2,1);
        this.getContentPane().setLayout(layout);

        /*aqui en teoria deberi de venir todo lo relacionado con la base de datos, 
        pero para hacer lo que necesitaba lo quite, solo es cuestion de reanexarlo en el panel 1 y dos */



        //panel11
        Panel12=new JPanel();
        this.getContentPane().add(Panel12,0);



        //Panel2    2
        Panel22=new JPanel();
        this.getContentPane().add(Panel22,0);
        Botonregresar=new JButton("Regresar");
        Panel22.add(Botonregresar);






        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        view.setVisible(false);
        
    }

    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JButton getBotonregresar() {
        return Botonregresar;
    }

    public void setBotonregresar(JButton botonregresar) {
        Botonregresar = botonregresar;
    }
    
    
    
}
