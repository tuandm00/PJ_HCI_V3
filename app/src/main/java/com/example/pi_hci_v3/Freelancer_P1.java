package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Freelancer_P1 extends AppCompatActivity {
    Button btnDanhsachcongviec, btnTimkiemtheoyeucau, btnDaluu;
    ImageView imgBack, imgProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p1);
        btnDanhsachcongviec = (Button) findViewById(R.id.buttonDanhsachcongviec);
        btnDanhsachcongviec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this, FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        btnTimkiemtheoyeucau = (Button) findViewById(R.id.buttonTimkiemtheoyeucau);
        btnTimkiemtheoyeucau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        btnDaluu = (Button) findViewById(R.id.buttonDaluu);
        btnDaluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this,Freelancer_P8.class);
                startActivity(intent);
            }
        });
        imgBack = (ImageView) findViewById(R.id.imageView3);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this, Login_Page.class);
                startActivity(intent);
            }
        });

        imgProfile = (ImageView) findViewById(R.id.imageView4);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this, Freelancer_P7.class);
                startActivity(intent);
            }
        });
    }
}