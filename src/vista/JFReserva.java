package vista;

import controlador.ControladorReserva;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Reserva;
import modelo.ReservaDTO;

public class JFReserva extends javax.swing.JFrame {

    ControladorReserva model = new ControladorReserva();
    int idSeleccionado = -1;

    public JFReserva() {
        initComponents();
        listaReserva();
        this.setLocationRelativeTo(this);
        inhabilitar();
    }
    void inhabilitar() {
        txtIDHabitacion.setVisible(false);
        txtIDCliente.setVisible(false);
        txtIDEmpleado.setVisible(false);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        btnVistaCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDHabitacion = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        btnVistaHabitacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        table.setBackground(new java.awt.Color(153, 153, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Habitacion", "Cliente", "Empleado", "Dias", "observacion"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 56, 662, 360));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setBackground(new java.awt.Color(51, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnActualizar.setBackground(java.awt.Color.green);
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        btnEliminar.setBackground(java.awt.Color.red);
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Observacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 137, -1));

        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });
        jPanel1.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 137, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Dias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txtIDEmpleado.setEditable(false);
        txtIDEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, -1));

        txtEmpleado.setEditable(false);
        txtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtIDCliente.setEditable(false);
        txtIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 34, -1));

        txtCliente.setEditable(false);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 124, -1));

        btnVistaCliente.setText("-");
        btnVistaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnVistaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Habitacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtIDHabitacion.setEditable(false);
        txtIDHabitacion.setDoubleBuffered(true);
        txtIDHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 34, -1));

        txtHabitacion.setEditable(false);
        txtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 124, -1));

        btnVistaHabitacion.setText("-");
        btnVistaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnVistaHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 370, 330));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fidelizacion_hotel-lujo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1060, 390));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("_");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 50, 30));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 50, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String habitacion = txtIDHabitacion.getText().trim();
        String cliente = txtIDCliente.getText().trim();
        String empleado = txtIDEmpleado.getText().trim();
        String dias = txtDias.getText().trim();
        String observacion = txtObservacion.getText().trim();

        Reserva obj = new Reserva();
        obj.setHabitacion(Integer.parseInt(habitacion));
        obj.setCliente(Integer.parseInt(cliente));
        obj.setEmpleado(Integer.parseInt(empleado));
        obj.setCantidad_reserva(dias);
        obj.setObservacion(observacion);
        model.insertarReserva(obj);
        txtIDHabitacion.setText("");
        txtIDCliente.setText("");
        txtDias.setText("");
        txtObservacion.setText("");
        txtIDHabitacion.requestFocus();
        listaReserva();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String habitacion = txtIDHabitacion.getText().trim();
        String cliente = txtIDCliente.getText().trim();
        String empleado = txtIDEmpleado.getText().trim();
        String dias = txtDias.getText().trim();
        String observacion = txtObservacion.getText().trim();

        Reserva obj = new Reserva();
        obj.setHabitacion(Integer.parseInt(habitacion));
        obj.setCliente(Integer.parseInt(cliente));
        obj.setEmpleado(Integer.parseInt(empleado));
        obj.setCantidad_reserva(dias);
        obj.setObservacion(observacion);

        model.actualizarReserva(obj);
        listaReserva();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        model.eliminarReserva(idSeleccionado);
        listaReserva();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int fila = table.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        idSeleccionado = (Integer) dtm.getValueAt(fila, 0);
        String dias = (String) dtm.getValueAt(fila, 4);
        String observacion = (String) dtm.getValueAt(fila, 5);
        List<Reserva> busdata = model.buscarReserva(idSeleccionado);
        for (Reserva reserva : busdata) {
            
            txtIDHabitacion.setText(String.valueOf(reserva.getHabitacion()));
            txtIDCliente.setText(String.valueOf(reserva.getCliente()));
            txtIDEmpleado.setText(String.valueOf(reserva.getEmpleado()));
            
        }
        txtDias.setText(dias);
        txtObservacion.setText(observacion);

        


    }//GEN-LAST:event_tableMouseClicked

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void txtIDHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDHabitacionActionPerformed
 
    }//GEN-LAST:event_txtIDHabitacionActionPerformed

    private void txtObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionActionPerformed

    private void btnVistaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaClienteActionPerformed
        JFVCliente form = new JFVCliente();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnVistaClienteActionPerformed

    private void txtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnVistaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaHabitacionActionPerformed
        JFVHabitacion form = new JFVHabitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnVistaHabitacionActionPerformed

    private void txtIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIDEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDEmpleadoActionPerformed

    private void txtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoActionPerformed

    private void listaReserva() {
        List<ReservaDTO> data = model.listaReserva();
        Collections.reverse(data);
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for (ReservaDTO c : data) {
            Object[] fila = {c.getId(),
                c.getHabitacion(),
                c.getCliente(),
                c.getEmpleado(),
                c.getCantidad_reserva(),
                c.getObservacion()};
            dtm.addRow(fila);
        }
        dtm.fireTableDataChanged();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVistaCliente;
    private javax.swing.JButton btnVistaHabitacion;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDias;
    public static javax.swing.JTextField txtEmpleado;
    public static javax.swing.JTextField txtHabitacion;
    public static javax.swing.JTextField txtIDCliente;
    public static javax.swing.JTextField txtIDEmpleado;
    public static javax.swing.JTextField txtIDHabitacion;
    public static javax.swing.JTextField txtObservacion;
    // End of variables declaration//GEN-END:variables
}
