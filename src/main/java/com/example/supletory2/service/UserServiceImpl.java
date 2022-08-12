package com.example.supletory2.service;

import com.example.supletory2.dtocreate.CreateUserInPostDTO;
import com.example.supletory2.dtocreate.CreatedUserInPostDTO;
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
    public CreatedUserInPostDTO createUser(CreateUserInPostDTO createUserInPostDTO) {

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
}
