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

public class MyWallet extends AppCompatActivity {
    Button btnChuyenTien;
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mywallet);
        btnChuyenTien = (Button) findViewById(R.id.buttonChuyenTien);
        btnChuyenTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyWallet.this, "Chuyển tiền vào tài khoản thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MyWallet.this, MyWallet.class);
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
                        Toast.makeText(MyWallet.this,"Trang Chủ", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(MyWallet.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(MyWallet.this,"Tìm Kiếm", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(MyWallet.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(MyWallet.this,"Trang Lưu", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(MyWallet.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(MyWallet.this,"Trang Cá Nhân", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(MyWallet.this, ProfileUser.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }
}
