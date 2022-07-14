package com.example.pi_hci_v3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class User_Chat_Adapter extends RecyclerView.Adapter<User_Chat_Adapter.ViewHolder> {
    private ArrayList<com.example.pi_hci_v3.User_Chat> userList;
    private OnItemClickListener listener;
    private com.example.pi_hci_v3.User_Chat userchat;

    public User_Chat_Adapter(ArrayList<com.example.pi_hci_v3.User_Chat> userList, OnItemClickListener listener) {
        this.userList = userList;
        this.listener = listener;
    }

    public User_Chat_Adapter(ArrayList<User_Chat> userList) {
        this.userList = userList;
    }

//    public User_Chat_Adapter(ArrayList<User_Chat> userList) {
//        this.userList = userList;
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.row_chat, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        com.example.pi_hci_v3.User_Chat userChat = userList.get(position);

        holder.txtTen.setText(userChat.getName());
        holder.txtNoidung.setText(userChat.getContent());
        holder.txtThoigian.setText(userChat.getTime());
        holder.imgAvatar.setImageResource(userChat.getAvatar());


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTen, txtNoidung, txtThoigian;
        ImageView   imgAvatar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTen = itemView.findViewById(R.id.txtName);
            txtNoidung = itemView.findViewById(R.id.txtMessageContent);
            txtThoigian = itemView.findViewById(R.id.txtTime);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    listener.onItemClick(userchat);
//                }
//            });
        }
    }

}
