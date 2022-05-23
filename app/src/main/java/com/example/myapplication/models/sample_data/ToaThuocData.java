package com.example.myapplication.models.sample_data;


import android.annotation.SuppressLint;

import com.example.myapplication.models.Thuoc;
import com.example.myapplication.models.ToaThuoc;
import com.example.myapplication.models.LoaiThuoc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ToaThuocData {
    @SuppressLint("NewApi")
    public static ArrayList<ToaThuoc> data = new ArrayList<>(Arrays.asList(
            new ToaThuoc(
                    "Toa thuốc 1",
                    LocalDate.parse("2022-12-05", DateTimeFormatter.ISO_LOCAL_DATE),
                    new ArrayList<LoaiThuoc>(Arrays.asList(
                            new LoaiThuoc(
                                    new Thuoc("Paracetamol", "mg"),
                                    20,
                                    "Ngày 2 lần, mỗi lần 2 viên, sau ăn"
                            ),
                            new LoaiThuoc(
                                    new Thuoc("Panadol", "viên"),
                                    30,
                                    "Ngày 3 lần, lần 1 viên, sau ăn"
                            ),
                            new LoaiThuoc(
                                    new Thuoc("Lúa mạch lên men", "lon"),
                                    100,
                                    "Ngày 10 lon, mọi lúc, uống thay nước"
                            )
                    ))
            ),
            new ToaThuoc(
                    "Toa thuốc 2" ,
                    LocalDate.parse("2022-09-12", DateTimeFormatter.ISO_LOCAL_DATE),
                    new ArrayList<LoaiThuoc>(Arrays.asList(
                            new LoaiThuoc(
                                    new Thuoc("Gạo lên men", "lít"),
                                    100,
                                    "Ngày 2 lít"
                            ),
                            new LoaiThuoc(
                                    new Thuoc("LSD", "viên"),
                                    10,
                                    "Ngày 1 viên"
                            )
                    ))
            )
    ));
}
