
package Model;


public class Poli {
    private Integer Id_poli;
    private Dokter dokter;
    private String Nama_poli;
    private String Keterangan;

    public Integer getId_poli() {
        return Id_poli;
    }

    public void setId_poli(Integer Id_poli) {
        this.Id_poli = Id_poli;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public String getNama_poli() {
        return Nama_poli;
    }

    public void setNama_poli(String Nama_poli) {
        this.Nama_poli = Nama_poli;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }
}
