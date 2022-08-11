package com.example.supletory2.dtocreate;

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
public class PostCommentListDTO {

    private String commentContent;

    private Integer numberOfLikesComment = 0;

    private List<CommentUserListDTO> users = new ArrayList<>();


}
