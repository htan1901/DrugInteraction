package com.example.myapplication.models.sample_data;


import com.example.myapplication.models.Thuoc;
import com.example.myapplication.models.ToaThuoc;
import com.example.myapplication.models.ToaThuocItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ToaThuocData {
    public static ArrayList<ToaThuoc> data = new ArrayList<>(Arrays.asList(
            new ToaThuoc(
                    "Toa thuốc 1",
                    new Date(2020, 12, 19),
                    new ArrayList<ToaThuocItem>(Arrays.asList(
                            new ToaThuocItem(
                                    new Thuoc("Paracetamol", "mg"),
                                    20,
                                    "Ngày 2 lần, mỗi lần 2 viên, sau ăn"
                            ),
                            new ToaThuocItem(
                                    new Thuoc("Panadol", "viên"),
                                    30,
                                    "Ngày 3 lần, lần 1 viên, sau ăn"
                            ),
                            new ToaThuocItem(
                                    new Thuoc("Lúa mạch lên men", "lon"),
                                    100,
                                    "Ngày 10 lon, mọi lúc, uống thay nước"
                            )
                    ))
            ),
            new ToaThuoc(
                    "Toa thuốc 2" ,
                    new Date(2022, 5, 6),
                    new ArrayList<ToaThuocItem>(Arrays.asList(
                            new ToaThuocItem(
                                    new Thuoc("Gạo lên men", "lít"),
                                    100,
                                    "Ngày 2 lít"
                            ),
                            new ToaThuocItem(
                                    new Thuoc("LSD", "viên"),
                                    10,
                                    "Ngày 1 viên"
                            )
                    ))
            )
    ));
}
