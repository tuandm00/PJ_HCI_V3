package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Home_Page extends AppCompatActivity {
    ImageView imgLogout, imgLostAndFound, imgFreelanceJob;
    Button lostAndFound, freelanceJob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        imgLogout = (ImageView) findViewById(R.id.imgLogout);
        imgLostAndFound = (ImageView) findViewById(R.id.imgLostAndFound);
        imgFreelanceJob = (ImageView) findViewById(R.id.imgFreelanceJob);
        lostAndFound = (Button) findViewById(R.id.btnLostFound);
        freelanceJob = (Button) findViewById(R.id.btnFreelanceJob);

//        // Switch to Lost & Found page
//        imgLostAndFound.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLostAndFound = new Intent(Home_Page.this, Menu.class);
//                startActivity(intentLostAndFound);
//            }
//        });
//
//        // Switch to Lost & Found page
//        lostAndFound.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        // Switch to Free Lance Job page
        imgFreelanceJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFreeLanceJob = new Intent(Home_Page.this, Freelancer_P1.class);
                startActivity(intentFreeLanceJob);
            }
        });

        // Switch to Free Lance Job page
        freelanceJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFreeLanceJob = new Intent(Home_Page.this, Freelancer_P1.class);
                startActivity(intentFreeLanceJob);
            }
        });

        // Logout and back to login_page
        imgLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(Home_Page.this, Login_Page.class);
                startActivity(goBack);
            }
        });
    }
}