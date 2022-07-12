package com.example.pi_hci_v3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FreelancerAdapter extends RecyclerView.Adapter<FreelancerAdapter.ViewHolder> {
    private ArrayList<com.example.pi_hci_v3.Freelancer> freelancerArrayList;
    private OnItemClickListener listener;
    private com.example.pi_hci_v3.Freelancer freelancer;
    public FreelancerAdapter(ArrayList<com.example.pi_hci_v3.Freelancer> userList, OnItemClickListener listener) {
        this.freelancerArrayList = userList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.formation, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        com.example.pi_hci_v3.Freelancer freelancer = freelancerArrayList.get(position);

        holder.txtTieude.setText("Tiêu đề: "+freelancer.getTieude()+"\n");
        holder.txtGiatien.setText("Giá: "+freelancer.getGiatien()+"\n");
        holder.txtNoidung.setText("Nội dung: "+freelancer.getNoidung()+"\n");
        holder.txtNgtuyendung.setText("Người tuyển dụng: "+freelancer.getNguoituyendung()+"\n");
        holder.txtDiadiem.setText("Địa điểm: "+freelancer.getDiadiem()+"\n");
        holder.txtKyang.setText("Kỹ năng: "+freelancer.getKinang()+"\n");
        holder.txtNgaydang.setText("Ngày đăng: "+freelancer.getNgaydang()+"\n");

    }

    @Override
    public int getItemCount() {
        return freelancerArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTieude, txtGiatien, txtNoidung, txtNgtuyendung, txtDiadiem, txtKyang, txtNgaydang;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTieude = itemView.findViewById(R.id.textViewTieude);
            txtGiatien = itemView.findViewById(R.id.textViewGia);
            txtNoidung = itemView.findViewById(R.id.textViewNoidung);
            txtNgtuyendung = itemView.findViewById(R.id.textViewNguoituyendung);
            txtDiadiem = itemView.findViewById(R.id.textViewDiadiem);
            txtKyang = itemView.findViewById(R.id.textViewKynang);
            txtNgaydang = itemView.findViewById(R.id.textViewNgaydang);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(freelancer);
                }
            });

        }
    }

}
