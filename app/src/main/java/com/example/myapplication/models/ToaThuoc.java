package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class ToaThuoc {
    private String tieuDe;
    private Date ngayTaiKham;
    private ArrayList<ToaThuocItem> loaiThuoc;

    public ToaThuoc() { }

    public ToaThuoc(String title, Date ngayTaiKham,ArrayList<ToaThuocItem> loaiThuoc) {
        this.tieuDe = title;
        this.ngayTaiKham = ngayTaiKham;
        this.loaiThuoc = loaiThuoc;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public Date getNgayTaiKham() {
        return ngayTaiKham;
    }

    public void setNgayTaiKham(Date ngayTaiKham) {
        this.ngayTaiKham = ngayTaiKham;
    }

    public ArrayList<ToaThuocItem> getLoaiThuoc() {
        return loaiThuoc;
    }

    public void setLoaiThuoc(ArrayList<ToaThuocItem> loaiThuoc) {
        this.loaiThuoc = loaiThuoc;
    }
}
