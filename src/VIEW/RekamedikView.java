package VIEW;


import Controller.Pasien_Controller;
import Controller.Poli_Controller;
import Controller.Rekamedik_Controller;
import Model.Pasien;
import Model.Poli;
import Model.Rekamedik;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class RekamedikView extends javax.swing.JFrame {
    private Rekamedik_Controller transaksi;
    private Poli_Controller transaksi1;
    private Pasien_Controller transaksi2;
    private ArrayList<Rekamedik> arrRekamedik;
    
    
    public RekamedikView() throws SQLException {
        initComponents();
        this.arrRekamedik = new ArrayList<>();
        this.transaksi =  new Rekamedik_Controller(); 
        this.transaksi1 = new Poli_Controller();
        this.transaksi2 = new Pasien_Controller();
        this.showComboBoxPasien();
        this.showComboBoxPoli();
        this.showTableRekamedik();
     
    }
    
    public void showComboBoxPasien() throws SQLException {
        DefaultComboBoxModel dcbmPasien = new DefaultComboBoxModel();
        for (Pasien p : this.transaksi2.getDataPasien()) {
            dcbmPasien.addElement(p.getNama_pasien());
        }
        this.cbPasien.setModel(dcbmPasien);
    }
    
    
    public void showComboBoxPoli() throws SQLException {
        DefaultComboBoxModel dcbmPoli = new DefaultComboBoxModel();
        for (Poli p : this.transaksi1.getDataPoli()) {
            dcbmPoli.addElement(p.getNama_poli());
        }
        this.cbPoli.setModel(dcbmPoli);
    }
    
    public void showTableRekamedik(){
        DefaultTableModel dtmrekamedik = new DefaultTableModel(new String[]
        {"Nama Pasien","Nama Poli","Keluhan","Berat Badan","Tinggi Badan","Suhu Tubuh", "Tekanan Darah", "Tanggal Kedatangan"},0);
        dtmrekamedik.setRowCount(0);
        
        for(Rekamedik r : this.transaksi.getDataRekamedik()){
            dtmrekamedik.addRow(new String[]{r.getPasien().getNama_pasien().toString(),r.getPoli().getNama_poli().toString(),r.getKeluhan().toString()
            ,r.getBerat_badan().toString(),r.getTinggi_bagan().toString() ,r.getSuhu_tubuh().toString(), r.getTekanan_darah().toString(), r.getTanggal_kedatngan().toString()}); 
            
            arrRekamedik.add(r);
        }
        this.tbRekamedik.setModel(dtmrekamedik);
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
        jLabel8 = new javax.swing.JLabel();
        jfTanggalKedatangan = new javax.swing.JTextField();
        tfTekananDarah = new javax.swing.JTextField();
        tfSuhuTubuh = new javax.swing.JTextField();
        tfTinggiBadan = new javax.swing.JTextField();
        tfBeratBadan = new javax.swing.JTextField();
        tfKeluhan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRekamedik = new javax.swing.JTable();
        btnInput = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbPasien = new javax.swing.JComboBox<>();
        cbPoli = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDetail = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Pasien");

        jLabel2.setText("Nama Poli");

        jLabel3.setText("Keluhan");

        jLabel4.setText("Berat Badan");

        jLabel5.setText("Tinggi Badan");

        jLabel6.setText("Suhu Tubuh");

        jLabel7.setText("Tekanan Darah");

        jLabel8.setText("Tanggal Kedatangan");

        tbRekamedik.setModel(new javax.swing.table.DefaultTableModel(
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
        tbRekamedik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRekamedikMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRekamedik);

        btnInput.setText("INPUT");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbPasien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbPoli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Lihat Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        taDetail.setColumns(20);
        taDetail.setRows(5);
        jScrollPane2.setViewportView(taDetail);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel9.setText("DATA REKAMEDIK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfTanggalKedatangan, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(tfTekananDarah)
                        .addComponent(tfSuhuTubuh)
                        .addComponent(tfTinggiBadan)
                        .addComponent(tfBeratBadan)
                        .addComponent(tfKeluhan)
                        .addComponent(cbPasien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbPoli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbPoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfBeratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfTinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfSuhuTubuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfTekananDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jfTanggalKedatangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Rekamedik rekamedik = new Rekamedik();
        int id = arrRekamedik.get(this.tbRekamedik.getSelectedRow()).getNo_Rekamedik();
        try {
            
            rekamedik.setPasien(this.transaksi2.getDataPasien().get(this.cbPasien.getSelectedIndex()));
            rekamedik.setPoli(this.transaksi1.getDataPoli().get(this.cbPoli.getSelectedIndex()));
            rekamedik.setKeluhan(this.tfKeluhan.getText());
            rekamedik.setBerat_badan(Integer.parseInt(this.tfBeratBadan.getText()));
            rekamedik.setTinggi_bagan(Integer.parseInt(this.tfTinggiBadan.getText()));
            rekamedik.setSuhu_tubuh(this.tfSuhuTubuh.getText());
            rekamedik.setTekanan_darah(this.tfTekananDarah.getText());
            rekamedik.setTanggal_kedatngan( new SimpleDateFormat("yyyy-mm-dd").parse(this.jfTanggalKedatangan.getText()));
                        
            this.showComboBoxPasien();
            this.showComboBoxPoli();
            this.transaksi.getDataRekamedik();
            this.transaksi.UpdateRekamedik(rekamedik, id);
            this.showTableRekamedik();
            
        } catch (SQLException | ParseException err  ) {
            System.out.println(err);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MenuView().show();
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        Rekamedik rekamedik = new Rekamedik();
        
        try {
            rekamedik.setPasien(this.transaksi2.getDataPasien().get(this.cbPasien.getSelectedIndex()));
            rekamedik.setPoli(this.transaksi1.getDataPoli().get(this.cbPoli.getSelectedIndex()));
            rekamedik.setKeluhan(this.tfKeluhan.getText());
            rekamedik.setBerat_badan(Integer.parseInt(this.tfBeratBadan.getText()));
            rekamedik.setTinggi_bagan(Integer.parseInt(this.tfTinggiBadan.getText()));
            rekamedik.setSuhu_tubuh(this.tfSuhuTubuh.getText());
            rekamedik.setTekanan_darah(this.tfTekananDarah.getText());
            rekamedik.setTanggal_kedatngan( new SimpleDateFormat("dd/mm/yyyy").parse(this.jfTanggalKedatangan.getText()));
            
            
            this.showComboBoxPasien();
            this.showComboBoxPoli();
            this.transaksi.getDataRekamedik();
            this.transaksi.InputRekamedik(rekamedik);
            this.showTableRekamedik();
        } catch (SQLException | ParseException err  ) {
            System.out.println(err);
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void tbRekamedikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRekamedikMouseClicked
        int baris = tbRekamedik.getSelectedRow();
        this.cbPasien.setSelectedItem(tbRekamedik.getValueAt(baris, 0).toString());
        this.cbPoli.setSelectedItem(tbRekamedik.getValueAt(baris, 1).toString());
        this.tfKeluhan.setText(tbRekamedik.getValueAt(baris, 2).toString());
        this.tfBeratBadan.setText(tbRekamedik.getValueAt(baris, 3).toString());
        this.tfTinggiBadan.setText(tbRekamedik.getValueAt(baris, 4).toString());
        this.tfSuhuTubuh.setText(tbRekamedik.getValueAt(baris, 5).toString());
        this.tfTekananDarah.setText(tbRekamedik.getValueAt(baris, 6).toString());
        this.jfTanggalKedatangan.setText(tbRekamedik.getValueAt(baris, 7).toString());

    }//GEN-LAST:event_tbRekamedikMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Rekamedik rekamedik = new Rekamedik();
        int id = arrRekamedik.get(this.tbRekamedik.getSelectedRow()).getNo_Rekamedik();
        
        this.tbRekamedik.getSelectedRow();
        
        rekamedik.setNo_Rekamedik(id);

        this.transaksi.DeleteRekamedik(rekamedik, id);
        this.transaksi.getDataRekamedik();
        this.showTableRekamedik();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Rekamedik rekamedik = new Rekamedik ();
        
        rekamedik = this.transaksi.getDataRekamedik().get(this.tbRekamedik.getSelectedRow());
        String text = "" + "==================== PEMBELI ====================" + "\n" + 
                    "Nama Pasien        : " + rekamedik.getPasien().getNama_pasien()  + "\n" + 
                    "Jenis Kelamin      : " + rekamedik.getPasien().getJenis_kelamin()  + "\n" + 
                    "Tanggal Lahir      : " + new SimpleDateFormat("dd/MM/yyyy").format(rekamedik.getPasien().getTanggal_Lahir())+ "\n" + 
                    "Alamat     : " + rekamedik.getPasien().getAlamat() + "\n" + 
                    "Umur Pasien        : " + rekamedik.getPasien().getUmur_pasien() + "\n" + 
                    "No. Telp           : " + rekamedik.getPasien().getNo_telp() + "\n" 

                    + "==================== POLI ====================" + "\n" + 
                    "Nama Poli      : " + rekamedik.getPoli().getNama_poli() + "\n" + 
                    "KETERANGAN     : " + rekamedik.getPoli().getKeterangan() + "\n" + 
                   
                    "" + "==================== REKAMEDIK ====================" + "\n" +
                    "Keluhan            : " + rekamedik.getKeluhan()  + "\n" +
                    "Berat Badan        : " + rekamedik.getBerat_badan()  + "\n" + 
                    "Tinggi Badan       : " + rekamedik.getTinggi_bagan()  + "\n" + 
                    "Tanggal Kedatnagan : " + new SimpleDateFormat("dd/MM/yyyy").format(rekamedik.getTanggal_kedatngan())+ "\n" + 
                    "Suhu Tubuh        : " + rekamedik.getSuhu_tubuh() + "\n" +
                    "Tekanan Darah      : " + rekamedik.getTekanan_darah() + "\n" ;
                    
            this.taDetail.setText(text);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RekamedikView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RekamedikView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbPasien;
    private javax.swing.JComboBox<String> cbPoli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jfTanggalKedatangan;
    private javax.swing.JTextArea taDetail;
    private javax.swing.JTable tbRekamedik;
    private javax.swing.JTextField tfBeratBadan;
    private javax.swing.JTextField tfKeluhan;
    private javax.swing.JTextField tfSuhuTubuh;
    private javax.swing.JTextField tfTekananDarah;
    private javax.swing.JTextField tfTinggiBadan;
    // End of variables declaration//GEN-END:variables

}
