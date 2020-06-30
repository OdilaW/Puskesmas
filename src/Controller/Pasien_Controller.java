package Controller;

import Model.Pasien;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Pasien_Controller {
    private Koneksi koneksi;
    ArrayList<Pasien> arrpasien;

    public Pasien_Controller(){
        this.koneksi = new Koneksi();
        this.arrpasien=new ArrayList<>();
    }
    
// INPUT DATA    
    public void insertPasien(Pasien pasien) {
        String TanggalLahir = new SimpleDateFormat("dd/MM/yyyy").format(pasien.getTanggal_Lahir());
        
        this.koneksi.ManipulasiData("INSERT INTO PASIEN_06993 (ID_PASIEN, NAMA_PASIEN, UMUR_PASIEN, NO_TELP, TTL, JENIS_KELAMIN, ALAMAT_PASIEN) "
                + "VALUES ('"+pasien.getId_pasien()+"','"+ pasien.getNama_pasien() +"','"+ pasien.getUmur_pasien()+"','"+ pasien.getNo_telp() +"', "
                + "TO_DATE('"+ TanggalLahir +"','dd/mm/yyyy'),'"+ pasien.getJenis_kelamin() +"', '"+ pasien.getAlamat() +"')");
        System.out.println("INSERT INTO PASIEN_06993 (ID_PASIEN, NAMA_PASIEN, UMUR_PASIEN, NO_TELP, TTL, JENIS_KELAMIN, ALAMAT_PASIEN) "
                + "VALUES ('"+pasien.getId_pasien()+"','"+ pasien.getNama_pasien() +"','"+ pasien.getUmur_pasien()+"','"+ pasien.getNo_telp() +"', "
                        + "TO_DATE('"+ TanggalLahir +"','dd/mm/yyyy'),"
                + "'"+ pasien.getJenis_kelamin() +"', '"+ pasien.getAlamat() +"')");
    }
    
// Delete Data Per BARIS    
    public void deletePasien(Pasien pasien){
        this.koneksi.ManipulasiData("DELETE FROM PASIEN_06993 WHERE ID_PASIEN = " + pasien.getId_pasien());
    }
   
// CLEAR SEMUA DATA PADA TABLE    
    public void clear() {
        String kodeSql = "DELETE FROM Buku_07015";
        this.koneksi.ManipulasiData(kodeSql);
    }

//UPDATE DATA PASIEN
    public void UpdatePasien(Pasien pasien){
        String TanggalLahir = new SimpleDateFormat("yyyy-mm-dd").format(pasien.getTanggal_Lahir());
        
        this.koneksi.ManipulasiData("UPDATE PASIEN_06993 SET "+" Nama_Pasien = '"+ pasien.getNama_pasien() +"',"+" Umur_Pasien ="
                + "'"+pasien.getUmur_pasien()+"',"+" No_Telp = '"+pasien.getNo_telp()+"',"+" TTL = TO_DATE('"+TanggalLahir+"','yyyy-mm-dd'),"
                + " "+" Alamat_Pasien = '"+pasien.getAlamat()+"',"+" Jenis_Kelamin = '"+pasien.getJenis_kelamin()+"' "
                + "WHERE ID_PASIEN = " + pasien.getId_pasien());
       System.out.println("UPDATE PASIEN_06993 SET "+" Nama_Pasien = '"+ pasien.getNama_pasien() +"',"+" Umur_Pasien ="
                + ""+pasien.getUmur_pasien()+","+" No_Telp = "+pasien.getNo_telp()+","+" TTL = TO_DATE('"+TanggalLahir+"','yyyy-mm-dd'),"
                + " "+" Alamat_Pasien = '"+pasien.getAlamat()+"',"+" Jenis_Kelamin = '"+pasien.getJenis_kelamin()+"' "
                + "WHERE ID_PASIEN = " + pasien.getId_pasien());
    }

    
    public ArrayList<Pasien> getDataPasien() throws SQLException {
        this.arrpasien.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM PASIEN_06993 ORDER BY ID_PASIEN ASC");
        while (rs.next()) {
           Pasien pasien = new Pasien();
           pasien.setId_pasien(rs.getInt("ID_PASIEN"));
           pasien.setNama_pasien(rs.getString("NAMA_PASIEN"));
           pasien.setUmur_pasien(rs.getInt("UMUR_PASIEN"));
           pasien.setNo_telp(rs.getInt("NO_TELP"));
           pasien.setTanggal_Lahir(rs.getDate("TTL"));
           pasien.setJenis_kelamin(rs.getString("JENIS_KELAMIN"));
           pasien.setAlamat(rs.getString("ALAMAT_PASIEN"));
           
           this.arrpasien.add(pasien);
        }
        return this.arrpasien;
    }
    
}
