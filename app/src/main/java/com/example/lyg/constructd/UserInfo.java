package com.example.lyg.constructd;

/**
 * Created by LYG on 2017-10-31.
 */


public class UserInfo {
    String email;
    String enc_id;
    String age;
    String gender;
    String id;

    public UserInfo() {
        String email = "";
        String enc_id = "";
        String age = "";
        String gender = "";
        String id = "";
        String birthday = "";
    }

    public UserInfo(String email, String nickname, String enc_id, String profile_image, String age, String gender, String id, String name, String birthday) {
        this.email = email;
        this.enc_id = enc_id;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnc_id(String enc_id) {
        this.enc_id = enc_id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(String id) {
        this.id = id;
    }
}