package com.example.myapplication.models;

public class Thuoc {
    private String tenThuoc;
    private String donViTinh;

    public Thuoc() {}

    public Thuoc(String tenThuoc, String donViTinh) {
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public String getDonViTinh() {
        return donViTinh;
    }


    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

}
