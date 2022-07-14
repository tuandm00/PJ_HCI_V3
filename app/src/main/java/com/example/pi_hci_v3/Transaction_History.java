package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Transaction_History extends AppCompatActivity {
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);





        //        Menu
        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        Toast.makeText(Transaction_History.this,"Trang Chủ", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(Transaction_History.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(Transaction_History.this,"Tìm Kiếm", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(Transaction_History.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(Transaction_History.this,"Trang Lưu", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(Transaction_History.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(Transaction_History.this,"Trang Cá Nhân", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(Transaction_History.this, ProfileUser.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }
}
