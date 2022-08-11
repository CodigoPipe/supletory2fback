package com.example.supletory2.service;

import com.example.supletory2.dto.CommentDTO;
import com.example.supletory2.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Override
    public CommentDTO createComment(CommentDTO commentDTO) {
        return null;
    }

    @Override
    public void deleteComment(Integer commentId) {

    }

    @Override
    public List<Comment> findAllComments() {
        return null;
    }
}
