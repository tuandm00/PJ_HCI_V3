package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Freelancer_P6 extends AppCompatActivity {
    Button btnTrangchu;
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p6);


        btnTrangchu = (Button) findViewById(R.id.buttonTrangchu);


        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P6.this, FreelancerMainActivity.class);
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
                        Toast.makeText(Freelancer_P6.this,"Home Page", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(Freelancer_P6.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(Freelancer_P6.this,"Search Page", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(Freelancer_P6.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(Freelancer_P6.this,"Save Page", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(Freelancer_P6.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(Freelancer_P6.this,"Profile Page", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(Freelancer_P6.this, Freelancer_P7.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }
}