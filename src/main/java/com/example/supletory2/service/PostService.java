package com.example.supletory2.service;




import com.example.supletory2.dtocreate.CreatePostDTO;
import com.example.supletory2.dtocreate.CreatedPostDTO;
import com.example.supletory2.dtocreate.UpdatePostDTO;
import com.example.supletory2.entity.Post;

import java.util.List;


public interface PostService {

    CreatedPostDTO createPost(CreatePostDTO createPostDTO);

    void updatePost(UpdatePostDTO updatePostDTO);

    void deletePost(Integer postId);

    //esto es solo para probar en postman, borrar despues
    List<CreatedPostDTO> findAllPost();


}
