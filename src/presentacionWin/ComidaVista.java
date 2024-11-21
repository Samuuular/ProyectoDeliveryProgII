/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacionWin;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import logicaNegocio.GestionComidas;
import logicaNegocio.Logica;

/**
 *
 * @author EduPiry
 */
public class ComidaVista extends javax.swing.JInternalFrame {

    private GestionComidas comidas;
    private Logica logicaComidas;
    /**
     * Creates new form ComidaVista
     */
    public ComidaVista(Logica logicaDatos) {
        initComponents();
        logicaComidas = logicaDatos;
        comidas = new GestionComidas();
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
        textNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonRecetas = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("REGRISTO DE COMIDAS");

        jLabel2.setText("NOMBRE :");

        jLabel3.setText("RECETA :");

        botonRecetas.setText("RECETAS");
        botonRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecetasActionPerformed(evt);
            }
        });

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonRecetas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNombre)
                    .addComponent(botonRecetas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 142, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar)
                .addGap(141, 141, 141))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(botonRecetas))
                .addGap(18, 18, 18)
                .addComponent(botonGuardar)
                .addContainerGap(18, Short.MAX_VALUE))
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
        comidas.setComidas(logicaComidas.loadComidas());
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecetasActionPerformed
        // TODO add your handling code here:
        
        ListadoVista lr = new ListadoVista(logicaComidas);
        lr.setVisible(true);
        CasaDeComidasVista.obtenerEscritorio().add(lr);
        lr.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                // Este método se llama cuando se abre el JInternalFrame
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // Este método se llama cuando se cierra el JInternalFrame
                
                
                // Realiza aquí las acciones que deseas cuando se cierra
                // por ejemplo, actualizaciones o notificaciones.
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // Este método se llama después de que el JInternalFrame se haya cerrado
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se minimiza
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se restaura desde la minimización
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se activa (gana el foco)
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se desactiva (pierde el foco)
            }
        });
        
    }//GEN-LAST:event_botonRecetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonRecetas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
