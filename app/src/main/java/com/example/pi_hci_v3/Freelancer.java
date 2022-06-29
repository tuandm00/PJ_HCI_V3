package com.example.pi_hci_v3;

public class Freelancer {
    private String Tieude;
    private String Giatien;
    private String Noidung;
    private String Nguoituyendung, Diadiem, Kinang, Ngaydang;

    public Freelancer(String tieude, String giatien, String noidung, String nguoituyendung, String diadiem, String kinang, String ngaydang) {
        Tieude = tieude;
        Giatien = giatien;
        Noidung = noidung;
        Nguoituyendung = nguoituyendung;
        Diadiem = diadiem;
        Kinang = kinang;
        Ngaydang = ngaydang;
    }

    public String getTieude() {
        return Tieude;
    }

    public void setTieude(String tieude) {
        Tieude = tieude;
    }

    public String getGiatien() {
        return Giatien;
    }

    public void setGiatien(String giatien) {
        Giatien = giatien;
    }

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String noidung) {
        Noidung = noidung;
    }

    public String getNguoituyendung() {
        return Nguoituyendung;
    }

    public void setNguoituyendung(String nguoituyendung) {
        Nguoituyendung = nguoituyendung;
    }

    public String getDiadiem() {
        return Diadiem;
    }

    public void setDiadiem(String diadiem) {
        Diadiem = diadiem;
    }

    public String getKinang() {
        return Kinang;
    }

    public void setKinang(String kinang) {
        Kinang = kinang;
    }

    public String getNgaydang() {
        return Ngaydang;
    }

    public void setNgaydang(String ngaydang) {
        Ngaydang = ngaydang;
    }
}
