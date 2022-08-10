package com.example.supletory2.dto;

import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private Integer postId;

    private String title;

    private String content;

    private Integer numberOfLikes;

    private List<UserDTO> users = new ArrayList<>();

    private List<CommentDTO> comments = new ArrayList<>();
}
