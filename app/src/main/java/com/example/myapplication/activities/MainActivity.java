package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.adapters.ToaThuocAdapter;
import com.example.myapplication.models.Thuoc;
import com.example.myapplication.models.ToaThuoc;
import com.example.myapplication.models.sample_data.ToaThuocData;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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
                Intent intent = new Intent(MainActivity.this, ToaThuocActivity.class);
                startActivity(intent);
            }
        });
    }
}