package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LienKetNganHang extends AppCompatActivity {
    Button btnnganhang1, btnLienKet;
    TextView txtnganhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banksetup);

        btnLienKet = (Button) findViewById(R.id.buttonLienKet);
        btnnganhang1 = (Button) findViewById(R.id.btnchonNganHang);
        txtnganhang = (TextView) findViewById(R.id.textView58);
        btnnganhang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNganHang();
            }
        });

        btnLienKet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LienKetNganHang.this, "Liên kết thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LienKetNganHang.this, ProfileUser.class);
                startActivity(intent);
            }
        });

    }
    private void showNganHang(){

        PopupMenu popupMenu = new PopupMenu(this, btnnganhang1);
        popupMenu.getMenuInflater().inflate(R.menu.list_bank, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem bankitem) {
                switch (bankitem.getItemId()){
                    case R.id.MBBank: txtnganhang.setText("MB Bank");
                        break;
                    case R.id.ViettienBank: txtnganhang.setText("VietTien Bank");
                        break;
                    case R.id.TMCPsaigon: txtnganhang.setText("TMCP Sài Gòn");
                        break;
                    case R.id.TMCPbaoviet: txtnganhang.setText("BaoViet Bank");
                        break;
                    case R.id.techcombank: txtnganhang.setText("Techcombank");
                        break;
                    case R.id.VPBank: txtnganhang.setText("VB Bank");
                        break;
                    case R.id.AChauBank: txtnganhang.setText("TMCP Á Châu");
                        break;
                    case R.id.TPBank: txtnganhang.setText("Tiên Phong Bank");
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
