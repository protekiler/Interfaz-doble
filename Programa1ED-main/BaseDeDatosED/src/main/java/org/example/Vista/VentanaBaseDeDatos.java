package org.example.Vista;

import javax.swing.*;
import java.awt.*;
    public class VentanaBaseDeDatos extends JFrame {
        private JPanel Panel1;
        private JPanel PanelSalir;
        private JPanel Panel2;
        private JButton botonInicio;
        private JButton botonSalir;
        private JScrollPane scroll;
        private GridLayout layout;

        public VentanaBaseDeDatos(String title) throws HeadlessException {
            super(title);
            this.setSize(1000,800);
            layout=new GridLayout(2,1);
            this.getContentPane().setLayout(layout);
            //panel1
            Panel1 =new JPanel(new BorderLayout());
            Panel1.setBackground(new Color(239,240,230));
            botonInicio=new JButton("Iniciar programa");
            Panel1.add(botonInicio,BorderLayout.CENTER);

            //Panel2
            Panel2=new JPanel(new BorderLayout());
            Panel2.setBackground(new Color(229, 253, 1));
            botonSalir=new JButton("Salir");
            Panel2.add(botonSalir,BorderLayout.CENTER);

            this.getContentPane().add(Panel1,0);
            this.getContentPane().add(Panel2,1);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);

        }

        public JPanel getPanel1() {
            return Panel1;
        }

        public void setPanel1(JPanel panel1) {
            Panel1 = panel1;
        }

        public JPanel getPanelSalir() {
            return PanelSalir;
        }

        public void setPanelSalir(JPanel panelSalir) {
            PanelSalir = panelSalir;
        }

        public JPanel getPanel2() {
            return Panel2;
        }

        public void setPanel2(JPanel panel2) {
            Panel2 = panel2;
        }

       

        public JButton getBotonInicio() {
            return botonInicio;
        }

        public void setBotonInicio(JButton botonInicio) {
            this.botonInicio = botonInicio;
        }

        public JButton getBotonSalir() {
            return botonSalir;
        }

        public void setBotonSalir(JButton botonSalir) {
            this.botonSalir = botonSalir;
        }

        public JScrollPane getScroll() {
            return scroll;
        }

        public void setScroll(JScrollPane scroll) {
            this.scroll = scroll;
        }

        @Override
        public GridLayout getLayout() {
            return layout;
        }

        public void setLayout(GridLayout layout) {
            this.layout = layout;
        }

        @Override
        public String toString() {
            return "VentanaBaseDeDatos{" +
                    "Panel1=" + Panel1 +
                    ", PanelSalir=" + PanelSalir +
                    ", Panel2=" + Panel2 +
                    ", botonInicio=" + botonInicio +
                    ", botonSalir=" + botonSalir +
                    ", scroll=" + scroll +
                    ", layout=" + layout +
                    '}';
        }
    }

