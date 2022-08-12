package com.example.supletory2.service;


import com.example.supletory2.dtocreate.*;
import com.example.supletory2.entity.Post;
import com.example.supletory2.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;
    @Override
    public CreatedPostDTO createPost(CreatePostDTO createPostDTO) {

        Post post = new Post();
        post.setTitle(createPostDTO.getTitle());
        post.setContent(createPostDTO.getContent());

        postRepo.save(post);

        CreatedPostDTO createdPostDTO = new CreatedPostDTO();
        createdPostDTO.setPostId(post.getPostId());
        createdPostDTO.setTitle(post.getTitle());
        createdPostDTO.setContent(post.getContent());
        createdPostDTO.setNumberOfLikes(post.getNumberOfLikes());

        return createdPostDTO;

    }

    @Override
    public void updatePost(UpdatePostDTO updatePostDTO) {
        Post post = postRepo.findById(updatePostDTO.getPostId()).get();
        post.setTitle(updatePostDTO.getTitle());
        post.setContent(updatePostDTO.getContent());

        postRepo.save(post);
    }

    @Override
    public void deletePost(Integer postId) {

        Post post = postRepo.findById(postId).get();
        postRepo.delete(post);

    }

    //RETURN DTOOO
    @Override
    public List<CreatedPostDTO> findAllPost() {

        List<CreatedPostDTO> createdPostDTOS = new ArrayList<>();

        postRepo.findAll().forEach(post -> {
            CreatedPostDTO createdPostDTO = new CreatedPostDTO();
            createdPostDTO.setPostId(post.getPostId());
            createdPostDTO.setTitle(post.getTitle());
            createdPostDTO.setContent(post.getContent());
            createdPostDTO.setNumberOfLikes(post.getNumberOfLikes());

            List<PostCommentListDTO> comments = new ArrayList<>();

            post.getComments().forEach(comment -> {

                PostCommentListDTO postCommentListDTO = new PostCommentListDTO();
                postCommentListDTO.setCommentContent(comment.getCommentContent());
                postCommentListDTO.setNumberOfLikesComment(comment.getNumberOfLikesComment());
                postCommentListDTO.setCommentId(comment.getCommentId());

                List<CommentUserListDTO> commentUsers = new ArrayList<>();

                comment.getUsers().forEach(user -> {
                    CommentUserListDTO commentUserListDTO = new CommentUserListDTO();
                    commentUserListDTO.setUserName(user.getUserName());
                    commentUserListDTO.setDni(user.getDni());

                    commentUsers.add(commentUserListDTO);

                });

                postCommentListDTO.setUsers(commentUsers);

                comments.add(postCommentListDTO);

            });

            createdPostDTO.setComments(comments);

            List<PostUserListDTO> postUsers = new ArrayList<>();

            post.getUsers().forEach(user -> {
                PostUserListDTO postUserListDTO = new PostUserListDTO();
                postUserListDTO.setUserName(user.getUserName());
                postUserListDTO.setDni(user.getDni());

                postUsers.add(postUserListDTO);
            });

            createdPostDTO.setUsers(postUsers);


            createdPostDTOS.add(createdPostDTO);
        });



        return createdPostDTOS;


    }
}
