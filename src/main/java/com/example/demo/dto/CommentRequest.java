package com.example.demo.dto;

public class CommentRequest {
    private String content;
    private Long memberId;

    public CommentRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Long getMemberId() {
        return memberId;
    }
}
