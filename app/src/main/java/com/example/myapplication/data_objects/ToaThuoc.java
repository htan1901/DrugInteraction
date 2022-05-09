package com.example.myapplication.data_objects;

import java.util.ArrayList;
import java.util.Date;

public class ToaThuoc {
    private String title;
    private Date ngayTaiKham;
    private ArrayList<Thuoc> loaiThuoc;

    public ToaThuoc() { }

    public ToaThuoc(String title, Date ngayTaiKham, ArrayList<Thuoc> loaiThuoc) {
        this.title = title;
        this.ngayTaiKham = ngayTaiKham;
        this.loaiThuoc = loaiThuoc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
