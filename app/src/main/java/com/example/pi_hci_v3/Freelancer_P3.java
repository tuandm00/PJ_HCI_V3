package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Freelancer_P3 extends AppCompatActivity {
    Button btnTrangke;
    ImageView imgBack, imgList, imgSearch, imgSave, imgProfile;;
    TextView txtSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p3);

        //Nút trang kế
        btnTrangke = (Button) findViewById(R.id.buttonTrangke);
        btnTrangke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this, Freelancer_P4.class);
                startActivity(intent);
            }
        });
        txtSave = (TextView) findViewById(R.id.textViewSave);
        txtSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Freelancer_P3.this, "Saved work Successfully!", Toast.LENGTH_SHORT).show();
            }
        });
        imgBack = (ImageView) findViewById(R.id.imageViewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this,FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        imgList = (ImageView) findViewById(R.id.imageViewList);
        imgList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this,FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        imgSearch = (ImageView) findViewById(R.id.imageViewSearch);
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        imgSave = (ImageView) findViewById(R.id.imageViewSave);
        imgSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this,Freelancer_P8.class);
                startActivity(intent);
            }
        });
        imgProfile = (ImageView) findViewById(R.id.imageViewProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this,Freelancer_P7.class);
                startActivity(intent);
            }
        });
    }
}