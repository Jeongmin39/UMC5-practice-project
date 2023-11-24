package com.example.demo.dto;

public class CommentUpdateResponse {

    private String content;

    public CommentUpdateResponse(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
