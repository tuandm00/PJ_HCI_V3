package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);

        LinearLayout hosocanhan = (LinearLayout) findViewById(R.id.btnHoSoCaNhan);
        LinearLayout taikhoannganhang = (LinearLayout) findViewById(R.id.btnTaiKhoanNganHang);
        hosocanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileUser.this, Freelancer_P7.class);
                startActivity(intent);
            }
        });

        taikhoannganhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfileUser.this, LienKetNganHang.class);
                startActivity(intent1);
            }
        });
    }

}
