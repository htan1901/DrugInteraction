package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.adapters.ThuocAdapter;
import com.example.myapplication.models.LoaiThuoc;

import java.util.ArrayList;

public class ToaThuocActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toa_thuoc);

        TextView tieuDe = findViewById(R.id.tieu_de_toa_thuoc);
        TextView ngayTaiKham = findViewById(R.id.toa_thuoc_ngay_tai_kham);
        ListView danhSachThuoc = findViewById(R.id.lv_loai_thuoc);
        Button back = findViewById(R.id.toa_thuoc_back);

        Intent intent = getIntent();
        Bundle dataFromMain = intent.getBundleExtra("data");
        String strTieuDe = dataFromMain.getString("tieuDe");
        String strNgayTaiKham = dataFromMain.getString("ngayTaiKham");
        ArrayList<LoaiThuoc> danhSachLoaiThuoc = dataFromMain.getParcelableArrayList("danhSachLoaiThuoc");
        ThuocAdapter thuocAdapter = new ThuocAdapter(danhSachLoaiThuoc);
        tieuDe.setText(strTieuDe);
        ngayTaiKham.setText(strNgayTaiKham);
        danhSachThuoc.setAdapter(thuocAdapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
