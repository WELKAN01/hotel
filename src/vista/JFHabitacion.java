package vista;

import controlador.ControladorHabitacion;
import java.util.List;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import modelo.Habitacion;
import java.awt.Color;

public class JFHabitacion extends javax.swing.JFrame {

    ControladorHabitacion model = new ControladorHabitacion();
    int idSeleccionado = -1;

    public JFHabitacion() {
        initComponents();
        listaHabitacion();
        this.setLocationRelativeTo(this);
        this.txtTipo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        txtN_Habitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtEstado = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        Boxtipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL - HABITACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 186, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Número");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 97, -1, -1));

        txtDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 183, 118, -1));
        getContentPane().add(txtN_Habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 94, 118, -1));

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
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 490, 380));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 287, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 238, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(java.awt.Color.lightGray);
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("_");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 50, 30));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setBackground(new java.awt.Color(0, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        btnActualizar.setBackground(java.awt.Color.green);
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        btnEliminar.setBackground(java.awt.Color.red);
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        jPanel3.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 118, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 118, -1));
        jPanel3.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 118, -1));

        Boxtipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Boxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----TIPO-----", "PREMIUM", "FAMILIAR", "VIP", "SOLO" }));
        Boxtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxtipoActionPerformed(evt);
            }
        });
        jPanel3.add(Boxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 116, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Tipo");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 66, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 340));

        jLabel7.setBackground(new java.awt.Color(0, 204, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fidelizacion_hotel-lujo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String numero_ha = txtN_Habitacion.getText().trim();
        String t=Boxtipo.getSelectedItem().toString();
        String tipo = txtTipo.getText().trim();
        String descrip = txtDescrip.getText().trim();
        String estado = txtEstado.getText().trim();
        String precio = txtPrecio.getText().trim();
        
        Habitacion obj = new Habitacion();
        if (t!="-----TIPO-----") {
        obj.setNumero_ha(numero_ha);
        obj.setTipo_habitacion(t);
        obj.setDescripcion(descrip);
        obj.setEstado(estado);
        obj.setPrecio_hab(Double.parseDouble(precio));
        
        model.insertarHabitacion(obj);
        txtN_Habitacion.setText("");
        txtTipo.setText("");
        txtDescrip.setText("");
        txtEstado.setText("");
        txtPrecio.setText("");
        txtN_Habitacion.requestFocus();
        listaHabitacion();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String numero_ha = txtN_Habitacion.getText().trim();
        String t=Boxtipo.getSelectedItem().toString();
        String tipo = txtTipo.getText().trim();
        String descrip = txtDescrip.getText().trim();
        String estado = txtEstado.getText().trim();
        String precio = txtPrecio.getText().trim();
        
        Habitacion obj = new Habitacion();
        obj.setId(idSeleccionado);
        obj.setNumero_ha(numero_ha);
        obj.setTipo_habitacion(t);
        obj.setDescripcion(descrip);
        obj.setEstado(estado);
        obj.setPrecio_hab(Double.parseDouble(precio));
        
        model.actualizarHabitacion(obj);
        listaHabitacion();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        model.eliminarHabitacion(idSeleccionado);
        listaHabitacion();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int fila = table.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        idSeleccionado = (Integer) dtm.getValueAt(fila, 0);
        String numero_ha = (String) dtm.getValueAt(fila, 1);
        String tipo = (String) dtm.getValueAt(fila, 2);
        String descrip = (String) dtm.getValueAt(fila, 3);
        String estado = (String) dtm.getValueAt(fila, 4);
        Double precio = (Double) dtm.getValueAt(fila, 5);
        
        
        txtN_Habitacion.setText(numero_ha);
        txtDescrip.setText(descrip);
        txtEstado.setText(estado);
        txtPrecio.setText(String.valueOf(precio));

    }//GEN-LAST:event_tableMouseClicked

    private void txtDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BoxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxtipoActionPerformed

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
                new JFHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Boxtipo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtN_Habitacion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
