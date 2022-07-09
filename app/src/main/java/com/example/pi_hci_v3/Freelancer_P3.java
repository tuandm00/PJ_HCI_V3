package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Freelancer_P3 extends AppCompatActivity {
    Button btnLienhetructiep, btnTrangchu;
    BottomNavigationView nav;
    ImageView imgSave, imgPhanAnh;
    TextView txtSave, txtPhanAnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p3);

        btnLienhetructiep = (Button) findViewById(R.id.buttonLienhetructiep);
        btnTrangchu = (Button) findViewById(R.id.buttonTrangchu);

        btnLienhetructiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this, Freelancer_P5.class);
                startActivity(intent);
            }
        });
        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this, FreelancerMainActivity.class);
                startActivity(intent);
            }
        });

//        Phản Ánh

        imgPhanAnh = (ImageView) findViewById(R.id.imageViewPhanAnh);
        txtPhanAnh = (TextView) findViewById(R.id.textViewPhanAnh);
        imgPhanAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Freelancer_P3.this, "Success Cofirm", Toast.LENGTH_SHORT).show();
            }
        });
        txtPhanAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Freelancer_P3.this, "Success Cofirm", Toast.LENGTH_SHORT).show();

            }
        });


//        Save
        imgSave = (ImageView) findViewById(R.id.imageViewSave);
        txtSave = (TextView) findViewById(R.id.textViewSave);
        imgSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Freelancer_P3.this, "Save Success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Freelancer_P3.this, Freelancer_P8.class);
                startActivity(intent);
            }
        });
        txtSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Freelancer_P3.this, "Save Success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Freelancer_P3.this, Freelancer_P8.class);
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
                        Toast.makeText(Freelancer_P3.this,"", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(Freelancer_P3.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(Freelancer_P3.this,"Search Page", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(Freelancer_P3.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(Freelancer_P3.this,"Save Page", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(Freelancer_P3.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(Freelancer_P3.this,"Profile Page", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(Freelancer_P3.this, Freelancer_P7.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });

    }
}