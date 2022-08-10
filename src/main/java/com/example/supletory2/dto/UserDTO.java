package com.example.supletory2.dto;

import com.example.supletory2.entity.Comment;
import com.example.supletory2.entity.Post;
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
public class UserDTO {

    private Integer userId;

    private String userName;

    private String dni;

    private List<CommentDTO> comments = new ArrayList<>();

    private List<PostDTO> posts = new ArrayList<>();
}
