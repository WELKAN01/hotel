package vista;

import controlador.ControladorEmpleado;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;

public class JFEmpleado extends javax.swing.JFrame {

    ControladorEmpleado model = new ControladorEmpleado();
    int idSeleccionado = -1;


    public JFEmpleado() {
        initComponents();
        listaEmpleado();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MINIMIZAR = new javax.swing.JButton();
        EXIT1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MINIMIZAR1 = new javax.swing.JButton();
        EXIT2 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BUSQUEDACC = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(970, 580));
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL-EMPLEADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 310, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MINIMIZAR.setBackground(new java.awt.Color(227, 227, 227));
        MINIMIZAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MINIMIZAR.setText("_");
        MINIMIZAR.setToolTipText("");
        MINIMIZAR.setAlignmentY(0.0F);
        MINIMIZAR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MINIMIZAR.setBorderPainted(false);
        MINIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MINIMIZAR.setFocusable(false);
        MINIMIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MINIMIZARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MINIMIZARMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MINIMIZARMousePressed(evt);
            }
        });
        MINIMIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINIMIZARActionPerformed(evt);
            }
        });
        jPanel2.add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 50, 30));

        EXIT1.setBackground(new java.awt.Color(228, 38, 38));
        EXIT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EXIT1.setForeground(new java.awt.Color(255, 255, 255));
        EXIT1.setText("X");
        EXIT1.setToolTipText("");
        EXIT1.setAlignmentY(0.0F);
        EXIT1.setBorder(null);
        EXIT1.setBorderPainted(false);
        EXIT1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EXIT1.setFocusable(false);
        EXIT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EXIT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EXIT1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EXIT1MousePressed(evt);
            }
        });
        EXIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT1ActionPerformed(evt);
            }
        });
        jPanel2.add(EXIT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 50, 30));

        jPanel3.setBackground(new java.awt.Color(120, 120, 120));
        jPanel3.setAutoscrolls(true);
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MINIMIZAR1.setBackground(new java.awt.Color(227, 227, 227));
        MINIMIZAR1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MINIMIZAR1.setText("_");
        MINIMIZAR1.setToolTipText("");
        MINIMIZAR1.setAlignmentY(0.0F);
        MINIMIZAR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MINIMIZAR1.setBorderPainted(false);
        MINIMIZAR1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MINIMIZAR1.setFocusable(false);
        MINIMIZAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MINIMIZAR1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MINIMIZAR1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MINIMIZAR1MousePressed(evt);
            }
        });
        MINIMIZAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINIMIZAR1ActionPerformed(evt);
            }
        });
        jPanel3.add(MINIMIZAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 50, 30));

        EXIT2.setBackground(new java.awt.Color(228, 38, 38));
        EXIT2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EXIT2.setForeground(new java.awt.Color(255, 255, 255));
        EXIT2.setText("X");
        EXIT2.setToolTipText("");
        EXIT2.setAlignmentY(0.0F);
        EXIT2.setBorder(null);
        EXIT2.setBorderPainted(false);
        EXIT2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EXIT2.setFocusable(false);
        EXIT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EXIT2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EXIT2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EXIT2MousePressed(evt);
            }
        });
        EXIT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT2ActionPerformed(evt);
            }
        });
        jPanel3.add(EXIT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 50, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setVerifyInputWhenFocusTarget(false);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseReleased(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 30));

        btnActualizar.setBackground(new java.awt.Color(102, 255, 102));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusPainted(false);
        btnActualizar.setVerifyInputWhenFocusTarget(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setVerifyInputWhenFocusTarget(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 80, 30));

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(153, 153, 153));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "DNI", "Telefono"
            }
        ));
        table.setAutoscrolls(false);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setGridColor(new java.awt.Color(138, 113, 214));
        table.setSelectionBackground(new java.awt.Color(135, 228, 154));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("Id");
            table.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            table.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            table.getColumnModel().getColumn(3).setHeaderValue("DNI");
            table.getColumnModel().getColumn(4).setHeaderValue("Telefono");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 568, 470));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BUSQUEDACC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BUSQUEDACC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar busqueda", "Nombre", "Apellido", "DNI", "Telefono" }));
        BUSQUEDACC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BUSQUEDACC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BUSQUEDACCItemStateChanged(evt);
            }
        });
        BUSQUEDACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSQUEDACCActionPerformed(evt);
            }
        });
        jPanel1.add(BUSQUEDACC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 250, 30));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 118, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 118, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 118, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 118, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 440));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fidelizacion_hotel-lujo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setAutoscrolls(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String telefono = txtTelefono.getText().trim();
        
        Empleado obj = new Empleado();
        
        obj.setNombre_empleado(nombre);
        obj.setApellido_empleado(apellido);
        obj.setDni_empleado(dni);
        obj.setTelefono_empleado(telefono);
        
        model.insertarEmpleado(obj);
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtNombre.requestFocus();
        listaEmpleado();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String telefono = txtTelefono.getText().trim();
        
        Empleado obj = new Empleado();
        obj.setId(idSeleccionado);
        obj.setNombre_empleado(nombre);
        obj.setApellido_empleado(apellido);
        obj.setDni_empleado(dni);
        obj.setTelefono_empleado(telefono);
        
        model.actualizarEmpleado(obj);
        listaEmpleado();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        model.eliminarEmpleado(idSeleccionado);
        listaEmpleado();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int fila = table.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        idSeleccionado = (Integer) dtm.getValueAt(fila, 0);
        String nombre = (String) dtm.getValueAt(fila, 1);
        String apellido = (String) dtm.getValueAt(fila, 2);
        String dni = (String) dtm.getValueAt(fila, 3);
        String telefono = (String) dtm.getValueAt(fila, 4);
        
        
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtDni.setText(dni);
        txtTelefono.setText(telefono);

    }//GEN-LAST:event_tableMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void MINIMIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINIMIZARActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MINIMIZARActionPerformed

    private void MINIMIZARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZARMousePressed

    private void MINIMIZARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MINIMIZARMouseEntered

    private void EXIT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT1MouseEntered
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(203, 46, 12));
        EXIT1.setForeground(Color.BLACK);
    }//GEN-LAST:event_EXIT1MouseEntered

    private void EXIT1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT1MousePressed
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(228,38,38));
        EXIT1.setForeground(Color.WHITE);
    }//GEN-LAST:event_EXIT1MousePressed

    private void EXIT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_EXIT1ActionPerformed

    private void EXIT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT1MouseExited
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(228,38,38));
        EXIT1.setForeground(Color.WHITE);
    }//GEN-LAST:event_EXIT1MouseExited

    private void MINIMIZARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseExited
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(227,227,227));
        EXIT1.setForeground(Color.BLACK);
    }//GEN-LAST:event_MINIMIZARMouseExited
int xx,xy;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        btnRegistrar.setBackground(new Color(183,255,51));
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnRegistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMouseReleased

    private void BUSQUEDACCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BUSQUEDACCItemStateChanged
        // TODO add your handling code here:
        switch (BUSQUEDACC.getSelectedIndex()) {
            case 0:
                    jLabel3.setVisible(true);
                    jLabel2.setVisible(true);
                    jLabel4.setVisible(true);
                    jLabel6.setVisible(true);
                    txtNombre.setVisible(true);
                    txtApellido.setVisible(true);
                    txtDni.setVisible(true);
                    txtTelefono.setVisible(true);
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtTelefono.setText("");
                    listaEmpleado();
                    break;
            case 1:
                    jLabel3.setVisible(true);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(true);
                    txtApellido.setVisible(false);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtTelefono.setText("");
                break;
            case 2:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel6.setVisible(true);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(true);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");;
                    txtTelefono.setText("");
                break;
            case 3:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(true);
                    jLabel4.setVisible(false);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(false);
                    txtDni.setVisible(true);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtTelefono.setText("");
                break;
            case 4:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(false);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtTelefono.setText("");
                break;     
            default:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(true);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(false);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(true);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtTelefono.setText("");
        }
        System.out.println(BUSQUEDACC.getSelectedIndex());
    }//GEN-LAST:event_BUSQUEDACCItemStateChanged
   
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        switch (BUSQUEDACC.getSelectedIndex()) {
            case 0:
                break;
            case 1:if (!txtApellido.isVisible() && !txtDni.isVisible() ) {
                    String nombre= this.txtNombre.getText().trim();
                    ControladorEmpleado Cbus=new ControladorEmpleado();
                    List<Empleado> dataBus=Cbus.buscarEmpleado(nombre);
                    DefaultTableModel datatable = (DefaultTableModel) table.getModel();
                    if(!txtNombre.getText().equals("")){
                    datatable.setRowCount(0);
                        for (Empleado C : dataBus) {
                            Object[] fila={C.getId(),
                            C.getNombre_empleado(),
                            C.getApellido_empleado(),
                            C.getDni_empleado(),
                            C.getTelefono_empleado()
                            };
                    datatable.addRow(fila);
                    System.out.println(C.getId()+"        "+C.getNombre_empleado());
                    }
                 }else{
                        listaEmpleado();
                    }   
                }
                
                break;


            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_txtNombreKeyReleased

    private void BUSQUEDACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSQUEDACCActionPerformed
        // TODO add your handling code here:
        //nada
    }//GEN-LAST:event_BUSQUEDACCActionPerformed

    private void MINIMIZAR1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZAR1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MINIMIZAR1MouseEntered

    private void MINIMIZAR1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZAR1MouseExited
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(227,227,227));
        EXIT1.setForeground(Color.BLACK);
    }//GEN-LAST:event_MINIMIZAR1MouseExited

    private void MINIMIZAR1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZAR1MousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZAR1MousePressed

    private void MINIMIZAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINIMIZAR1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MINIMIZAR1ActionPerformed

    private void EXIT2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT2MouseEntered
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(203, 46, 12));
        EXIT1.setForeground(Color.BLACK);
    }//GEN-LAST:event_EXIT2MouseEntered

    private void EXIT2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT2MouseExited
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(228,38,38));
        EXIT1.setForeground(Color.WHITE);
    }//GEN-LAST:event_EXIT2MouseExited

    private void EXIT2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT2MousePressed
        // TODO add your handling code here:
        EXIT1.setBackground(new Color(228,38,38));
        EXIT1.setForeground(Color.WHITE);
    }//GEN-LAST:event_EXIT2MousePressed

    private void EXIT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_EXIT2ActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    
    private void listaEmpleado() {
        List<Empleado> data = model.listaEmpleado();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for (Empleado c : data) {
            Object[] fila = {c.getId(),
                c.getNombre_empleado(),
                c.getApellido_empleado(),
                c.getDni_empleado(),
                c.getTelefono_empleado()};
            dtm.addRow(fila);
        }
        dtm.fireTableDataChanged();
    }

    public static void main(String args[]) {
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BUSQUEDACC;
    private javax.swing.JButton EXIT1;
    private javax.swing.JButton EXIT2;
    private javax.swing.JButton MINIMIZAR;
    private javax.swing.JButton MINIMIZAR1;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables


}
