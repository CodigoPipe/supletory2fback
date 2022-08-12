package com.example.supletory2.service;


import com.example.supletory2.dtocreate.CreateCommentDTO;
import com.example.supletory2.dtocreate.CreatedCommentDTO;
import com.example.supletory2.entity.Comment;


import java.util.List;

public interface CommentService {
    CreatedCommentDTO createComment(CreateCommentDTO createCommentDTO);

    //CommentUpdateDTO updateComment(CommentUpdateDTO commentUpdateDTO);

    void deleteComment(Integer commentId);

    List<CreatedCommentDTO> findAllComments();
}
