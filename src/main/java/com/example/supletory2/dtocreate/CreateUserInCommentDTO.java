package com.example.supletory2.dtocreate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserInCommentDTO {

    private String userName;

    private String dni;

    private Integer commentId;
}
