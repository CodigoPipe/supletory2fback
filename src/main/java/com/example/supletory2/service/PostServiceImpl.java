package com.example.supletory2.service;


import com.example.supletory2.dtocreate.CreatePostDTO;
import com.example.supletory2.dtocreate.CreatedPostDTO;
import com.example.supletory2.entity.Post;
import com.example.supletory2.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;
    @Override
    public CreatedPostDTO createPost(CreatePostDTO createPostDTO) {

        Post post = new Post();
        post.setTitle(createPostDTO.getTitle());
        post.setContent(createPostDTO.getContent());

        postRepo.save(post);

        CreatedPostDTO createdPostDTO = new CreatedPostDTO();
        createdPostDTO.setPostId(post.getPostId());
        createdPostDTO.setTitle(post.getTitle());
        createdPostDTO.setContent(post.getContent());
        createdPostDTO.setNumberOfLikes(post.getNumberOfLikes());

        return createdPostDTO;

    }

    @Override
    public void deletePost(Integer postId) {

    }

    //RETURN DTOOO
    @Override
    public List<CreatedPostDTO> findAllPost() {

        List<CreatedPostDTO> createdPostDTOS = new ArrayList<>();

        for(Post post: postRepo.findAll()){

            CreatedPostDTO createdPostDTO = new CreatedPostDTO();
            createdPostDTO.setPostId(post.getPostId());
            createdPostDTO.setTitle(post.getTitle());
            createdPostDTO.setContent(post.getContent());
            createdPostDTO.setNumberOfLikes(post.getNumberOfLikes());

            createdPostDTOS.add(createdPostDTO);

        }

        return createdPostDTOS;


    }
}
