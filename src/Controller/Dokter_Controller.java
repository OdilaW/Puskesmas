package Controller;

import Model.Dokter;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Dokter_Controller {
    
    private Koneksi koneksi;
    ArrayList<Dokter> arrdokter;
    
    public Dokter_Controller(){
        this.koneksi = new Koneksi();
        this.arrdokter = new ArrayList<>();
    }
    
// INPUT DATA DOKTER    
    public void insertDokter(Dokter dokter) {
        String TanggalLahir = new SimpleDateFormat("dd/MM/yyyy").format(dokter.getTTL());
        
        this.koneksi.ManipulasiData("INSERT INTO DOKTER_06993 (ID_DOKTER, NAMA_DOKTER, SPESIALIS, TTL, JENIS_KELAMIN) "
                + "VALUES ('"+dokter.getId_dokter()+"','"+dokter.getNama_dokter()+"','"+dokter.getSpesialis()+"', "
                + "TO_DATE('"+ TanggalLahir +"','dd/mm/yyyy'),'"+dokter.getJenis_kelamin()+"')");
        System.out.println("INSERT INTO DOKTER_06993 (ID_DOKTER, NAMA_DOKTER, SPESIALIS, TTL, JENIS_KELAMIN) "
                + "VALUES ('"+dokter.getId_dokter()+"','"+dokter.getNama_dokter()+"','"+dokter.getSpesialis()+"', "
                + "TO_DATE('"+ TanggalLahir +"','dd/mm/yyyy'),'"+dokter.getJenis_kelamin()+"')");
    }

// UPDATE DATA DOKTER
    public void UpdatePasien(Dokter dokter){
        String TanggalLahir = new SimpleDateFormat("yyyy-mm-dd").format(dokter.getTTL());
        
        this.koneksi.ManipulasiData("UPDATE DOKTER_06993 SET "+" Nama_Dokter = '"+ dokter.getNama_dokter() +"',"+" Spesialis ="
                + "'"+dokter.getSpesialis()+"',"+" Jenis_Kelamin = '"+dokter.getJenis_kelamin()+"',"+" TTL = TO_DATE('"+TanggalLahir+"','yyyy-mm-dd')"
                + " WHERE ID_DOKTER = " + dokter.getId_dokter());
       System.out.println("UPDATE DOKTER_06993 SET "+" Nama_Dokter = '"+ dokter.getNama_dokter() +"',"+" Spesialis ="
                + "'"+dokter.getSpesialis()+"',"+" Jenis_kelamin = '"+dokter.getJenis_kelamin()+"',"+" TTL = TO_DATE('"+TanggalLahir+"','yyyy-mm-dd')'"
                + " WHERE ID_DOKTER = " + dokter.getId_dokter());
              
    }
    
// DELETE DATA DOKTER
   public void DeleteDokter(Dokter dokter){
       this.koneksi.ManipulasiData("DELETE FROM DOKTER_06993 WHERE ID_DOKTER = " + dokter.getId_dokter());
   } 
    
    public ArrayList<Dokter> getDataDokter() throws SQLException {
        this.arrdokter.clear();
        ResultSet rs =  this.koneksi.GetData("SELECT * FROM DOKTER_06993");
        while (rs.next()){
            Dokter d = new Dokter();
            d.setId_dokter(rs.getInt("ID_DOKTER"));
            d.setNama_dokter(rs.getString("NAMA_DOKTER"));
            d.setSpesialis(rs.getString("SPESIALIS"));
            d.setJenis_kelamin(rs.getString("JENIS_KELAMIN"));
            d.setTTL(rs.getDate("TTL"));
            this.arrdokter.add(d);
        }
        return this.arrdokter;
    
    }

}
