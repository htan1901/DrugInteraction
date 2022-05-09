package com.example.myapplication.data_objects;

public class Thuoc {
    private String tenThuoc;
    private String donViTinh;
    private String lieuDung;

    public Thuoc() {}

    public Thuoc(String tenThuoc, String donViTinh, String lieuDung) {
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
        this.lieuDung = lieuDung;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public String getLieuDung() {
        return lieuDung;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public void setLieuDung(String lieuDung) {
        this.lieuDung = lieuDung;
    }
}
