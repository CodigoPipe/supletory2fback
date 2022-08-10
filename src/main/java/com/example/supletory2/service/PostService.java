package com.example.supletory2.service;



import com.example.supletory2.dto.PostDTO;
import com.example.supletory2.entity.Post;

import java.util.List;


public interface PostService {

    PostDTO createPost(PostDTO postDTO);

    //PostUpdateDTO updatePost(PostUpdateDTO postUpdateDTO);

    void deletePost(Integer postId);

    //esto es solo para probar en postman, borrar despues
    List<Post> findAllPost();


}
