package com.example.supletory2.mapper;

import com.example.supletory2.dto.CommentDTO;
import com.example.supletory2.dto.UserDTO;
import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class CommentMapper {

    public static Comment returnComment(CommentDTO commentDTO){

        Comment comment = new Comment();
        comment.setCommentId(commentDTO.getCommentId());
        comment.setCommentContent(commentDTO.getCommentContent());
        comment.setNumberOfLikesComment(commentDTO.getNumberOfLikesComment());
        comment.setPostIdpost(PostICDTOMapper.returnPostFromPICDTO(commentDTO.getPostIdpost()));

        List<User> users = new ArrayList<>();
        for(UserDTO userDTO: commentDTO.getUsers()){
            users.add(UserMapper.returnUser(userDTO));
        }
        comment.setUsers(users);

        return comment;

    }

    public static CommentDTO returnCommentDTO(Comment comment){

        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setCommentId(comment.getCommentId());
        commentDTO.setCommentContent(comment.getCommentContent());
        commentDTO.setNumberOfLikesComment(comment.getNumberOfLikesComment());
        commentDTO.setPostIdpost(PostICDTOMapper.returnPICDTOfromPost(comment.getPostIdpost()));

        List<UserDTO> users = new ArrayList<>();
        for(User user: comment.getUsers()){
            users.add(UserMapper.returnUserDTO(user));
        }

        commentDTO.setUsers(users);

        return commentDTO;
    }

}
