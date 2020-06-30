
package VIEW;

import Controller.Pasien_Controller;
import Model.Pasien;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;




public class PasienView extends javax.swing.JFrame {
    
    private Pasien_Controller transaksi;
    
    public PasienView() throws SQLException {
        initComponents();
//        setDefaultCloseOperation(MenuView.DISPOSE_ON_CLOSE);
        this.transaksi = new Pasien_Controller();
        this.ShowTablePasien();
    }
    
    private void ShowTablePasien() throws SQLException {
        DefaultTableModel dtmPasien = new DefaultTableModel(new String[]
        {"Id Pasien","Nama pasien","Umur Pasien","No Telp","Tanggal Lahir","Alamat", "Jenis Kelamin"},0);
        dtmPasien.setRowCount(0); 
        
        for(Pasien dp : this.transaksi.getDataPasien()){
            dtmPasien.addRow(new String[]{dp.getId_pasien().toString(), dp.getNama_pasien().toString(),dp.getUmur_pasien().toString(), 
                dp.getNo_telp().toString(),dp.getTanggal_Lahir().toString(), dp.getAlamat().toString(), dp.getJenis_kelamin().toString()});
        }

        this.tbPasien.setModel(dtmPasien);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfUmurPasien = new javax.swing.JTextField();
        tfNoTelp = new javax.swing.JTextField();
        tfTanggalLahir = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPasien = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfIdPasien = new javax.swing.JTextField();
        tfNamaPasien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cbJenisKelamin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Umur Pasien");

        jLabel3.setText("Nama Pasien");

        jLabel4.setText("No Telp");

        jLabel5.setText("TTL");

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("Alamat");

        tfTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalLahirActionPerformed(evt);
            }
        });

        tbPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPasien);

        btnSimpan.setBackground(new java.awt.Color(255, 222, 185));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel8.setText("Id Pasien");

        tfIdPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdPasienActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DATA PASEIN");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        cbJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisKelaminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(1, 1, 1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(tfNamaPasien, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfUmurPasien, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfNoTelp, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfTanggalLahir, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbJenisKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUmurPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            Pasien pasien = new Pasien();
            
            pasien.setId_pasien(Integer.parseInt(this.tfIdPasien.getText()));
            pasien.setNama_pasien(this.tfNamaPasien.getText());
            pasien.setNo_telp(Integer.parseInt(this.tfNoTelp.getText()));
            pasien.setUmur_pasien(Integer.parseInt(this.tfUmurPasien.getText()));
            pasien.setTanggal_Lahir(new SimpleDateFormat("dd-mm-yyyy").parse(this.tfTanggalLahir.getText()));
            pasien.setAlamat(this.tfAlamat.getText());
            pasien.setJenis_kelamin(this.cbJenisKelamin.getSelectedItem().toString());
            
            this.transaksi.getDataPasien();
            this.transaksi.UpdatePasien(pasien);
            this.ShowTablePasien();
            
            
        } catch (SQLException | ParseException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Pasien pasien = new Pasien();
        
        try {
            pasien.setId_pasien(Integer.parseInt(this.tfIdPasien.getText()));
            pasien.setNama_pasien(this.tfNamaPasien.getText());
            pasien.setNo_telp(Integer.parseInt(this.tfNoTelp.getText()));
            pasien.setUmur_pasien(Integer.parseInt(this.tfUmurPasien.getText()));
            pasien.setTanggal_Lahir(new SimpleDateFormat("dd/mm/yyyy").parse(this.tfTanggalLahir.getText()));
            pasien.setAlamat(this.tfAlamat.getText());
            pasien.setJenis_kelamin(this.cbJenisKelamin.getSelectedItem().toString());
            
            
            this.transaksi.getDataPasien();
            this.transaksi.insertPasien(pasien);
            this.ShowTablePasien();
        } catch (SQLException | ParseException  err) {
            System.out.println(err);
        }   
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tfTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTanggalLahirActionPerformed

    private void tfIdPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdPasienActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Pasien pasien = new Pasien();
            
            this.tbPasien.getSelectedRow();
            pasien.setId_pasien(Integer.parseInt(tbPasien.getValueAt(tbPasien.getSelectedRow(), 0).toString()));
            
            this.transaksi.deletePasien(pasien);
            this.ShowTablePasien();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MenuView().show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPasienMouseClicked

        int baris = tbPasien.getSelectedRow();
        this.tfIdPasien.setText(tbPasien.getValueAt(baris, 0).toString());
        this.tfNamaPasien.setText(tbPasien.getValueAt(baris,1).toString());
        this.tfUmurPasien.setText(tbPasien.getValueAt(baris, 2).toString());
        this.tfNoTelp.setText(tbPasien.getValueAt(baris, 3).toString()); 
        this.tfTanggalLahir.setText(tbPasien.getValueAt(baris, 4).toString());
        this.tfAlamat.setText(tbPasien.getValueAt(baris, 5).toString());
        this.cbJenisKelamin.setSelectedItem(tbPasien.getValueAt(baris, 6).toString());
        
    }//GEN-LAST:event_tbPasienMouseClicked

    private void cbJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJenisKelaminActionPerformed

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
            java.util.logging.Logger.getLogger(PasienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PasienView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PasienView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPasien;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfIdPasien;
    private javax.swing.JTextField tfNamaPasien;
    private javax.swing.JTextField tfNoTelp;
    private javax.swing.JTextField tfTanggalLahir;
    private javax.swing.JTextField tfUmurPasien;
    // End of variables declaration//GEN-END:variables

  
  

    
}
