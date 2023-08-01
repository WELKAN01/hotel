/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class JFReportes extends javax.swing.JFrame {

    public JFReportes() {
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

        btnRHabitacion = new javax.swing.JButton();
        btnRServicio = new javax.swing.JButton();
        btnRCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRHabitacion.setText("REPORTE - HABITACIONES");
        btnRHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHabitacionActionPerformed(evt);
            }
        });

        btnRServicio.setText("REPORTE - SERVICIO");
        btnRServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRServicioActionPerformed(evt);
            }
        });

        btnRCliente.setText("REPORTE - CLIENTES");
        btnRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("REPORTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnRHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnRServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRClienteActionPerformed

        String inf1 = "C:\\Users\\User\\Desktop\\principal\\Hotelv2\\src\\Reportes\\report2.jrxml";
        String inf2 = "C:\\Users\\User\\Desktop\\principal\\Hotelv2\\src\\Reportes\\report2.pdf";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            conn.setAutoCommit(false);

        } catch (Exception e) {
            
        }

        try {
            JasperReport jasperreport = JasperCompileManager.compileReport(inf1);

            Class.forName("com.mysql.jdbc.Driver");

            JasperPrint jprint = JasperFillManager.fillReport(jasperreport, null, conn);

            JasperExportManager.exportReportToPdf(jprint);

            JasperViewer.viewReport(jprint);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnRClienteActionPerformed

    private void btnRHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHabitacionActionPerformed
       String inf1 = "C:\\Users\\User\\Desktop\\principal\\Hotelv2\\src\\Reportes\\report1.jrxml";
        String inf2 = "C:\\Users\\User\\Desktop\\principal\\Hotelv2\\src\\Reportes\\report1.pdf";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            conn.setAutoCommit(false);

        } catch (Exception e) {
            
        }

        try {
            JasperReport jasperreport = JasperCompileManager.compileReport(inf1);

            Class.forName("com.mysql.jdbc.Driver");

            JasperPrint jprint = JasperFillManager.fillReport(jasperreport, null, conn);

            JasperExportManager.exportReportToPdf(jprint);

            JasperViewer.viewReport(jprint);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnRHabitacionActionPerformed

    private void btnRServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRServicioActionPerformed
       String inf1 = "C:\\Users\\User\\Desktop\\principal\\Hotelv2\\src\\Reportes\\report3.jrxml";
        String inf2 = "C:\\Users\\User\\Desktop\\principal\\Hotelv2\\src\\Reportes\\report3.pdf";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            conn.setAutoCommit(false);

        } catch (Exception e) {
            
        }

        try {
            JasperReport jasperreport = JasperCompileManager.compileReport(inf1);

            Class.forName("com.mysql.jdbc.Driver");

            JasperPrint jprint = JasperFillManager.fillReport(jasperreport, null, conn);

            JasperExportManager.exportReportToPdf(jprint);

            JasperViewer.viewReport(jprint);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnRServicioActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRCliente;
    private javax.swing.JButton btnRHabitacion;
    private javax.swing.JButton btnRServicio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
