package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {
    TextView username, password, errorMessage;
    RadioButton rememberMe;
    Button login;
    TextView forgotUsernameOrPassword;
    ImageView signInWithGoogle, lightMode, hiddenPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = (TextView) findViewById(R.id.txtUsername);
        password = (TextView) findViewById(R.id.txtPassword);
        errorMessage = (TextView) findViewById(R.id.txtWrongUsernameOrPassword);
        forgotUsernameOrPassword = (TextView) findViewById(R.id.txtForgotUsernamePassword);
        rememberMe = (RadioButton) findViewById(R.id.btnRememberMe);
        login = (Button) findViewById(R.id.btnLogin);
        signInWithGoogle = (ImageView) findViewById(R.id.imgSignInWithGoogle);
        lightMode = (ImageView) findViewById(R.id.imgLightMode);
        hiddenPassword = (ImageView) findViewById(R.id.imgHiddenPassword);

        //Login into the App
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtPassword = password.getText().toString();
                String txtUsername = username.getText().toString();

                // Username or Password is empty
                if (txtPassword.equals("") || txtUsername.equals("")) {
                    errorMessage.setText("Username or Password cannot be empty");
                } else {
                    // Using account Admin to Login
                    if (txtPassword.equals("hs") && txtUsername.equals("hs")) {
                        Intent loginChange = new Intent(Login_Page.this, FreelancerMainActivity.class);
                        startActivity(loginChange);
                    } else {
                        errorMessage.setText("Wrong Username or Password");
                    }
                }
            }
        });

        // Show/Hide password
        hiddenPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check Password is hidden or not
                if (password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                    // change icon from hidden to show password
                    hiddenPassword.setImageResource(R.drawable.show_password);
                    // Set password as show
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    hiddenPassword.setImageResource(R.drawable.black_eye);
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });

        // Forgot Username or Password
        forgotUsernameOrPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch to Forgot Password Page
                Intent forgotUsername = new Intent(Login_Page.this, Forgot_Password_Page.class);
                startActivity(forgotUsername);
            }
        });

        // Using Google to Sign in
        signInWithGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch to Google Sign In Page
                Intent googleIntent = new Intent(Login_Page.this, Google_Sign_In.class);
                startActivity(googleIntent);
            }
        });
    }
}