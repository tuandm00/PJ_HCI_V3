package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfileUser extends AppCompatActivity {
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);

        LinearLayout hosocanhan = (LinearLayout) findViewById(R.id.btnHoSoCaNhan);
        LinearLayout cvcanhan = (LinearLayout) findViewById(R.id.btnCvCaNhan);
        LinearLayout taikhoannganhang = (LinearLayout) findViewById(R.id.btnTaiKhoanNganHang);
        LinearLayout dangxuat = (LinearLayout) findViewById(R.id.btnDangXuat);

        hosocanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileUser.this, Freelancer_P7.class);
                startActivity(intent);
            }
        });
        cvcanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileUser.this, cv_user.class);
                startActivity(intent);
            }
        });

        taikhoannganhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileUser.this, LienKetNganHang.class);
                startActivity(intent);
            }
        });

        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileUser.this, Login_Page.class);
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
                        Toast.makeText(ProfileUser.this,"Trang Chủ", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(ProfileUser.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(ProfileUser.this,"Tìm Kiếm", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(ProfileUser.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(ProfileUser.this,"Trang Lưu", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(ProfileUser.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(ProfileUser.this,"Trang Cá Nhân", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(ProfileUser.this, ProfileUser.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }

}
