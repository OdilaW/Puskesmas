package Controller;

import Model.Dokter;
import Model.Pasien;
import Model.Poli;
import Model.Rekamedik;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.net.aso.d;


public class Rekamedik_Controller {
    private Koneksi koneksi;
    ArrayList<Rekamedik> arrRekamedik;
    private Dokter d;
    
    public Rekamedik_Controller(){
    this.koneksi = new Koneksi();
    this.arrRekamedik = new ArrayList<>(); 
    }
    
//    INPUT REKAMEDIK
    public void InputRekamedik(Rekamedik rekamedik){
        
            String Tanggal= new SimpleDateFormat("dd/MM/yyyy").format(rekamedik.getTanggal_kedatngan());
            
            this.koneksi.ManipulasiData("INSERT INTO REKAMEDIK_06993 (NO_REKAMEDIK, ID_PASIEN, ID_POLI, BERAT_BADAN"
                    + ",SUHU_TUBUH,KELUHAN , TINGGI_BADAN, TANGGAL_KEDATANGAN, TEKANAN_DARAH) VALUES "
                    + " (NO_REKAMEDIK.NEXTVAL,"+rekamedik.getPasien().getId_pasien()+","+ rekamedik.getPoli().getId_poli()+","
                    + " "+rekamedik.getBerat_badan()+",'"+rekamedik.getSuhu_tubuh()+"','"+rekamedik.getKeluhan()+"',"
                    + " "+rekamedik.getTinggi_bagan()+",TO_DATE('"+Tanggal+"','dd/mm/yyyy'),'"+rekamedik.getTekanan_darah()+"')");
            
            System.out.println("IINSERT INTO REKAMEDIK_06993 (NO_REKAMEDIK, ID_PASIEN, ID_POLI, BERAT_BADAN"
                    + ",SUHU_TUBUH,KELUHAN , TINGGI_BADAN, TANGGAL_KEDATANGAN, TEKANAN_DARAH) VALUES "
                    + " (NO_REKAMEDIK.NEXTVAL,"+rekamedik.getPasien().getId_pasien()+","+ rekamedik.getPoli().getId_poli()+","
                    + " "+rekamedik.getBerat_badan()+",'"+rekamedik.getSuhu_tubuh()+"','"+rekamedik.getKeluhan()+"',"
                    + " "+rekamedik.getTinggi_bagan()+",TO_DATE('"+Tanggal+"','dd/mm/yyyy'),'"+rekamedik.getTekanan_darah()+"')");
    }   
    
//      UPDATE REKAMEDIK
    public void UpdateRekamedik(Rekamedik rekamedik, int id){
        String Tanggal= new SimpleDateFormat("yyyy-mm-dd").format(rekamedik.getTanggal_kedatngan());
        
        this.koneksi.ManipulasiData("UPDATE REKAMEDIK_06993 SET "+" ID_PASIEN = "+rekamedik.getPasien().getId_pasien()+", "
                + "ID_POLI = "+rekamedik.getPoli().getId_poli()+", BERAT_BADAN = "+rekamedik.getBerat_badan()+","
                + "SUHU_TUBUH ='"+rekamedik.getSuhu_tubuh()+"', KELUHAN = '"+rekamedik.getKeluhan()+"', "
                + " TINGGI_BADAN = "+rekamedik.getTinggi_bagan()+", TANGGAL_KEDATANGAN =TO_DATE('"+Tanggal+"','yyyy-mm-dd'),"
                + " TEKANAN_DARAH = '"+rekamedik.getTekanan_darah()+"' WHERE NO_REKAMEDIK = "+id);
        System.out.print("UPDATE REKAMEDIK_06993 SET "+" ID_PASIEN = "+rekamedik.getPasien().getId_pasien()+", "
                + "ID_POLI = "+rekamedik.getPoli().getId_poli()+", BERAT_BADAN = "+rekamedik.getBerat_badan()+","
                + "SUHU_TUBUH ='"+rekamedik.getSuhu_tubuh()+"', KELUHAN = '"+rekamedik.getKeluhan()+"', "
                + " TINGGI_BADAN = "+rekamedik.getTinggi_bagan()+", TANGGAL_KEDATANGAN =TO_DATE('"+Tanggal+"','yyyy-mm-dd'),"
                + " TEKANAN_DARAH = '"+rekamedik.getTekanan_darah()+"' WHERE NO_REKAMEDIK = "+id);
        
    }
//      DELETE REKAMEDIK
    public void DeleteRekamedik(Rekamedik rekamedik, int id){
            this.koneksi.ManipulasiData("DELETE FROM Rekamedik_06993 WHERE NO_REKAMEDIK = " + id);
    }
    
    
    public ArrayList<Rekamedik> getDataRekamedik(){
        try {
            this.arrRekamedik.clear();
            ResultSet rs = this.koneksi.GetData("SELECT * FROM REKAMEDIKFULL");
//            ResultSet rs = this.koneksi.GetData("SELECT REKAMEDIK_06993.*, POLI_06993.*, PASIEN_06993.* "
//                    + "FROM REKAMEDIK_06993 JOIN POLI_06993 ON REKAMEDIK_06993.ID_POLI = POLI_06993.ID_POLI "
//                    + "JOIN PASIEN_06993 ON REKAMEDIK_06993.ID_PASIEN = PASIEN_06993.ID_PASIEN");
            while(rs.next()){
                Pasien pasien = new Pasien();
                pasien.setId_pasien(rs.getInt("ID_PASIEN"));
                pasien.setNama_pasien(rs.getString("NAMA_PASIEN"));
                pasien.setUmur_pasien(rs.getInt("UMUR_PASIEN"));
                pasien.setNo_telp(rs.getInt("NO_TELP"));
                pasien.setTanggal_Lahir(rs.getDate("TTL"));
                pasien.setJenis_kelamin(rs.getString("JENIS_KELAMIN"));
                pasien.setAlamat(rs.getString("ALAMAT_PASIEN"));
            
                Poli poli = new Poli();
                poli.setId_poli(rs.getInt("ID_POLI"));
                poli.setDokter(d);
                poli.setNama_poli(rs.getString("NAMA_POLI"));
                poli.setKeterangan(rs.getString("KETERANGAN_POLI"));
            
                Rekamedik rekamedik = new Rekamedik();
                rekamedik.setNo_Rekamedik(rs.getInt("NO_REKAMEDIK"));
                rekamedik.setPasien(pasien);
                rekamedik.setPoli(poli);
                rekamedik.setBerat_badan(rs.getInt("BERAT_BADAN"));
                rekamedik.setSuhu_tubuh(rs.getString("SUHU_TUBUH"));
                rekamedik.setKeluhan(rs.getString("KELUHAN"));
                rekamedik.setTinggi_bagan(rs.getInt("TINGGI_BADAN"));
                rekamedik.setTanggal_kedatngan(rs.getDate("TANGGAL_KEDATANGAN"));
                rekamedik.setTekanan_darah(rs.getString("TEKANAN_DARAH"));
                
                this.arrRekamedik.add(rekamedik);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Rekamedik_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.arrRekamedik;
    }


}
