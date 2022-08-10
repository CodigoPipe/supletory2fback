package com.example.supletory2.service;

import com.example.supletory2.dto.CommentDTO;
import com.example.supletory2.entity.Comment;


import java.util.List;

public interface CommentService {
    CommentDTO createComment(CommentDTO commentDTO);

    //CommentUpdateDTO updateComment(CommentUpdateDTO commentUpdateDTO);

    void deleteComment(Integer commentId);

    List<Comment> findAllComments();
}
