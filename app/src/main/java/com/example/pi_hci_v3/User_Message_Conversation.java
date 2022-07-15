package com.example.pi_hci_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class User_Message_Conversation extends AppCompatActivity {
    ArrayList<User_Conversation>  userList;
    ImageView   imgGoBack, imgCompanyAvatar, imgMoneySend;
    private  PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    RelativeLayout  rlUI;


    // Context Menu de báo cáo người dùng nếu có dấu hiệu lừa đảo
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_message_conversation);

        RecyclerView rvUser = findViewById(R.id.rvConversation);
        imgGoBack = (ImageView) findViewById(R.id.imgConvBack);
        imgCompanyAvatar = (ImageView) findViewById(R.id.imgCompanyChatAvatar);
        rlUI = (RelativeLayout) findViewById(R.id.rlUI);
        imgMoneySend = (ImageView) findViewById(R.id.imgMoneySend);

        // Popup window nhap so tien thuong luong
        imgMoneySend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.dam_phan_tien, null);

                popupWindow = new PopupWindow(container,800,550,true);
                popupWindow.showAtLocation(rlUI, Gravity.CENTER, 0,0);


                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });

        // Khai báo Context Menu, gắn nó vô Avatar
        registerForContextMenu(imgCompanyAvatar);
        userList = new ArrayList<>();

        String openingChat = "Link để xem bài Freelance mà bạn ứng tuyển";

        userList.add(new User_Conversation(openingChat, "Xin chào, cám ơn vì cơ hội này", "14:50", "15:03", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Chào bạn, khi nào xong nhớ gửi file cho mình nhe", "Ok", "17:30", "17:50", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("File xong chưa á ", "file.txt", "8:30", "09:00", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Ok nhìn tạm được", "Dạ rồi, à về phần thanh toán thì mình thanh toán như trong tin hay là đàm phán ạ", "11:50", "13:03", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Thanh toán như trong tin anh gửi nha, vậy cho xin stk hoặc là chuyển trực tiếp qua app luôn", "Dạ mình chuyển qua stk ạ \nACB \n1234567890 - Cao Không", "15:00", "15:01", R.drawable.avatar1, R.drawable.avatar2));
        userList.add(new User_Conversation("Chuyển rồi nha, có gì kiểm tra tài khoản", "Dạ em nhận được rồi. \nEm cám ơn anh ạ. \nChào anh", "16:50", "08:03", R.drawable.avatar1, R.drawable.avatar2));

        User_Conversation_Adapter adapter = new User_Conversation_Adapter(userList);
        rvUser.setAdapter(adapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));

        imgGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User_Message_Conversation.this, Freelancer_P9_Chat.class);
                startActivity(intent);
            }
        });


    }
}