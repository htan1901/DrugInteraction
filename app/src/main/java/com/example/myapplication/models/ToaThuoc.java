package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.Date;

public class ToaThuoc {
    private String tieuDe;
    private Date ngayTaiKham;
    private ArrayList<Thuoc> loaiThuoc;

    public ToaThuoc() { }

    public ToaThuoc(String title, Date ngayTaiKham, ArrayList<Thuoc> loaiThuoc) {
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

    public ArrayList<Thuoc> getLoaiThuoc() {
        return loaiThuoc;
    }

    public void setLoaiThuoc(ArrayList<Thuoc> loaiThuoc) {
        this.loaiThuoc = loaiThuoc;
    }
}
