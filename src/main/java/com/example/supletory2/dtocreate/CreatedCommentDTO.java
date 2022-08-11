package com.example.supletory2.dtocreate;

import com.example.supletory2.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatedCommentDTO {

    private Integer commentId;

    private String commentContent;

    private Integer numberOfLikesComment = 0;

    private Integer postIdpost;


}
