package com.example.supletory2.service;


import com.example.supletory2.dtocreate.CreateUserInPostDTO;
import com.example.supletory2.dtocreate.CreatedUserInPostDTO;

public interface UserService {

    CreatedUserInPostDTO createUser(CreateUserInPostDTO createUserInPostDTO);

}

