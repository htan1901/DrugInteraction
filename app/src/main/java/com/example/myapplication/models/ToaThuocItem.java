package com.example.myapplication.models;

public class ToaThuocItem {
    private Thuoc tenThuoc;
    private int soLuong;
    private String lieuDung;

    public ToaThuocItem(Thuoc tenThuoc, int soLuong, String lieuDung) {
        this.tenThuoc = tenThuoc;
        this.soLuong = soLuong;
        this.lieuDung = lieuDung;
    }

    public Thuoc getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(Thuoc tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLieuDung() {
        return lieuDung;
    }

    public void setLieuDung(String lieuDung) {
        this.lieuDung = lieuDung;
    }
}
