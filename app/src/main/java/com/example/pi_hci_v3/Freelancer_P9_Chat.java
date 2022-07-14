package com.example.pi_hci_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Freelancer_P9_Chat extends AppCompatActivity {
    ArrayList<User_Chat>  userList;
    BottomNavigationView nav;
    Button btnChangeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p9_chat);

        RecyclerView rvUser = findViewById(R.id.rvChat);
        btnChangeLayout = (Button) findViewById(R.id.btnChangeLayout);

        btnChangeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P9_Chat.this, User_Message_Conversation.class);
                startActivity(intent);
            }
        });

        userList = new ArrayList<>();

        userList.add(new User_Chat("Thao Nguyen", "Đây là những gì mà chúng ta bàn", "14:59", R.drawable.avatar1));
        userList.add(new User_Chat("HauNT", "Đây là  chúng ta bàn", "14:59", R.drawable.avatar2));
        userList.add(new User_Chat("BaoCG", "Đây là  mà chúng ta bàn", "14:59", R.drawable.book));
        userList.add(new User_Chat("Test", "Đây là  gì mà chúng ta bàn", "14:59", R.drawable.back));

        User_Chat_Adapter adapter = new User_Chat_Adapter(userList);
        rvUser.setAdapter(adapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));

        //        Menu
        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        Toast.makeText(Freelancer_P9_Chat.this,"Trang Chủ", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(Freelancer_P9_Chat.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(Freelancer_P9_Chat.this,"Tìm kiếm", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(Freelancer_P9_Chat.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(Freelancer_P9_Chat.this,"Lưu", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(Freelancer_P9_Chat.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(Freelancer_P9_Chat.this,"Trang Cá Nhân", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(Freelancer_P9_Chat.this, Freelancer_P7.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });



    }
//    @Override
//    public void onItemClick(User_Chat userchat) {
//        Intent intent = new Intent(Freelancer_P9_Chat.this, Freelancer_P3.class);
//        startActivity(intent);
//    }
}