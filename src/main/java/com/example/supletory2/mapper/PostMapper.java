package com.example.supletory2.mapper;

import com.example.supletory2.dto.CommentDTO;
import com.example.supletory2.dto.PostDTO;
import com.example.supletory2.dto.UserDTO;
import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.Post;
import com.example.supletory2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class PostMapper {

    public static Post returnPost(PostDTO postDTO){
        Post post = new Post();
        post.setPostId(postDTO.getPostId());
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        post.setNumberOfLikes(postDTO.getNumberOfLikes());

        List<User> users = new ArrayList<>();
        for(UserDTO user: postDTO.getUsers()){
            users.add(UserMapper.returnUser(user));
        }
        post.setUsers(users);

        List<Comment> comments = new ArrayList<>();
        for(CommentDTO comment: postDTO.getComments()){
            comments.add(CommentMapper.returnComment(comment));
        }
        post.setComments(comments);

        return post;
    }

    public static PostDTO returnPostDTO(Post post){

        PostDTO postDTO = new PostDTO();
        postDTO.setPostId(post.getPostId());
        postDTO.setTitle(post.getTitle());
        postDTO.setContent(post.getContent());
        postDTO.setNumberOfLikes(post.getNumberOfLikes());

        List<UserDTO> users = new ArrayList<>();
        for(User user: post.getUsers()){
            users.add(UserMapper.returnUserDTO(user));
        }
        postDTO.setUsers(users);

        List<CommentDTO> comments = new ArrayList<>();
        for(Comment comment: post.getComments()){
            comments.add(CommentMapper.returnCommentDTO(comment));
        }
        postDTO.setComments(comments);

        return postDTO;
    }
}
