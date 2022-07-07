package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Freelancer_P5 extends AppCompatActivity {
    Button btnLienhengay, btnTrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p5);

        btnLienhengay = (Button) findViewById(R.id.buttonLienhengay);
        btnTrangchu = (Button) findViewById(R.id.buttonTrangchu);

        btnLienhengay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P5.this, Freelancer_P6.class);
                startActivity(intent);
            }
        });

        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P5.this, Freelancer_P1.class);
                startActivity(intent);
            }
        });

    }
}