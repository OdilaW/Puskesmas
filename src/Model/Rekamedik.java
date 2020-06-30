package Model;

import java.util.Date;

public class Rekamedik {
    private Integer No_Rekamedik;
    private Pasien pasien;
    private Poli poli;
    private Integer Berat_badan;
    private String Suhu_tubuh;
    private String keluhan;
    private Integer Tinggi_bagan;
    private Date Tanggal_kedatngan;
    private String Tekanan_darah;

    public Integer getNo_Rekamedik() {
        return No_Rekamedik;
    }

    public void setNo_Rekamedik(Integer No_Rekamedik) {
        this.No_Rekamedik = No_Rekamedik;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Poli getPoli() {
        return poli;
    }

    public void setPoli(Poli poli) {
        this.poli = poli;
    }

    public Integer getBerat_badan() {
        return Berat_badan;
    }

    public void setBerat_badan(Integer Berat_badan) {
        this.Berat_badan = Berat_badan;
    }

    public String getSuhu_tubuh() {
        return Suhu_tubuh;
    }

    public void setSuhu_tubuh(String Suhu_tubuh) {
        this.Suhu_tubuh = Suhu_tubuh;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public Integer getTinggi_bagan() {
        return Tinggi_bagan;
    }

    public void setTinggi_bagan(Integer Tinggi_bagan) {
        this.Tinggi_bagan = Tinggi_bagan;
    }

    public Date getTanggal_kedatngan() {
        return Tanggal_kedatngan;
    }

    public void setTanggal_kedatngan(Date Tanggal_kedatngan) {
        this.Tanggal_kedatngan = Tanggal_kedatngan;
    }

    public String getTekanan_darah() {
        return Tekanan_darah;
    }

    public void setTekanan_darah(String Tekanan_darah) {
        this.Tekanan_darah = Tekanan_darah;
    }
    
    
}
