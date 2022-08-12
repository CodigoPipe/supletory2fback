package com.example.supletory2.controller;


import com.example.supletory2.dtocreate.*;
import com.example.supletory2.entity.Comment;
import com.example.supletory2.service.CommentService;
import com.example.supletory2.service.PostService;
import com.example.supletory2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/")
public class Controller {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private UserService userService;

    //POST METHODS
    @GetMapping("all/posts")
    public List<CreatedPostDTO> getAllPosts(){
        return postService.findAllPost();
    }

    @DeleteMapping("delete/post/{postId}")
    public void deletePost(@PathVariable Integer postId){
        postService.deletePost(postId);
    }


    @PostMapping("create/post")
    public CreatedPostDTO createPost(@RequestBody CreatePostDTO createPostDTO){
        return postService.createPost(createPostDTO);
    }

    @PutMapping("update/post")
    public void updatePost(@RequestBody UpdatePostDTO updatePostDTO){
        postService.updatePost(updatePostDTO);
    }




    //COMMENT METHODS

    @PostMapping("create/comment")
    public CreatedCommentDTO createComment(@RequestBody CreateCommentDTO createCommentDTO){
        return commentService.createComment(createCommentDTO);
    }

    @GetMapping("all/comments")
    public List<CreatedCommentDTO> getAllComments(){
        return commentService.findAllComments();
    }

    @PutMapping("update/comment")
    public void updateComment(@RequestBody UpdateCommentDTO updateCommentDTO){
        commentService.updateComment(updateCommentDTO);
    }

    @DeleteMapping("delete/comment/{commentId}")
    public void deleteComment(@PathVariable Integer commentId){
        commentService.deleteComment(commentId);
    }



    //USER METHODS

    @PostMapping("create/user/post")
    public CreatedUserInPostDTO createdUserInPostDTO(@RequestBody CreateUserInPostDTO createUserInPostDTO){
        return userService.createUserInPost(createUserInPostDTO);
    }

    @PostMapping("create/user/comment")
    public CreatedUserInCommentDTO createdUserInPostDTO(@RequestBody CreateUserInCommentDTO createUserInCommentDTO){
        return userService.createUserInComment(createUserInCommentDTO);
    }




}
