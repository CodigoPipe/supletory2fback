package com.example.supletory2.service;


import com.example.supletory2.dtocreate.CreateCommentDTO;
import com.example.supletory2.dtocreate.CreatedCommentDTO;
import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.Post;
import com.example.supletory2.repository.CommentRepo;
import com.example.supletory2.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    PostRepo postRepo;


    @Override
    public CreatedCommentDTO createComment(CreateCommentDTO createCommentDTO) {

        Comment comment = new Comment();
        Post post = postRepo.findById(createCommentDTO.getPostIdpost()).get();


        comment.setCommentContent(createCommentDTO.getCommentContent());
        comment.setPostIdpost(post);


        Comment comment1 = commentRepo.save(comment);

        CreatedCommentDTO createdCommentDTO = new CreatedCommentDTO();
        createdCommentDTO.setCommentId(comment1.getCommentId());
        createdCommentDTO.setCommentContent(comment1.getCommentContent());
        createdCommentDTO.setNumberOfLikesComment(comment1.getNumberOfLikesComment());
        createdCommentDTO.setPostIdpost(comment1.getPostIdpost().getPostId());

        return createdCommentDTO;

    }

    /*@Override
    public void deleteComment(Integer commentId) {

    }*/

    @Override
    public List<CreatedCommentDTO> findAllComments() {

        List<CreatedCommentDTO> createdCommentDTOS = new ArrayList<>();

        for(Comment comment: commentRepo.findAll()){
            CreatedCommentDTO createdCommentDTO = new CreatedCommentDTO();

            createdCommentDTO.setCommentId(comment.getCommentId());
            createdCommentDTO.setCommentContent(comment.getCommentContent());
            createdCommentDTO.setNumberOfLikesComment(comment.getNumberOfLikesComment());
            createdCommentDTO.setPostIdpost(comment.getPostIdpost().getPostId());

            createdCommentDTOS.add(createdCommentDTO);
        }

        return createdCommentDTOS;
    }
}
