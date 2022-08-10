package com.example.supletory2.controller;

import com.example.supletory2.dto.CommentDTO;
import com.example.supletory2.dto.PostDTO;
import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.Post;
import com.example.supletory2.service.CommentService;
import com.example.supletory2.service.PostService;
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

    //POST METHODS
    @GetMapping("all/posts")
    public List<Post> getAllPosts(){
        return postService.findAllPost();
    }

    @DeleteMapping("delete/post/{postId}")
    public void deletePost(@PathVariable Integer postId){
        postService.deletePost(postId);
    }


    @PostMapping("create/post")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return postService.createPost(postDTO);
    }

    /*@PutMapping("update/post")
    public PostUpdateDTO updatePost(@RequestBody PostUpdateDTO postUpdateDTO){
        return postService.updatePost(postUpdateDTO);
    }*/




    //COMMENT METHODS

    @PostMapping("create/comment")
    public CommentDTO createComment(@RequestBody CommentDTO commentDTO){
        return commentService.createComment(commentDTO);
    }

    @GetMapping("all/comments")
    public List<Comment> getAllComments(){
        return commentService.findAllComments();
    }

    /*@PutMapping("update/comment")
    public CommentUpdateDTO updateComment(@RequestBody CommentUpdateDTO commentUpdateDTO){
        return commentService.updateComment(commentUpdateDTO);
    }*/

    @DeleteMapping("delete/comment/{commentId}")
    public void deleteCooment(@PathVariable Integer commentId){
        commentService.deleteComment(commentId);
    }
}
