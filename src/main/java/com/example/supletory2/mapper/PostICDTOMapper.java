package com.example.supletory2.mapper;

import com.example.supletory2.dto.PostInCommentDTO;
import com.example.supletory2.entity.Post;

public class PostICDTOMapper {


    public static Post returnPostFromPICDTO(PostInCommentDTO postInCommentDTO){
        Post post = new Post();
        post.setPostId(postInCommentDTO.getPostId());

        return post;
    }

    public static PostInCommentDTO returnPICDTOfromPost(Post post){
        PostInCommentDTO postInCommentDTO = new PostInCommentDTO();
        postInCommentDTO.setPostId(post.getPostId());

        return postInCommentDTO;
    }
}
