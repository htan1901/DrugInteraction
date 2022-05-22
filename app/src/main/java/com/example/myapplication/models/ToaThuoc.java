package com.example.myapplication.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToaThuoc {
    private String tieuDe;
    private LocalDate ngayTaiKham;
    private ArrayList<LoaiThuoc> danhSachLoaiThuoc;

    public ToaThuoc() { }

    public ToaThuoc(String title, LocalDate ngayTaiKham,ArrayList<LoaiThuoc> loaiThuoc) {
        this.tieuDe = title;
        this.ngayTaiKham = ngayTaiKham;
        this.danhSachLoaiThuoc = loaiThuoc;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getNgayTaiKham() {
        return ngayTaiKham;
    }

    public void setNgayTaiKham(LocalDate ngayTaiKham) {
        this.ngayTaiKham = ngayTaiKham;
    }

    public ArrayList<LoaiThuoc> getDanhSachLoaiThuoc() {
        return danhSachLoaiThuoc;
    }

    public void setDanhSachLoaiThuoc(ArrayList<LoaiThuoc> danhSachLoaiThuoc) {
        this.danhSachLoaiThuoc = danhSachLoaiThuoc;
    }
}
