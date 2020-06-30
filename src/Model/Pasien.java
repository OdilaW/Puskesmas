
package Model;

import java.util.Date;


public class Pasien {
    private Integer Id_pasien;
    private String Nama_pasien;
    private Integer Umur_pasien;
    private Integer No_telp;
    private Date Tanggal_Lahir;
    private String Jenis_kelamin;
    private String Alamat;

    public Integer getId_pasien() {
        return Id_pasien;
    }

    public void setId_pasien(Integer Id_pasien) {
        this.Id_pasien = Id_pasien;
    }

    public String getNama_pasien() {
        return Nama_pasien;
    }

    public void setNama_pasien(String Nama_pasien) {
        this.Nama_pasien = Nama_pasien;
    }

    public Integer getUmur_pasien() {
        return Umur_pasien;
    }

    public void setUmur_pasien(Integer Umur_pasien) {
        this.Umur_pasien = Umur_pasien;
    }

    public Integer getNo_telp() {
        return No_telp;
    }

    public void setNo_telp(Integer No_telp) {
        this.No_telp = No_telp;
    }

    public Date getTanggal_Lahir() {
        return Tanggal_Lahir;
    }

    public void setTanggal_Lahir(Date Tanggal_Lahir) {
        this.Tanggal_Lahir = Tanggal_Lahir;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    

}
