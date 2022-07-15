package com.example.pi_hci_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class User_Message_Conversation extends AppCompatActivity {
    ArrayList<User_Conversation>  userList;
    ImageView   imgGoBack, imgCompanyAvatar;
    RelativeLayout  rlUI;


    // Context Menu de báo cáo người dùng nếu có dấu hiệu lừa đảo
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_message_conversation);

        RecyclerView rvUser = findViewById(R.id.rvConversation);
        imgGoBack = (ImageView) findViewById(R.id.imgConvBack);
        imgCompanyAvatar = (ImageView) findViewById(R.id.imgCompanyChatAvatar);
        rlUI = (RelativeLayout) findViewById(R.id.rlUI);

        // Khai báo Context Menu, gắn nó vô Avatar
        registerForContextMenu(imgCompanyAvatar);

        userList = new ArrayList<>();

        userList.add(new User_Conversation("This is quite OK", "Ok yes I am trying it", "14:50", "15:03", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Alright! So about the payment", "Yep, let's here about it", "15:50", "16:03", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Alright! So about the payment", "Yep, let's here about it", "15:50", "16:03", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Alright! So about the payment", "Yep, let's here about it. This is just a text about having an O clock and today is about in the lamian and", "15:50", "16:03", R.drawable.avatar1, R.drawable.avatar2));

        User_Conversation_Adapter adapter = new User_Conversation_Adapter(userList);
        rvUser.setAdapter(adapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));

        imgGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User_Message_Conversation.this, Freelancer_P9_Chat.class);
                startActivity(intent);
            }
        });


    }
}