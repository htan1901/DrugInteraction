package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.ToaThuocAdapter;
import com.example.myapplication.models.ToaThuoc;
import com.example.myapplication.models.sample_data.ToaThuocData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOption);
        ListView listViewToaThuoc = findViewById(R.id.list_view_toa_thuoc);
        ToaThuocAdapter toaThuocAdapter = new ToaThuocAdapter(ToaThuocData.data);

        listViewToaThuoc.setAdapter(toaThuocAdapter);
        listViewToaThuoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle toaThuocFromMain = new Bundle();
                ToaThuoc toaThuocHienTai = (ToaThuoc) adapterView.getItemAtPosition(i);
                toaThuocFromMain.putString("tieuDe", toaThuocHienTai.getTieuDe());
                toaThuocFromMain.putString("ngayTaiKham", toaThuocHienTai.getNgayTaiKham().toString());
                toaThuocFromMain.putParcelableArrayList("danhSachLoaiThuoc", toaThuocHienTai.getDanhSachLoaiThuoc());
                Intent intent = new Intent(MainActivity.this, ToaThuocActivity.class);
                intent.putExtra("data", toaThuocFromMain);
                startActivity(intent);
            }
        });
    }
}