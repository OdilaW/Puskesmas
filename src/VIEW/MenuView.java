/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Pasien;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuView extends javax.swing.JFrame {

    
    public MenuView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPasien = new javax.swing.JButton();
        btnDokter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPoli = new javax.swing.JButton();
        btnRekamedik = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 206, 209));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPasien.setBackground(new java.awt.Color(175, 238, 238));
        btnPasien.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPasien.setForeground(new java.awt.Color(25, 25, 122));
        btnPasien.setText("PASIEN");
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 135, 189, 65));

        btnDokter.setBackground(new java.awt.Color(175, 238, 238));
        btnDokter.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnDokter.setForeground(new java.awt.Color(25, 25, 122));
        btnDokter.setText("DOKTER");
        btnDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionPerformed(evt);
            }
        });
        getContentPane().add(btnDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 256, 189, 61));

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU UTAMA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 440, 110));

        btnPoli.setBackground(new java.awt.Color(175, 238, 238));
        btnPoli.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPoli.setForeground(new java.awt.Color(25, 25, 122));
        btnPoli.setText("POLI");
        btnPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 374, 189, 69));

        btnRekamedik.setBackground(new java.awt.Color(175, 238, 238));
        btnRekamedik.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnRekamedik.setForeground(new java.awt.Color(25, 25, 122));
        btnRekamedik.setText("REKAMEDIK");
        btnRekamedik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekamedikActionPerformed(evt);
            }
        });
        getContentPane().add(btnRekamedik, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 511, 189, 62));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/medical-stethoscope-and-mask-composed-with-red-foiled-4386466 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 1070, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
        try {  
            new PasienView().show();  
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
       dispose();
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
        try {
            new DokterView().show();
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliActionPerformed
        try {
            new PoliView().show();
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnPoliActionPerformed

    private void btnRekamedikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekamedikActionPerformed
        try {
            new RekamedikView().show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRekamedikActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDokter;
    private javax.swing.JButton btnPasien;
    private javax.swing.JButton btnPoli;
    private javax.swing.JButton btnRekamedik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
