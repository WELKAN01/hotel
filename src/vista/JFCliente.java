package vista;

import controlador.ControladorCliente;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class JFCliente extends javax.swing.JFrame {

    ControladorCliente model = new ControladorCliente();
    int idSeleccionado = -1;


    public JFCliente() {
        initComponents();
        listaCliente();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MINIMIZAR = new javax.swing.JButton();
        EXIT1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BUSQUEDACC = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
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

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL-CLIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 310, -1));

        jPanel2.setBackground(new java.awt.Color(120, 120, 120));
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 255, 204));
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "DNI", "Direccion", "Telefono"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 568, 470));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 118, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 118, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BUSQUEDACC.setBackground(new java.awt.Color(204, 204, 204));
        BUSQUEDACC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BUSQUEDACC.setForeground(new java.awt.Color(255, 255, 255));
        BUSQUEDACC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar busqueda", "Nombre", "Apellido", "DNI", "Direccion", "Telefono" }));
        BUSQUEDACC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BUSQUEDACC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BUSQUEDACCItemStateChanged(evt);
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
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 118, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 118, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 440));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fidelizacion_hotel-lujo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String telefono = txtTelefono.getText().trim();
        
        Cliente obj = new Cliente();
        
        obj.setNombre(nombre);
        obj.setApellido(apellido);
        obj.setDni(dni);
        obj.setDireccion(direccion);
        obj.setTelefono(telefono);
        
        model.insertarCliente(obj);
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtNombre.requestFocus();
        listaCliente();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String telefono = txtTelefono.getText().trim();
        
        Cliente obj = new Cliente();
        obj.setId(idSeleccionado);
        obj.setNombre(nombre);
        obj.setApellido(apellido);
        obj.setDni(dni);
        obj.setDireccion(direccion);
        obj.setTelefono(telefono);
        
        model.actualizarCliente(obj);
        listaCliente();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        model.eliminarCliente(idSeleccionado);
        listaCliente();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int fila = table.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        idSeleccionado = (Integer) dtm.getValueAt(fila, 0);
        String nombre = (String) dtm.getValueAt(fila, 1);
        String apellido = (String) dtm.getValueAt(fila, 2);
        String dni = (String) dtm.getValueAt(fila, 3);
        String direccion = (String) dtm.getValueAt(fila, 4);
        String telefono = (String) dtm.getValueAt(fila, 5);
        System.out.println(idSeleccionado);
        
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtDni.setText(dni);
        txtDireccion.setText(direccion);
        txtTelefono.setText(telefono);

    }//GEN-LAST:event_tableMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

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
        this.dispose();
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
                    jLabel5.setVisible(true);
                    jLabel6.setVisible(true);
                    txtNombre.setVisible(true);
                    txtApellido.setVisible(true);
                    txtDireccion.setVisible(true);
                    txtDni.setVisible(true);
                    txtTelefono.setVisible(true);
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                    listaCliente();
                    break;
            case 1:
                    jLabel3.setVisible(true);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(true);
                    txtApellido.setVisible(false);
                    txtDireccion.setVisible(false);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                break;
            case 2:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(true);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(true);
                    txtDireccion.setVisible(false);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                break;
            case 3:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(true);
                    jLabel4.setVisible(false);
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(false);
                    txtDireccion.setVisible(false);
                    txtDni.setVisible(true);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                break;
            case 4:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel5.setVisible(true);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(false);
                    txtDireccion.setVisible(true);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(false);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                break;     
            default:
                    jLabel3.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(true);
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(false);
                    txtNombre.setVisible(false);
                    txtApellido.setVisible(false);
                    txtDireccion.setVisible(false);
                    txtDni.setVisible(false);
                    txtTelefono.setVisible(true);
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDni.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
        }
        System.out.println(BUSQUEDACC.getSelectedIndex());
    }//GEN-LAST:event_BUSQUEDACCItemStateChanged
   
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        switch (BUSQUEDACC.getSelectedIndex()) {
            case 0:
                break;
            case 1:if (!txtApellido.isVisible() && !txtDni.isVisible() && !txtDireccion.isVisible() ) {
                    String nombre= this.txtNombre.getText().trim();
                    ControladorCliente Cbus=new ControladorCliente();
                    List<Cliente> dataBus=Cbus.buscarCliente(nombre);
                    DefaultTableModel datatable = (DefaultTableModel) table.getModel();
                    datatable.setRowCount(0);
                    for (Cliente C : dataBus) {
                    Object[] fila={C.getId(),
                    C.getNombre(),
                    C.getApellido(),
                    C.getDni(),
                    C.getDireccion(),
                    C.getTelefono()
                    };
                    datatable.addRow(fila);
                    System.out.println(C.getId()+"        "+C.getNombre());
                }
                    
                }
                
                break;


            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_txtNombreKeyReleased

    
    private void listaCliente() {
        List<Cliente> data = model.listaCliente();
        Collections.reverse(data);
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for (Cliente c : data) {
            Object[] fila = {c.getId(),
                c.getNombre(),
                c.getApellido(),
                c.getDni(),
                c.getDireccion(),
                c.getTelefono()};
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
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BUSQUEDACC;
    private javax.swing.JButton EXIT1;
    private javax.swing.JButton MINIMIZAR;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
