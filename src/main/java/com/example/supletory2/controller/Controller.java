package com.example.supletory2.controller;


import com.example.supletory2.dtocreate.CreateCommentDTO;
import com.example.supletory2.dtocreate.CreatePostDTO;
import com.example.supletory2.dtocreate.CreatedCommentDTO;
import com.example.supletory2.dtocreate.CreatedPostDTO;
import com.example.supletory2.entity.Comment;
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

    /*@PutMapping("update/post")
    public PostUpdateDTO updatePost(@RequestBody PostUpdateDTO postUpdateDTO){
        return postService.updatePost(postUpdateDTO);
    }*/




    //COMMENT METHODS

    @PostMapping("create/comment")
    public CreatedCommentDTO createComment(@RequestBody CreateCommentDTO createCommentDTO){
        return commentService.createComment(createCommentDTO);
    }

    @GetMapping("all/comments")
    public List<CreatedCommentDTO> getAllComments(){
        return commentService.findAllComments();
    }

    /*@PutMapping("update/comment")
    public CommentUpdateDTO updateComment(@RequestBody CommentUpdateDTO commentUpdateDTO){
        return commentService.updateComment(commentUpdateDTO);
    }*/

    /*@DeleteMapping("delete/comment/{commentId}")
    public void deleteCooment(@PathVariable Integer commentId){
        commentService.deleteComment(commentId);
    }*/
}
