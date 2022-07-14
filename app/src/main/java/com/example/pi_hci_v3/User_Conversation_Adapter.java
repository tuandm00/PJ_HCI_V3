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

public class User_Conversation_Adapter extends RecyclerView.Adapter<User_Conversation_Adapter.ViewHolder> {
    private ArrayList<com.example.pi_hci_v3.User_Conversation> userList;
    private OnItemClickListener listener;
    private com.example.pi_hci_v3.User_Conversation userchat;

    public User_Conversation_Adapter(ArrayList<com.example.pi_hci_v3.User_Conversation> userList, OnItemClickListener listener) {
        this.userList = userList;
        this.listener = listener;
    }

    public User_Conversation_Adapter(ArrayList<User_Conversation> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.conversation_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        com.example.pi_hci_v3.User_Conversation userChat = userList.get(position);

        holder.txtContent_1.setText(userChat.getContent_first());
        holder.txtTime_1.setText(userChat.getTime_first());
        holder.imgAvatar_1.setImageResource(userChat.getAvatar_first());

        holder.txtContent_2.setText(userChat.getContent_second());
        holder.txtTime_2.setText(userChat.getTime_second());
        holder.imgAvatar_2.setImageResource(userChat.getAvatar_second());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtContent_1, txtTime_1;
        TextView txtContent_2, txtTime_2;
        ImageView imgAvatar_1, imgAvatar_2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtContent_1 = itemView.findViewById(R.id.txtConvMessageContent);
            txtTime_1 = itemView.findViewById(R.id.txtConvTime);
            imgAvatar_1 = itemView.findViewById(R.id.imgConvAvatar);
            txtContent_2 = itemView.findViewById(R.id.txtConvMessageContent2);
            txtTime_2 = itemView.findViewById(R.id.txtConvTime2);
            imgAvatar_2 = itemView.findViewById(R.id.imgConvAvatar2);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    listener.onItemClick(userchat);
//                }
//            });
        }
    }

}
