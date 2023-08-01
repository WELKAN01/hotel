/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorHabitacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Habitacion;


public class JFVHabitacion extends javax.swing.JFrame {

    ControladorHabitacion model = new ControladorHabitacion();
    int idSeleccionado = -1;

    public JFVHabitacion() {
        initComponents();
        listaHabitacion();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(153, 153, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "# Habitacion", "Tipo", "Descripcion", "Estado", "Precio"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 614, 169));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL - HABITACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 280, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fidelizacion_hotel-lujo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 710, 240));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("_");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 50, 30));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int fila = table.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        idSeleccionado = (Integer) dtm.getValueAt(fila, 0);
        String numero_ha = (String) dtm.getValueAt(fila, 1);
        String tipo = (String) dtm.getValueAt(fila, 2);
        String descrip = (String) dtm.getValueAt(fila, 3);
        String estado = (String) dtm.getValueAt(fila, 4);
        Double precio = (Double) dtm.getValueAt(fila, 5);


    }//GEN-LAST:event_tableMouseClicked

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = table.getSelectedRow();
            String cod;
            String valor;

            cod = table.getValueAt(fila, 0).toString();
            valor = table.getValueAt(fila, 1).toString();

            JFReserva.txtIDHabitacion.setText(cod);
            JFReserva.txtHabitacion.setText(valor);
            this.dispose();

        }
    }//GEN-LAST:event_tableMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void listaHabitacion() {
        List<Habitacion> data = model.listaHabitacion();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for (Habitacion c : data) {
            Object[] fila = {c.getId(),
                c.getNumero_ha(),
                c.getTipo_habitacion(),
                c.getDescripcion(),
                c.getEstado(),
                c.getPrecio_hab()};
            dtm.addRow(fila);
        }
        dtm.fireTableDataChanged();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVHabitacion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
