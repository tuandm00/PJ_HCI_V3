package com.example.pi_hci_v3;

public class User_Chat {
    private String  name;
    private String  content;
    private String  time;
    private int     avatar;

    public User_Chat(String name, String content, String time, int avatar) {
        this.name = name;
        this.content = content;
        this.time = time;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
