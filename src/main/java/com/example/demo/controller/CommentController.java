package com.example.demo.controller;

import com.example.demo.dto.CommentDto;
import com.example.demo.dto.CommentRequest;
import com.example.demo.dto.CommentUpdateRequest;
import com.example.demo.dto.CommentUpdateResponse;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    //댓글 작성
    @PostMapping("/comments")
    public Long comment(@RequestBody CommentRequest commentRequest) {
        return commentService.writeComment(commentRequest);
    }

    //댓글 수정
    @PatchMapping("/comments/update")
    public CommentUpdateResponse update(@RequestBody CommentUpdateRequest commentUpdateRequest) {
        return commentService.updateComment(commentUpdateRequest);
    }

    //댓글 삭제
    @PostMapping("/comments/delete")
    public void delete(@RequestParam Long id) {
        commentService.deleteComment(id);
    }
}
