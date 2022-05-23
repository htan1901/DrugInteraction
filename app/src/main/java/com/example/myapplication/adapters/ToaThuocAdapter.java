package com.example.myapplication.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.models.ToaThuoc;
import com.example.myapplication.utils.Utils;

import java.util.ArrayList;
import java.util.Date;

public class ToaThuocAdapter extends BaseAdapter {
    private ArrayList<ToaThuoc> listToaThuoc = new ArrayList<>();

    public ToaThuocAdapter() {}

    public ToaThuocAdapter(ArrayList<ToaThuoc> listToaThuoc) {
        this.listToaThuoc = listToaThuoc;
    }

    @Override
    public int getCount() {
        return listToaThuoc.size();
    }

    @Override
    public ToaThuoc getItem(int i) {
        return listToaThuoc.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View toaThuocView;
        if(view == null)
            toaThuocView = View.inflate(viewGroup.getContext(), R.layout.list_view_item_toa_thuoc,null);
        else
            toaThuocView = view;
        ToaThuoc toaThuoc = getItem(i);
        TextView soThuTu = toaThuocView.findViewById(R.id.toa_thuoc_lv_item_stt);
        TextView tieuDe = toaThuocView.findViewById(R.id.toa_thuoc_lv_item_tieu_de);
        TextView taiKham = toaThuocView.findViewById(R.id.toa_thuoc_lv_item_ngay_tai_kham);
        soThuTu.setText(i +1 + ". ");
        tieuDe.setText(toaThuoc.getTieuDe());
        taiKham.setText(toaThuoc.getNgayTaiKham().toString());
        return toaThuocView;
    }
}
