package com.example.supletory2.service;


import com.example.supletory2.entity.Comment;
import com.example.supletory2.mapper.CommentFrontMapper;
import com.example.supletory2.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepo commentRepo;

    /*@Override
    public CommentFrontDTO createComment(CommentFrontDTO commentFrontDTO) {
        Comment comment = new Comment();
        comment.setCommentContent(commentDTO.getCommentContent());
        comment.setPostIdpost(CommentFrontMapper.returnPostFromPICDTO(commentDTO.getPostIdpost()));

        commentRepo.save(comment);

        CommentDTO commentDTO1 = new CommentDTO();

        commentDTO1.setCommentId(comment.getCommentId());
        commentDTO1.setCommentContent(comment.getCommentContent());

        return commentDTO1;
    }

    @Override
    public void deleteComment(Integer commentId) {

    }

    @Override
    public List<Comment> findAllComments() {
        return null;
    }*/
}
