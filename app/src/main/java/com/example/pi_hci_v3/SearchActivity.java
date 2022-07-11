package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spinner, spinner2, spinner3;
    private static final String[] paths = {"Chuyên Ngành","Viết bài PR & Quảng cáo", "Lập trình web", "Thiết kế LOGO"};
    private static final String[] paths2 = {"Chọn Lĩnh Vực", "IT", "Thiết kế", "Kinh tế"};
    private static final String[] paths3 = {"Địa Điểm", "Hà Nội", "TPHCM", "Thanh Hóa"};
    private Button btnXN; //nút xác nhận
    private ImageView imgBack, imgLogo; //bấm cái icon info
    private TextView txtLogo; //bấm vào chữ Freelancer
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //dropdown Chuyên ngành
        spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this, android.R.layout.simple_spinner_item, paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //dropdown Lĩnh vực
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(SearchActivity.this, android.R.layout.simple_spinner_item, paths2);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(this);

        //dropdown Địa điểm
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(SearchActivity.this, android.R.layout.simple_spinner_item, paths3);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter2);
        spinner3.setOnItemSelectedListener(this);

        //nút xác nhận
        btnXN = (Button) findViewById(R.id.buttonXacNhan);
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, FreelancerMainActivity.class);
                startActivity(intent);
            }
        });

        //bấm icon info user
        imgLogo = (ImageView) findViewById(R.id.imgInfo);
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SearchActivity.this, FreelancerMainActivity.class);
                startActivity(intent1);
            }
        });


        //bấm vào logo để quay về trang chủ
        txtLogo = (TextView) findViewById(R.id.textViewFJ);
        txtLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SearchActivity.this, FreelancerMainActivity.class);
                startActivity(intent2);
            }
        });

        imgBack = (ImageView) findViewById(R.id.imageViewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}