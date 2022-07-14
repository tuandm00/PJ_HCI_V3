package com.example.pi_hci_v3;

public class User_Conversation {
    private String  content_first, content_second;
    private String  time_first, time_second;
    private int     avatar_first, avatar_second;

    public User_Conversation(String content_first, String content_second, String time_first, String time_second, int avatar_first, int avatar_second) {
        this.content_first = content_first;
        this.content_second = content_second;
        this.time_first = time_first;
        this.time_second = time_second;
        this.avatar_first = avatar_first;
        this.avatar_second = avatar_second;
    }

    public String getContent_first() {
        return content_first;
    }

    public void setContent_first(String content_first) {
        this.content_first = content_first;
    }

    public String getContent_second() {
        return content_second;
    }

    public void setContent_second(String content_second) {
        this.content_second = content_second;
    }

    public String getTime_first() {
        return time_first;
    }

    public void setTime_first(String time_first) {
        this.time_first = time_first;
    }

    public String getTime_second() {
        return time_second;
    }

    public void setTime_second(String time_second) {
        this.time_second = time_second;
    }

    public int getAvatar_first() {
        return avatar_first;
    }

    public void setAvatar_first(int avatar_first) {
        this.avatar_first = avatar_first;
    }

    public int getAvatar_second() {
        return avatar_second;
    }

    public void setAvatar_second(int avatar_second) {
        this.avatar_second = avatar_second;
    }
}
