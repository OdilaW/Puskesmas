
package VIEW;

import Controller.Dokter_Controller;
import Controller.Poli_Controller;
import Model.Dokter;
import Model.Poli;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class PoliView extends javax.swing.JFrame {
    private Poli_Controller transaksi;
    private Dokter_Controller transaksi1;
    
    public PoliView() throws SQLException {
        initComponents();
        this.transaksi =  new Poli_Controller(); 
        this.transaksi1 = new Dokter_Controller();
        this.ShowTablePoli();
        this.showComboBoxDokter();
    }
    
//Combo Box Dokter 
    public void showComboBoxDokter() throws SQLException {
        DefaultComboBoxModel dcbmDokter = new DefaultComboBoxModel();

        for (Dokter d : this.transaksi1.getDataDokter()) {
            dcbmDokter.addElement(d.getNama_dokter()+"   "+"("+d.getSpesialis()+")");
        }

        this.cbNamaDokter.setModel(dcbmDokter);
    }
        
    private void ShowTablePoli() throws SQLException {
        DefaultTableModel dtmpoli = new DefaultTableModel(new String[]
        {"ID POLI","Nama Dokter","Nama Poli","Keterangan"},0);
        dtmpoli.setRowCount(0);
        
        for(Poli dp : this.transaksi.getDataPoli()){
            dtmpoli.addRow(new String[]{dp.getId_poli().toString(), dp.getDokter().getNama_dokter().toString(),dp.getNama_poli().toString(),dp.getKeterangan().toString()}); 
        }
        this.tbPoli.setModel(dtmpoli);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfKeterangan = new javax.swing.JTextField();
        tfNamaPoli = new javax.swing.JTextField();
        tfIdPoli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPoli = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbNamaDokter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(225, 222, 185));

        jLabel1.setText("ID POLI");

        jLabel2.setText("Nama Dokter");

        jLabel3.setText("Nama Poli");

        jLabel4.setText("Keterangan Poli");

        tfKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeteranganActionPerformed(evt);
            }
        });

        tfNamaPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaPoliActionPerformed(evt);
            }
        });

        tbPoli.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPoliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPoli);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trajan Pro 3", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA POLI");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbNamaDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfKeterangan)
                                    .addComponent(tfNamaPoli)
                                    .addComponent(tfIdPoli)
                                    .addComponent(cbNamaDokter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfIdPoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaPoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKeteranganActionPerformed

    private void tfNamaPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaPoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaPoliActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        Poli poli = new Poli();
        try {
            poli.setId_poli(Integer.parseInt(this.tfIdPoli.getText()));
            poli.setDokter(this.transaksi1.getDataDokter().get(this.cbNamaDokter.getSelectedIndex()));
            poli.setNama_poli(this.tfNamaPoli.getText());
            poli.setKeterangan(this.tfKeterangan.getText());
            
            this.showComboBoxDokter();
            this.transaksi.getDataPoli();
            this.transaksi.InputPoli(poli);
            this.ShowTablePoli();
        } catch (SQLException   err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new MenuView().show();
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                 try {
            Poli poli = new Poli();
            
            this.tbPoli.getSelectedRow();
            poli.setId_poli(Integer.parseInt(tbPoli.getValueAt(tbPoli.getSelectedRow(), 0).toString()));
            
            this.transaksi.DeletePoli(poli);
            this.ShowTablePoli();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbPoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPoliMouseClicked
        int baris = tbPoli.getSelectedRow();
        this.tfIdPoli.setText(tbPoli.getValueAt(baris, 0).toString());
        this.cbNamaDokter.setSelectedItem(tbPoli.getValueAt(baris, 1).toString());
        this.tfNamaPoli.setText(tbPoli.getValueAt(baris, 2).toString());
        this.tfKeterangan.setText(tbPoli.getValueAt(baris, 3).toString()); 
    }//GEN-LAST:event_tbPoliMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
            try {
            Poli poli = new Poli();
            
            poli.setId_poli(Integer.parseInt(this.tfIdPoli.getText()));
            poli.setDokter(this.transaksi1.getDataDokter().get(this.cbNamaDokter.getSelectedIndex()));
            poli.setNama_poli(this.tfNamaPoli.getText());
            poli.setKeterangan(this.tfKeterangan.getText());
            
            this.showComboBoxDokter();
            this.transaksi.getDataPoli();
            this.transaksi.UpdatePoli(poli);
            this.ShowTablePoli();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PoliView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoliView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoliView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoliView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PoliView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PoliView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox<String> cbNamaDokter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPoli;
    private javax.swing.JTextField tfIdPoli;
    private javax.swing.JTextField tfKeterangan;
    private javax.swing.JTextField tfNamaPoli;
    // End of variables declaration//GEN-END:variables
}
