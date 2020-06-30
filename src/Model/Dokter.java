package Model;

import java.util.Date;

public class Dokter {
    private Integer Id_dokter;
    private String Nama_dokter;
    private String Spesialis;
    private String Jenis_kelamin;
    private Date TTL;

    public Integer getId_dokter() {
        return Id_dokter;
    }

    public void setId_dokter(Integer Id_dokter) {
        this.Id_dokter = Id_dokter;
    }

    public String getNama_dokter() {
        return Nama_dokter;
    }

    public void setNama_dokter(String Nama_dokter) {
        this.Nama_dokter = Nama_dokter;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
    }

    public Date getTTL() {
        return TTL;
    }

    public void setTTL(Date TTL) {
        this.TTL = TTL;
    }

}
