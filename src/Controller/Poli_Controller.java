
package Controller;

import Model.Dokter;
import Model.Poli;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Poli_Controller {
    private Koneksi koneksi;
    ArrayList<Poli> arrPoli;
    
    public Poli_Controller(){
    this.koneksi = new Koneksi();
    this.arrPoli = new ArrayList<>();
    
    }
    
// INPUT DATA
    public void InputPoli(Poli poli){
         this.koneksi.ManipulasiData("INSERT INTO POLI_06993 (ID_POLI, ID_DOKTER, NAMA_POLI, KETERANGAN_POLI) "
                + " VALUES ("+poli.getId_poli()+","+poli.getDokter().getId_dokter()+",'"+poli.getNama_poli()+"','"+poli.getKeterangan()+"')");
    
    System.out.println("INSERT INTO POLI_06993  (ID_POLI, ID_DOKTER, NAMA_POLI, KETERANGAN_POLI )"
                + "VALUES ("+poli.getId_poli()+",'"+poli.getDokter()+"','"+poli.getNama_poli()+"','"+poli.getKeterangan()+"')");        
    }
    
// UPDATE DATA
   public void UpdatePoli(Poli poli){
   this.koneksi.ManipulasiData("UPDATE POLI_06993 SET "+" ID_DOKTER = "+poli.getDokter().getId_dokter()+","+" Nama_Poli = "
           + " '"+poli.getNama_poli()+"',"+" Keterangan_Poli = '"+poli.getKeterangan()+"' WHERE ID_POLI = " +poli.getId_poli() );
   System.out.println("UPDATE POLI_06993 SET "+" ID_DOKTER = "+poli.getDokter().getId_dokter()+","+" Nama_Poli = "
           + " '"+poli.getNama_poli()+"',"+" Keterangan_Poli = '"+poli.getKeterangan()+"' WHERE ID_POLI = " +poli.getId_poli());
           
   }
// DELETE DATA    
    public void DeletePoli(Poli poli){
            this.koneksi.ManipulasiData("DELETE FROM POLI_06993 WHERE ID_POLI = " + poli.getId_poli());
            
            System.out.println("DELETE FROM POLI_06993 WHERE ID_POLI = " + poli.getId_poli());  
    }
    
    

    public ArrayList<Poli> getDataPoli(){
        try {
            this.arrPoli.clear();
            ResultSet rs = this.koneksi.GetData("SELECT POLI_06993.*, DOKTER_06993.* FROM POLI_06993  JOIN DOKTER_06993  ON POLI_06993.ID_DOKTER = DOKTER_06993.ID_DOKTER ORDER BY ID_POLI ASC");
            while(rs.next()){
                Dokter d = new Dokter();
                d.setId_dokter(rs.getInt("ID_DOKTER"));
                d.setNama_dokter(rs.getString("NAMA_DOKTER"));
                d.setSpesialis(rs.getString("SPESIALIS"));
                d.setJenis_kelamin(rs.getString("JENIS_KELAMIN"));
                d.setTTL(rs.getDate("TTL"));
                
                
                Poli p = new Poli();
                p.setId_poli(rs.getInt("ID_POLI"));
                p.setDokter(d);
                p.setNama_poli(rs.getString("NAMA_POLI"));
                p.setKeterangan(rs.getString("KETERANGAN_POLI"));
            
                this.arrPoli.add(p);
            }
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return this.arrPoli;
    }
}
