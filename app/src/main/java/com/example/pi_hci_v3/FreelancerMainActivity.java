package com.example.pi_hci_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class FreelancerMainActivity extends AppCompatActivity implements OnItemClickListener{
    ArrayList<Freelancer> freelancerArrayList;
    Button btnQuaylai, btnTrangke;
    TextView txtTieude, txtGiatien, txtNoidung, txtNgtuyendung, txtDiadiem, txtKynang, txtNgaydang;
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_main);

        RecyclerView rvFreelancer = findViewById(R.id.rvFreelancer);
        freelancerArrayList = new ArrayList<>();
        freelancerArrayList.add(new Freelancer("Viết bài PR bản thân", "200.000đ-250.000đ/bài", "Tôi cần viết bài pr bản thân để đăng báo, mục tiêu ca ngợi một nữ doanh nhân...", "Nhi Lê", "Toàn quốc", "Viết bài PR & Quảng cáo sáng tạo", "20/05/2022"));
        freelancerArrayList.add(new Freelancer("Viết content tiếng Anh mảng Coin, Crypto", "250.000-320.000/bài", "Mình tìm bạn viết Tiếng Anh, viết bài SEO cho website tiếng Anh về mảng coin...", "Trung Nguyên", "Toàn quốc", "Viết bài CEO, nội dung cho website", "26/05/2022"));
        freelancerArrayList.add(new Freelancer("Mình cần tìm một bạn Freelancer Edit Video - Podcast", "2.000.000-3.000.000/Video-Podcast", "Công việc phù hợp với bạn nào yêu thích và muốn tìm hiểu sâu về dinh dưỡng...", "Hoàng Hải", "Toàn quốc", "Làm video clip", "15/05/2022"));
        freelancerArrayList.add(new Freelancer("Binding dữ liệu ra frontend", "500.000-2.000.000/page", "Mình cần lập 2 pages, 1 page là list all object lấy được từ 1 api pages là...", "Tuấn Đặng", "Toàn quốc", "Lập trình web", "13/05/2022"));
        freelancerArrayList.add(new Freelancer("Chỉnh sữa mẫu logo săn có", "300.000-500.000/logo", "Cần tìm người thiết kế lại logo theo mẫu sẵn có. Mẫu có sẵn: htpp://i.igmur.com/9...", "Ngô Hoàng", "Toàn quốc", "Thiết kế Logo", "13/05/2022"));

        FreelancerAdapter freelancerAdapter = new FreelancerAdapter(freelancerArrayList,this);
        rvFreelancer.setAdapter(freelancerAdapter);
        rvFreelancer.setLayoutManager(new LinearLayoutManager(this));

//        Menu
        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        Toast.makeText(FreelancerMainActivity.this,"Home Page", Toast.LENGTH_SHORT);
                        Intent intent1 = new Intent(FreelancerMainActivity.this, FreelancerMainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.search:
                        Toast.makeText(FreelancerMainActivity.this,"Search Page", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(FreelancerMainActivity.this, SearchActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.save:
                        Toast.makeText(FreelancerMainActivity.this,"Save Page", Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(FreelancerMainActivity.this, Freelancer_P8.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Toast.makeText(FreelancerMainActivity.this,"Profile Page", Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(FreelancerMainActivity.this, Freelancer_P7.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });

    }



    //Click vào nội dung để xem chi tiết
    @Override
    public void onItemClick(Freelancer freelancer) {
        Intent intent = new Intent(FreelancerMainActivity.this, Freelancer_P3.class);
        startActivity(intent);
    }
}