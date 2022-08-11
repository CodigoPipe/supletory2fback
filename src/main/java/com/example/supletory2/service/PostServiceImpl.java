package com.example.supletory2.service;

import com.example.supletory2.dto.PostDTO;
import com.example.supletory2.entity.Post;
import com.example.supletory2.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;
    @Override
    public PostDTO createPost(PostDTO postDTO) {

        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());

        postRepo.save(post);

        PostDTO postDTO1 = new PostDTO();
        postDTO1.setPostId(post.getPostId());
        postDTO1.setTitle(post.getTitle());
        postDTO1.setContent(post.getContent());
        postDTO1.setNumberOfLikes(post.getNumberOfLikes());

        return postDTO1;

    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<Post> findAllPost() {
        return null;
    }
}
