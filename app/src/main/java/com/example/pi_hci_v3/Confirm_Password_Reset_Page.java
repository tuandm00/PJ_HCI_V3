package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Confirm_Password_Reset_Page extends AppCompatActivity {
    TextView txtGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_password_reset_page);

        txtGoBack = (TextView) findViewById(R.id.txtGoBackToLoginScreen);

        // Back to login_page
        txtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(Confirm_Password_Reset_Page.this, Login_Page.class);
                startActivity(backIntent);
            }
        });
    }
}