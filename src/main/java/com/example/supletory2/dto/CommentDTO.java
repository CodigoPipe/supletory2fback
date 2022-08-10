package com.example.supletory2.dto;


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
public class CommentDTO {

    private Integer commentId;

    private String commentContent;

    private Integer numberOfLikesComment;

    private PostInCommentDTO postIdpost;

    private List<UserDTO> users = new ArrayList<>();
}
