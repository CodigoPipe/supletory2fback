package com.example.supletory2.service;

import com.example.supletory2.dtocreate.CreateUserInCommentDTO;
import com.example.supletory2.dtocreate.CreateUserInPostDTO;
import com.example.supletory2.dtocreate.CreatedUserInCommentDTO;
import com.example.supletory2.dtocreate.CreatedUserInPostDTO;
import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.Post;
import com.example.supletory2.entity.User;
import com.example.supletory2.repository.CommentRepo;
import com.example.supletory2.repository.PostRepo;
import com.example.supletory2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepo postRepo;

    @Autowired
    CommentRepo commentRepo;

    @Override
    public CreatedUserInPostDTO createUserInPost(CreateUserInPostDTO createUserInPostDTO) {

        Post post = postRepo.findById(createUserInPostDTO.getPostIdpost()).get();
        List<Post> posts = new ArrayList<>();
        posts.add(post);

        User user = new User();

        user.setUserName(createUserInPostDTO.getUserName());
        user.setDni(createUserInPostDTO.getDni());
        user.setPosts(posts);

        userRepo.save(user);

        CreatedUserInPostDTO createdUserInPostDTO = new CreatedUserInPostDTO();
        createdUserInPostDTO.setUserId(user.getUserId());
        createdUserInPostDTO.setUserName(user.getUserName());
        createdUserInPostDTO.setDni(user.getDni());

        return createdUserInPostDTO;


    }

    @Override
    public CreatedUserInCommentDTO createUserInComment(CreateUserInCommentDTO createUserInCommentDTO) {

        Comment comment = commentRepo.findById(createUserInCommentDTO.getCommentId()).get();
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);

        User user = new User();

        user.setUserName(createUserInCommentDTO.getUserName());
        user.setDni(createUserInCommentDTO.getDni());
        user.setComments(comments);

        userRepo.save(user);

        CreatedUserInCommentDTO createdUserInCommentDTO = new CreatedUserInCommentDTO();
        createdUserInCommentDTO.setUserId(user.getUserId());
        createdUserInCommentDTO.setUserName(user.getUserName());
        createdUserInCommentDTO.setDni(user.getDni());

        return createdUserInCommentDTO;

    }
}
