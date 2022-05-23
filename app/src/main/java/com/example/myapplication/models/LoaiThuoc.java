package com.example.myapplication.models;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class LoaiThuoc implements Parcelable {
    private Thuoc thuoc;
    private int soLuong;
    private String lieuDung;

    public LoaiThuoc(Thuoc tenThuoc, int soLuong, String lieuDung) {
        this.thuoc = tenThuoc;
        this.soLuong = soLuong;
        this.lieuDung = lieuDung;
    }

    public Thuoc getThuoc() {
        return thuoc;
    }

    public void setThuoc(Thuoc thuoc) {
        this.thuoc = thuoc;
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

    // parcel part

    public LoaiThuoc(Parcel in) {
        this.thuoc = (Thuoc) in.readParcelable(Thuoc.class.getClassLoader());
        this.soLuong = in.readInt();
        this.lieuDung = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(thuoc, i);
        parcel.writeInt(soLuong);
        parcel.writeString(lieuDung);
    }

    public static final Creator<LoaiThuoc> CREATOR = new Creator<LoaiThuoc>() {
        @Override
        public LoaiThuoc createFromParcel(Parcel in) {
            return new LoaiThuoc(in);
        }

        @Override
        public LoaiThuoc[] newArray(int size) {
            return new LoaiThuoc[size];
        }
    };
}
