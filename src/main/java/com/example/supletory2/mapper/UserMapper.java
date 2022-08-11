package com.example.supletory2.mapper;


import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.Post;
import com.example.supletory2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {


    /*public static User returnUser(UserDTO userDto){
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setDni(userDto.getDni());

        List<Comment> comments = new ArrayList<>();
        for(CommentDTO comment: userDto.getComments()){
            comments.add(CommentMapper.returnComment(comment));
        }
        user.setComments(comments);

        List<Post> posts = new ArrayList<>();
        for(PostDTO post: userDto.getPosts()){
            posts.add(PostMapper.returnPost(post));
        }
        user.setPosts(posts);

        return user;
    }

    public static UserDTO returnUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserName(user.getUserName());
        userDTO.setDni(user.getDni());

        List<CommentDTO> comments = new ArrayList<>();
        for(Comment comment: user.getComments()){
            comments.add(CommentMapper.returnCommentDTO(comment));
        }
        userDTO.setComments(comments);

        List<PostDTO> posts = new ArrayList<>();
        for(Post post: user.getPosts()){
            posts.add(PostMapper.returnPostDTO(post));
        }
        userDTO.setPosts(posts);

        return userDTO;
    }*/

}
