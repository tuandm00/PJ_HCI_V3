package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class cv_user extends AppCompatActivity {
    Button btneditcv, btnsavecv;
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv_user);
        btneditcv = (Button) findViewById(R.id.buttonCvEdit);
        btneditcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cv_user.this,"Bắt đầu chỉnh sửa", Toast.LENGTH_SHORT).show();
            }
        });
        btnsavecv = (Button) findViewById(R.id.buttonCvSave);
        btnsavecv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cv_user.this,"Đã Lưu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(cv_user.this, ProfileUser.class);
                startActivity(intent);
            }
        });


        //        Menu
        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        Toast.makeText(cv_user.this,"Trang Chủ", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(cv_user.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(cv_user.this,"Tìm Kiếm", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(cv_user.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(cv_user.this,"Trang Lưu", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(cv_user.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(cv_user.this,"Trang Cá Nhân", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(cv_user.this, ProfileUser.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }
}