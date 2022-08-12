package com.example.supletory2.service;


import com.example.supletory2.dtocreate.CreateUserInCommentDTO;
import com.example.supletory2.dtocreate.CreateUserInPostDTO;
import com.example.supletory2.dtocreate.CreatedUserInCommentDTO;
import com.example.supletory2.dtocreate.CreatedUserInPostDTO;

public interface UserService {

    CreatedUserInPostDTO createUserInPost(CreateUserInPostDTO createUserInPostDTO);

    CreatedUserInCommentDTO createUserInComment(CreateUserInCommentDTO createUserInCommentDTO);

}

