
package vista;

import controlador.ControladorEmpleado;
import controlador.ControladorUsuario;
import database.MiConexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.usuario;
import modelo.usuarioView;



/**
 *
 * @author Andy
 */
public class Login extends javax.swing.JFrame {

    String user;
    String pass;
    ControladorUsuario uUNI=new ControladorUsuario();
    ControladorEmpleado eUNI=new ControladorEmpleado();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelventana = new javax.swing.JPanel();
        MINIMIZAR = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panelventana.setBackground(new java.awt.Color(153, 153, 153));
        panelventana.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelventana.setOpaque(false);
        panelventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MINIMIZAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MINIMIZAR.setText("_");
        MINIMIZAR.setAlignmentY(0.0F);
        MINIMIZAR.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        MINIMIZAR.setBorderPainted(false);
        MINIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MINIMIZAR.setFocusable(false);
        MINIMIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINIMIZARActionPerformed(evt);
            }
        });
        panelventana.add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 30));

        EXIT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EXIT.setText("X");
        EXIT.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        panelventana.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 40, 30));

        Login.setBackground(new java.awt.Color(85, 152, 219));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel2.setText("HOTEL ZAFIRO");
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 31, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO");
        Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 107, 100, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA");
        Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 190, -1, -1));

        txtusuario.setBackground(new java.awt.Color(0, 0, 51));
        txtusuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setText("INGRESE SU USUARIO");
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        Login.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 150, 240, -1));

        txtpassword.setBackground(new java.awt.Color(0, 0, 51));
        txtpassword.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setText("contraseña");
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpasswordMouseClicked(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        Login.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 221, 240, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Login.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Nuevo proyecto (1).png"))); // NOI18N
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -50, 490, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blue.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelventana, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        // TODO add your handling code here:
        if (txtusuario.getText().equals("INGRESE SU USUARIO")) {
            txtusuario.setText("");
        }
        if (String.valueOf(txtpassword.getPassword()).isEmpty()) {
            txtpassword.setText("contraseña");
        }
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMouseClicked
        // TODO add your handling code here:
        if (String.valueOf(txtpassword.getPassword()).equals("contraseña")) {
            txtpassword.setText("");
        }
        if (txtusuario.getText().isEmpty()) {
            txtusuario.setText("INGRESE SU USUARIO");
        }
    }//GEN-LAST:event_txtpasswordMouseClicked

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        ingresar();
        this.dispose();
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void MINIMIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINIMIZARActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZARActionPerformed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        // TODO add your handling code here:
        if (String.valueOf(txtpassword.getPassword()).equals("contraseña")) {
            txtpassword.setText("");
        }
        if (txtusuario.getText().isEmpty()) {
            txtusuario.setText("INGRESE SU USUARIO");
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_txtusuarioActionPerformed
    public void ingresar(){
        user = txtusuario.getText().trim();
        pass = String.valueOf(txtpassword.getPassword());
        List<usuarioView> AUXusuario=uUNI.ingress(user, pass);

        if(AUXusuario.isEmpty()){
            JOptionPane.showMessageDialog(this, "no se encuentra el usuario");
        }else{
          String datos[]= new String[4];
        for (usuarioView view : AUXusuario) {
            datos[0]=view.getNomempleado();
            datos[1]=view.getTelefonoempleado();
            datos[2]=view.getDniempleado();
            datos[3]=view.getRol();
        }
            int valorID=eUNI.buscarDNI(datos[2]);
//        System.out.println(rol+"\n"+nombre+"\n"+telefono);
        if (datos[3].equals("recepcion")) {
                    MENU M = new MENU();
                    JF_Factura F=new JF_Factura();
                    M.setVisible(true);
                    M.labeluser.setText(datos[0]);
                    MENU.NOMBREEMPLEADO.setText(datos[0]);
                    MENU.Telefono.setText( datos[1]);
                    MENU.direcciones.setText(datos[2]);
                    MENU.roles.setText(datos[3]);
                    MENU.IDempleado.setText(String.valueOf(valorID));
                    M.botonempleado.setEnabled(false);
                    M.botonusuario.setEnabled(false);
                    M.btnReporte.setVisible(false);
                } else {
                    if (datos[3].equals("administrador")) {
                        MENU M = new MENU();
                        JF_Factura F=new JF_Factura();
                        M.setVisible(true);
                        M.labeluser.setText(datos[0]);
                        MENU.NOMBREEMPLEADO.setText(datos[0]);
                        MENU.Telefono.setText( datos[1]);
                        MENU.direcciones.setText(datos[2]);
                        MENU.roles.setText(datos[3]);
                        MENU.IDempleado.setText(String.valueOf(valorID));

                    } else {
                        JOptionPane.showMessageDialog(this, "no se encuentra el usuario");
                    }
                }  
        }
        
    }    
    
    /*public void Ingress() {
            String valorrol = null;
            user = txtusuario.getText().trim();
            pass = String.valueOf(txtpassword.getPassword());
            MiConexion c = new MiConexion();
            Connection con = c.getConexion();
            String sql = "select * from usuario_vista where usuario='" + user + "' and password='" + pass + "' ";
            try {
                Statement ST = con.createStatement();
                ResultSet rs = ST.executeQuery(sql);
                if (rs.next()) {
                    usuarioView u = new usuarioView();
                    u.setRol(rs.getString("roles"));
                    u.setNomempleado(rs.getString("nombre_empleado"));
                    u.setUsuario(rs.getString("usuario"));
                    u.setDniempleado(rs.getString("dni_empleado"));
                    u.setTelefonoempleado(rs.getString("telefono_empleado"));
                    valorrol =String.valueOf(u.getRol());

                    System.out.println("resuelto");
                    if (valorrol.equals("recepcion")) {
                        MENU M = new MENU();
                        M.setVisible(true);
                        M.labeluser.setText(user);
                        M.botonempleado.setEnabled(false);
                        M.botonusuario.setEnabled(false);
                        dispose();
                    } else {
                        MENU M = new MENU();
                        M.setVisible(true);
                        M.labeluser.setText(user);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Lo sentimos, el usuario no existe. Intente de nuevo");
                }
            } catch (Exception e) {
                System.out.println("el error no esta resuelto");
                e.printStackTrace();
            }
        }*/

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JPanel Login;
    private javax.swing.JButton MINIMIZAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelventana;
    private javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
