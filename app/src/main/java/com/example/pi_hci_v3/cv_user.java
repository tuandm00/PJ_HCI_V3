package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class cv_user extends AppCompatActivity {
    Button btneditcv, btnsavecv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv_user);
        btneditcv = (Button) findViewById(R.id.buttonCvEdit);
        btneditcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cv_user.this,"Bắt đầu chỉnh sửa", Toast.LENGTH_SHORT).show();
            }
        });
        btnsavecv = (Button) findViewById(R.id.buttonCvSave);
        btnsavecv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cv_user.this,"Đã Lưu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(cv_user.this, ProfileUser.class);
                startActivity(intent);
            }
        });
    }
}
