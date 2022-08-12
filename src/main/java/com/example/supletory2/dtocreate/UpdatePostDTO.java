package com.example.supletory2.dtocreate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePostDTO {

    private Integer postId;

    private String title;

    private String content;
}
