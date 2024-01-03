package com.example.demo.dto;

public class CommentRequest {
    private String content;
    private Long memberId;
    private Long postId;

    public CommentRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Long getMemberId() {
        return memberId;
    }

    public Long getPostId() {
        return postId;
    }
}
