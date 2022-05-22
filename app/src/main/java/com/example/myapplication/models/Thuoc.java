package com.example.myapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Thuoc implements Parcelable {
    private String tenThuoc;
    private String donViTinh;

    public Thuoc() {}

    public Thuoc(String tenThuoc, String donViTinh) {
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
    }

    public static final Creator<Thuoc> CREATOR = new Creator<Thuoc>() {
        @Override
        public Thuoc createFromParcel(Parcel in) {
            return new Thuoc(in);
        }

        @Override
        public Thuoc[] newArray(int size) {
            return new Thuoc[size];
        }
    };

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

    public Thuoc(Parcel in) {
        this.tenThuoc = in.readString();
        this.donViTinh = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(tenThuoc);
        parcel.writeString(donViTinh);

    }
}
