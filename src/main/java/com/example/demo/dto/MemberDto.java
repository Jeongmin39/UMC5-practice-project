package com.example.demo.dto;

public class MemberDto {

    private Long id;
    private String name;
    private String nickName;
    private int age;
    private String gender;

    public MemberDto(Long id, String name, String nickName, int age, String gender) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getNickName() { return nickName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
}
