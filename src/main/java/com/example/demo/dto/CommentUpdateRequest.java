package com.example.demo.dto;

public class CommentUpdateRequest {

    private Long id;

    private String content;

    public CommentUpdateRequest(Long id, String content){
        this.id = id;
        this.content = content;
    }
    public Long getid() {
        return id;
    }
    public String getContent() {
        return content;
    }

}
