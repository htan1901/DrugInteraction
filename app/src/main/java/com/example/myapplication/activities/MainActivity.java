package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.ToaThuocAdapter;
import com.example.myapplication.models.Thuoc;
import com.example.myapplication.models.ToaThuoc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ToaThuoc> danhSachToaThuoc = new ArrayList<>();
//    function nay chi de tao du lieu mau, xoa khi co du lieu dung
    private void buildSampleData(int len) {
        for (int i = 0; i < len; i++) {
            String tieuDe = "Tieu de toa thuoc " + i;
            Date ngayTaiKham = new Date();
            ArrayList<Thuoc> danhSachThuoc = new ArrayList<>();
            Random random = new Random();
            int soLuongThuoc = random.nextInt(10)+1;
            for (int j = 0; j < soLuongThuoc; j++) {
                Thuoc t = new Thuoc();
                t.setTenThuoc("Ten thuoc " + j);
                t.setDonViTinh("Don vi tinh " + j);
                t.setLieuDung("Lieu dung " + j);
                danhSachThuoc.add(t);
            }
            danhSachToaThuoc.add(new ToaThuoc(tieuDe,ngayTaiKham,danhSachThuoc));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildSampleData(5);
        ListView listViewToaThuoc = findViewById(R.id.list_view_toa_thuoc);
        ToaThuocAdapter toaThuocAdapter = new ToaThuocAdapter(danhSachToaThuoc);

        listViewToaThuoc.setAdapter(toaThuocAdapter);

        Button themToaThuocButton = findViewById(R.id.main_screen_button_add);

        themToaThuocButton.setOnClickListener(view -> {
            Intent themToaThuocNavigationIntent = new Intent(MainActivity.this, ThemToaThuocActivity.class);
            startActivity(themToaThuocNavigationIntent);

        });

    }
}