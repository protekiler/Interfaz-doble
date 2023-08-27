package org.example.Vista;

import javax.swing.*;
import java.awt.*;
    public class VentanaBaseDeDatos extends JFrame {
        private JPanel Panel1;
        private JPanel Panel2;
        private JPanel PanelSalir;
        private JPanel PanelInicio;
        private JPanel PanelBaseDeDatos;
        private JPanel PanelEdicion;
        private JLabel lblnombre;
        private JLabel lblId;
        private JLabel lblApellido;
        private JLabel lblNombre2;
        private JLabel lblApellido2;
        private JLabel lblId2;
        private JTextField txtNombre;
        private JTextField txtNombre2;
        private JTextField txtApellido;
        private JTextField txtApellido2;
        private JTextField txtId;
        private JTextField txtId2;
        private JButton botonInicio;
        private JButton botonSalir;
        private JButton botonCargar;
        private JButton botonAgregar;
        private JButton botonActualizar;
        private JTable TblPersona;
        private JScrollPane scroll;
        private CardLayout layout;
        private JPanel contentPane;

        public VentanaBaseDeDatos(String title) throws HeadlessException {
            super(title);
            this.setSize(1000,800);
            layout=new CardLayout(2,1);
            contentPane.setLayout(layout);
            contentPane=new JPanel();


            JPanel panelInicio = new JPanel();
            JPanel panelBaseDeDatos = new JPanel();
            JPanel panelEdicion = new JPanel();

            contentPane.add(panelInicio, "INICIO");
            contentPane.add(panelBaseDeDatos, "BASEDEDATOS");
            contentPane.add(panelEdicion, "EDICION");

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        public VentanaBaseDeDatos(JPanel panel1, JPanel panel2, JPanel panelSalir, JPanel panelInicio, JPanel panelBaseDeDatos, JPanel panelEdicion, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JTable tblPersona, JScrollPane scroll, CardLayout layout, JPanel contentPane) throws HeadlessException {
            Panel1 = panel1;
            Panel2 = panel2;
            PanelSalir = panelSalir;
            PanelInicio = panelInicio;
            PanelBaseDeDatos = panelBaseDeDatos;
            PanelEdicion = panelEdicion;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            TblPersona = tblPersona;
            this.scroll = scroll;
            this.layout = layout;
            this.contentPane = contentPane;
        }

        public VentanaBaseDeDatos(GraphicsConfiguration gc, JPanel panel1, JPanel panel2, JPanel panelSalir, JPanel panelInicio, JPanel panelBaseDeDatos, JPanel panelEdicion, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JTable tblPersona, JScrollPane scroll, CardLayout layout, JPanel contentPane) {
            super(gc);
            Panel1 = panel1;
            Panel2 = panel2;
            PanelSalir = panelSalir;
            PanelInicio = panelInicio;
            PanelBaseDeDatos = panelBaseDeDatos;
            PanelEdicion = panelEdicion;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            TblPersona = tblPersona;
            this.scroll = scroll;
            this.layout = layout;
            this.contentPane = contentPane;
        }

        public VentanaBaseDeDatos(String title, JPanel panel1, JPanel panel2, JPanel panelSalir, JPanel panelInicio, JPanel panelBaseDeDatos, JPanel panelEdicion, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JTable tblPersona, JScrollPane scroll, CardLayout layout, JPanel contentPane) throws HeadlessException {
            super(title);
            Panel1 = panel1;
            Panel2 = panel2;
            PanelSalir = panelSalir;
            PanelInicio = panelInicio;
            PanelBaseDeDatos = panelBaseDeDatos;
            PanelEdicion = panelEdicion;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            TblPersona = tblPersona;
            this.scroll = scroll;
            this.layout = layout;
            this.contentPane = contentPane;
        }

        public VentanaBaseDeDatos(String title, GraphicsConfiguration gc, JPanel panel1, JPanel panel2, JPanel panelSalir, JPanel panelInicio, JPanel panelBaseDeDatos, JPanel panelEdicion, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JTable tblPersona, JScrollPane scroll, CardLayout layout, JPanel contentPane) {
            super(title, gc);
            Panel1 = panel1;
            Panel2 = panel2;
            PanelSalir = panelSalir;
            PanelInicio = panelInicio;
            PanelBaseDeDatos = panelBaseDeDatos;
            PanelEdicion = panelEdicion;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            TblPersona = tblPersona;
            this.scroll = scroll;
            this.layout = layout;
            this.contentPane = contentPane;
        }

        public JPanel getPanel1() {
            return Panel1;
        }

        public void setPanel1(JPanel panel1) {
            Panel1 = panel1;
        }

        public JPanel getPanel2() {
            return Panel2;
        }

        public void setPanel2(JPanel panel2) {
            Panel2 = panel2;
        }

        public JPanel getPanelSalir() {
            return PanelSalir;
        }

        public void setPanelSalir(JPanel panelSalir) {
            PanelSalir = panelSalir;
        }

        public JPanel getPanelInicio() {
            return PanelInicio;
        }

        public void setPanelInicio(JPanel panelInicio) {
            PanelInicio = panelInicio;
        }

        public JPanel getPanelBaseDeDatos() {
            return PanelBaseDeDatos;
        }

        public void setPanelBaseDeDatos(JPanel panelBaseDeDatos) {
            PanelBaseDeDatos = panelBaseDeDatos;
        }

        public JPanel getPanelEdicion() {
            return PanelEdicion;
        }

        public void setPanelEdicion(JPanel panelEdicion) {
            PanelEdicion = panelEdicion;
        }

        public JLabel getLblnombre() {
            return lblnombre;
        }

        public void setLblnombre(JLabel lblnombre) {
            this.lblnombre = lblnombre;
        }

        public JLabel getLblId() {
            return lblId;
        }

        public void setLblId(JLabel lblId) {
            this.lblId = lblId;
        }

        public JLabel getLblApellido() {
            return lblApellido;
        }

        public void setLblApellido(JLabel lblApellido) {
            this.lblApellido = lblApellido;
        }

        public JLabel getLblNombre2() {
            return lblNombre2;
        }

        public void setLblNombre2(JLabel lblNombre2) {
            this.lblNombre2 = lblNombre2;
        }

        public JLabel getLblApellido2() {
            return lblApellido2;
        }

        public void setLblApellido2(JLabel lblApellido2) {
            this.lblApellido2 = lblApellido2;
        }

        public JLabel getLblId2() {
            return lblId2;
        }

        public void setLblId2(JLabel lblId2) {
            this.lblId2 = lblId2;
        }

        public JTextField getTxtNombre() {
            return txtNombre;
        }

        public void setTxtNombre(JTextField txtNombre) {
            this.txtNombre = txtNombre;
        }

        public JTextField getTxtNombre2() {
            return txtNombre2;
        }

        public void setTxtNombre2(JTextField txtNombre2) {
            this.txtNombre2 = txtNombre2;
        }

        public JTextField getTxtApellido() {
            return txtApellido;
        }

        public void setTxtApellido(JTextField txtApellido) {
            this.txtApellido = txtApellido;
        }

        public JTextField getTxtApellido2() {
            return txtApellido2;
        }

        public void setTxtApellido2(JTextField txtApellido2) {
            this.txtApellido2 = txtApellido2;
        }

        public JTextField getTxtId() {
            return txtId;
        }

        public void setTxtId(JTextField txtId) {
            this.txtId = txtId;
        }

        public JTextField getTxtId2() {
            return txtId2;
        }

        public void setTxtId2(JTextField txtId2) {
            this.txtId2 = txtId2;
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

        public JButton getBotonCargar() {
            return botonCargar;
        }

        public void setBotonCargar(JButton botonCargar) {
            this.botonCargar = botonCargar;
        }

        public JButton getBotonAgregar() {
            return botonAgregar;
        }

        public void setBotonAgregar(JButton botonAgregar) {
            this.botonAgregar = botonAgregar;
        }

        public JButton getBotonActualizar() {
            return botonActualizar;
        }

        public void setBotonActualizar(JButton botonActualizar) {
            this.botonActualizar = botonActualizar;
        }

        public JTable getTblPersona() {
            return TblPersona;
        }

        public void setTblPersona(JTable tblPersona) {
            TblPersona = tblPersona;
        }

        public JScrollPane getScroll() {
            return scroll;
        }

        public void setScroll(JScrollPane scroll) {
            this.scroll = scroll;
        }

        @Override
        public CardLayout getLayout() {
            return layout;
        }

        public void setLayout(CardLayout layout) {
            this.layout = layout;
        }

        @Override
        public JPanel getContentPane() {
            return contentPane;
        }

        public void setContentPane(JPanel contentPane) {
            this.contentPane = contentPane;
        }

        @Override
        public String toString() {
            return "VentanaBaseDeDatos{" +
                    "Panel1=" + Panel1 +
                    ", Panel2=" + Panel2 +
                    ", PanelSalir=" + PanelSalir +
                    ", PanelInicio=" + PanelInicio +
                    ", PanelBaseDeDatos=" + PanelBaseDeDatos +
                    ", PanelEdicion=" + PanelEdicion +
                    ", lblnombre=" + lblnombre +
                    ", lblId=" + lblId +
                    ", lblApellido=" + lblApellido +
                    ", lblNombre2=" + lblNombre2 +
                    ", lblApellido2=" + lblApellido2 +
                    ", lblId2=" + lblId2 +
                    ", txtNombre=" + txtNombre +
                    ", txtNombre2=" + txtNombre2 +
                    ", txtApellido=" + txtApellido +
                    ", txtApellido2=" + txtApellido2 +
                    ", txtId=" + txtId +
                    ", txtId2=" + txtId2 +
                    ", botonInicio=" + botonInicio +
                    ", botonSalir=" + botonSalir +
                    ", botonCargar=" + botonCargar +
                    ", botonAgregar=" + botonAgregar +
                    ", botonActualizar=" + botonActualizar +
                    ", TblPersona=" + TblPersona +
                    ", scroll=" + scroll +
                    ", layout=" + layout +
                    ", contentPane=" + contentPane +
                    '}';
        }

        public void limpiar(){
            txtNombre.setText("");
            txtApellido.setText("");
            }
    }

