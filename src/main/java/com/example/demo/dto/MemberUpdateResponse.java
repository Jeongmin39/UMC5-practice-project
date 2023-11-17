package com.example.demo.dto;

public class MemberUpdateResponse {

    private String name;
    private String nickName;
    private int age;
    private String gender;

    public MemberUpdateResponse(String name, String nickName, int age, String gender) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
