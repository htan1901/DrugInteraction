package com.example.myapplication.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.models.LoaiThuoc;

import java.util.ArrayList;

public class ThuocAdapter extends BaseAdapter {
    private ArrayList<LoaiThuoc> listLoaiThuoc = new ArrayList<>();

    public ThuocAdapter() {
    }

    public ThuocAdapter(ArrayList<LoaiThuoc> listThuoc) {
        this.listLoaiThuoc = listThuoc;
    }

    @Override
    public int getCount() {
        return listLoaiThuoc.size();
    }

    @Override
    public Object getItem(int i) {
        return listLoaiThuoc.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View loaiThuocView;
        if (view == null)
            loaiThuocView = View.inflate(viewGroup.getContext(), R.layout.list_view_item_loai_thuoc, null);
        else
            loaiThuocView = view;
        TextView soThuTu = loaiThuocView.findViewById(R.id.loai_thuoc_lv_item_stt);
        TextView tenThuoc = loaiThuocView.findViewById(R.id.loai_thuoc_lv_item_ten_thuoc);
        TextView soLuong = loaiThuocView.findViewById(R.id.loai_thuoc_lv_item_so_luong);
        TextView donVi = loaiThuocView.findViewById(R.id.loai_thuoc_lv_item_don_vi);
        TextView lieuDung = loaiThuocView.findViewById(R.id.loai_thuoc_lv_item_lieu_dung);
        LoaiThuoc loaiThuoc = listLoaiThuoc.get(i);
        soThuTu.setText(i+1 + ". ");
        tenThuoc.setText(loaiThuoc.getThuoc().getTenThuoc());
        soLuong.setText(loaiThuoc.getSoLuong() + "");
        donVi.setText(loaiThuoc.getThuoc().getDonViTinh());
        lieuDung.setText(loaiThuoc.getLieuDung());
        return loaiThuocView;
    }
}
