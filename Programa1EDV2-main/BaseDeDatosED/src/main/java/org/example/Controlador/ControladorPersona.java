package org.example.Controlador;

import org.example.Vista.VentanaBaseDeDatos;
import org.example.modelo.ModeloTablaPersona;
import org.example.modelo.Persona;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.lang.System.*;

public class ControladorPersona extends MouseAdapter {
    private VentanaBaseDeDatos view;
    private ModeloTablaPersona modelo;

    public ControladorPersona(VentanaBaseDeDatos view) {
        this.view = view;
        modelo=new ModeloTablaPersona();
        this.view.getTblPersona().setModel(modelo);
        this.view.getTblPersona().addMouseListener(this);
        this.view.getBotonCargar().addMouseListener(this);
        this.view.getBotonAgregar().addMouseListener(this);
        this.view.getBotonActualizar().addMouseListener(this);
        this.view.getBotonSalir().addActionListener(e-> System.exit(0));
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        if(e.getSource()==this.view.getBotonCargar()){
            modelo.cargarDatos();
            this.view.getTblPersona().setModel(modelo);
            this.view.getTblPersona().updateUI();
        }

        if (e.getSource()==this.view.getBotonAgregar()){
            Persona persona=new Persona();
            persona.setId(0);
            persona.setNombre(this.view.getTxtNombre().getText());
            persona.setApellido(this.view.getTxtApellido().getText());
            if(modelo.agregarAnimal(persona)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblPersona().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos.Por favor revise su conexion","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==this.view.getBotonActualizar()){
            out.println("Evento sobre botòn Actualizar");
            int rowIndex = this.view.getTblPersona().getSelectedRow();
            Persona tmp = modelo.getPersonaIndex(rowIndex);
            Persona persona = new Persona();

            persona.setNombre(this.view.getTxtNombre2().getText());
            persona.setApellido(this.view.getTxtApellido2().getText());
            persona.setId(tmp.getId());
            if (modelo.ActualizarPersona(persona)){
                JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.view.getTblPersona().setModel(modelo);
                this.view.getTblPersona().updateUI();
            }else{
                JOptionPane.showMessageDialog(view, "No se pudo modificar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblPersona().updateUI();

        if (e.getSource()==view.getTblPersona()){
            out.println("Evento sobre la tabla");
            int index=this.view.getTblPersona().getSelectedRow();
            Persona temp=modelo.getPersonaIndex(index);
            this.view.getTxtNombre2().setText(temp.getNombre());
            this.view.getTxtApellido2().setText(temp.getApellido());
        }
        this.view.limpiar();
    }
    }
}
