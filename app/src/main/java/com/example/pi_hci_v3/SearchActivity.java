package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spinner, spinner2, spinner3;
    private static final String[] paths = {"Chuyên Ngành","Viết bài PR & Quảng cáo", "Lập trình web", "Thiết kế LOGO"};
    private static final String[] paths2 = {"Chọn Lĩnh Vực", "IT", "Thiết kế", "Kinh tế"};
    private static final String[] paths3 = {"Địa Điểm", "Hà Nội", "TPHCM", "Thanh Hóa"};
    private Button btnXN; //nút xác nhận
    BottomNavigationView nav;
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

        //        Menu
        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        Toast.makeText(SearchActivity.this,"", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(SearchActivity.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(SearchActivity.this,"Search Page", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(SearchActivity.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(SearchActivity.this,"Save Page", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(SearchActivity.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(SearchActivity.this,"Profile Page", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(SearchActivity.this, Freelancer_P7.class);
                        startActivity(intent4);
                        break;
                }
                return true;
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