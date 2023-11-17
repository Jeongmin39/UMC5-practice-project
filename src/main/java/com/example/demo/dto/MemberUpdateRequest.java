package com.example.demo.dto;

public class MemberUpdateRequest {

    private Long id;
    private String name;
    private String nickName;
    private int age;
    private String gender;

    public Long getId() {
        return id;
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
