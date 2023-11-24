package com.example.demo.dto;

public class CommentDto {

    private Long id;
    private String content;

    public CommentDto(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
