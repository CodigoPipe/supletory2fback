package com.example.supletory2.dtocreate;



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
public class CreatedPostDTO {

    private Integer postId;

    private String title;

    private String content;

    private Integer numberOfLikes;

    private List<PostUserListDTO> users = new ArrayList<>();

    private List<PostCommentListDTO> comments = new ArrayList<>();



}
