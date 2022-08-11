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
public class CreateCommentDTO {

    private String commentContent;

    private Integer postIdpost;

}
