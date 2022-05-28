package com.example.myapplication.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ThemToaThuocActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_toa_thuoc);
        ImageButton doneButton = findViewById(R.id.them_toa_thuoc_activity_xong);
        ImageButton themThuocButton = findViewById(R.id.them_toa_thuoc_activity_them_thuoc_button);
        ImageButton navigateNhapButton = findViewById(R.id.them_toa_thuoc_activity_navigate_nhap);
        ImageButton navigateChupButton = findViewById(R.id.them_toa_thuoc_activity_navigate_chup);
    }
}
