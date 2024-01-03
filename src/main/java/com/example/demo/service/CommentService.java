package com.example.demo.service;

import com.example.demo.domain.Comment;
import com.example.demo.domain.Member;
import com.example.demo.domain.Post;
import com.example.demo.dto.CommentRequest;
import com.example.demo.dto.CommentUpdateRequest;
import com.example.demo.dto.CommentUpdateResponse;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final MemberRepository memberRepository;
    private final PostRepository postRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository, MemberRepository memberRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.memberRepository = memberRepository;
        this.postRepository = postRepository;
    }
    @Transactional
    public Long writeComment(CommentRequest commentRequest) {
        Member member = memberRepository.findById(commentRequest.getMemberId()).get();
        Post post = postRepository.findById(commentRequest.getPostId()).get();
        Comment comment = new Comment(commentRequest.getContent(), member, post);
        Comment savedComment = commentRepository.save(comment);
        return savedComment.getId();

    }
    @Transactional
    public CommentUpdateResponse updateComment(CommentUpdateRequest commentUpdateRequest) {
        Optional<Comment> optionalComment = commentRepository.findById(commentUpdateRequest.getid());
        Comment comment = optionalComment.get();

        comment.setContent(commentUpdateRequest.getContent());
        return new CommentUpdateResponse(
                comment.getContent()
        );
    }
    @Transactional
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
