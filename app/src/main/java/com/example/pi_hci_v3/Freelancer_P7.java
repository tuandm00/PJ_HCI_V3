package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Freelancer_P7 extends AppCompatActivity {
    Button btnTrangchu;
    ImageView imgBack, imgList, imgSearch, imgSave, imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p7);

        btnTrangchu = (Button) findViewById(R.id.buttonTrangchu);
        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P7.this, FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        imgBack = (ImageView) findViewById(R.id.imageViewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P7.this,Freelancer_P6.class);
                startActivity(intent);
            }
        });
        imgList = (ImageView) findViewById(R.id.imageViewList);
        imgList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P7.this,FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        imgSearch = (ImageView) findViewById(R.id.imageViewSearch);
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P7.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        imgSave = (ImageView) findViewById(R.id.imageViewSave);
        imgSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P7.this,Freelancer_P8.class);
                startActivity(intent);
            }
        });
        imgProfile = (ImageView) findViewById(R.id.imageViewProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P7.this,Freelancer_P7.class);
                startActivity(intent);
            }
        });
    }
}