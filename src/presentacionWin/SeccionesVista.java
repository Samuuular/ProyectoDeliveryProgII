/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacionWin;

import java.util.ArrayList;
import java.util.List;
import logicaNegocio.GestionIngredientes;
import logicaNegocio.Logica;
import logicaNegocio.PoliticaEnsaladas;
import logicaNegocio.PoliticaGourmet;
import logicaNegocio.PoliticaHorneadas;
import logicaNegocio.PoliticaLimitePedidos;
import logicaNegocio.PoliticaPostres;
import logicaNegocio.SeccionCocina;
import logicaNegocio.SeccionEnsaladas;
import logicaNegocio.SeccionGourmet;
import logicaNegocio.SeccionHorneadas;
import logicaNegocio.SeccionLimitePedidos;
import logicaNegocio.SeccionPostres;

/**
 *
 * @author EduPiry
 */
public class SeccionesVista extends javax.swing.JInternalFrame {

    private Logica logicaSecciones;
    private List<SeccionCocina> listaSecciones;
    /**
     * Creates new form SeccionesVista
     */
    public SeccionesVista(Logica logicaDatos) {
        initComponents();
        listaSecciones = new ArrayList();
        logicaSecciones = logicaDatos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboNombre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        verIngredientes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        verRecetasPendientes = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("REGISTRO DE SECCIONES");

        jLabel2.setText("NOMBRE :");

        comboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("INGREDIENTES :");

        verIngredientes.setText("VER INGREDIENTES");

        jLabel5.setText("RECETAS PENDIENTES :");

        verRecetasPendientes.setText("VER RECETAS PENDIENTES");

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(verIngredientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(verRecetasPendientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboNombre, 0, 211, Short.MAX_VALUE)
                    .addComponent(verIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verRecetasPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(botonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(verIngredientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(verRecetasPendientes))
                .addGap(43, 43, 43)
                .addComponent(botonGuardar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        listaSecciones = logicaSecciones.loadSeccionesCocinas();
        GestionIngredientes gi = new GestionIngredientes();
        gi.setIngredientes(logicaSecciones.loadIngredientes());
        SeccionCocina seccion;
        if(comboNombre.getSelectedItem().toString().equalsIgnoreCase("ensaladas")){
            seccion = new SeccionEnsaladas();
            seccion.setPolitica(new PoliticaEnsaladas());
            seccion.setIngredientes(gi);
        }else if(comboNombre.getSelectedItem().toString().equalsIgnoreCase("gourmet")){
            seccion = new SeccionGourmet();
            seccion.setPolitica(new PoliticaGourmet());
            seccion.setIngredientes(gi);
        }else if(comboNombre.getSelectedItem().toString().equalsIgnoreCase("horneadas")){
            seccion = new SeccionHorneadas();
            seccion.setPolitica(new PoliticaHorneadas());
            seccion.setIngredientes(gi);
        }else if(comboNombre.getSelectedItem().toString().equalsIgnoreCase("con limite de pedidos")){
            seccion = new SeccionLimitePedidos(logicaSecciones.loadRecetasPendientes().size());
            seccion.setPolitica(new PoliticaLimitePedidos(15,logicaSecciones.loadRecetas().size()));
            seccion.setIngredientes(gi);
        }else if(comboNombre.getSelectedItem().toString().equalsIgnoreCase("postres")){
            seccion = new SeccionPostres();
            seccion.setPolitica(new PoliticaPostres());
            seccion.setIngredientes(gi);
        }
        
        
    }//GEN-LAST:event_botonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> comboNombre;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton verIngredientes;
    private javax.swing.JButton verRecetasPendientes;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo1(){
        comboNombre.removeAllItems();
        comboNombre.addItem("Ensaladas");
        comboNombre.addItem("Gourmet");
        comboNombre.addItem("Horneadas");
        comboNombre.addItem("Con Limite de Pedidos");
        comboNombre.addItem("Postres");
    }
    

}
