package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Forgot_Password_Page extends AppCompatActivity {
    ImageView imgGoBack;
    TextView emailAddress, txtWrongEmail;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_page);

        imgGoBack = (ImageView) findViewById(R.id.imgGoBack);
        emailAddress = (TextView) findViewById(R.id.txtEmailAddress);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        txtWrongEmail = (TextView) findViewById(R.id.txtWrongEmailAddress);

        //Go back to login_page
        imgGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(Forgot_Password_Page.this, Login_Page.class);
                startActivity(goBack);
            }
        });

        //Submit email
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtEmail = emailAddress.getText().toString();
                // email is empty
                if (txtEmail.equals("")) {
                    txtWrongEmail.setText("Please input your email address");
                } else {
                    // email must contain @ and after @ is "fpt.edu.vn"
                    if (txtEmail.contains("@")) {
                        String[] split = txtEmail.split("@");
                        String emailFormat = split[1];
                        if (emailFormat.equals("fpt.edu.vn")) {
                            Intent intentSubmit = new Intent(Forgot_Password_Page.this, Confirm_Password_Reset_Page.class);
                            startActivity(intentSubmit);
                        } else {
                            txtWrongEmail.setText("Please use email with correct format: @fpt.edu.vn");
                        }
                    } else {
                        txtWrongEmail.setText("Missing symbol: @ ");
                    }
                }
            }
        });
    }
}