package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Google_Sign_In extends AppCompatActivity {
    ImageView goBack;
    TextView account1, account2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_sign_in);

        goBack = (ImageView) findViewById(R.id.imgGoBack2);
        account1 = (TextView) findViewById(R.id.txtAccount1);
        account2 = (TextView) findViewById(R.id.txtAccount2);

        // Back to login_page
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(Google_Sign_In.this, Login_Page.class);
                startActivity(goBackIntent);
            }
        });

        // Kayaba Zeref account
        account1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent account1Intent = new Intent(Google_Sign_In.this, FreelancerMainActivity.class);
                startActivity(account1Intent);
            }
        });

        // Group 3 HCI account
        account2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent account2Intent = new Intent(Google_Sign_In.this, FreelancerMainActivity.class);
                startActivity(account2Intent);
            }
        });
    }
}