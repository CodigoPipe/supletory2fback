package com.example.supletory2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "comment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomment", nullable = false)
    private Integer commentId;

    @Column(name = "comment_content", nullable = false)
    private String commentContent;

    @Column(name = "number_of_likes_comment", nullable = false)
    private Integer numberOfLikesComment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_idpost", nullable = false)
    private Post postIdpost;

    @ManyToMany
    @JoinTable(name = "user_like_has_comment",
            joinColumns = @JoinColumn(name = "comment_idcomment"),
            inverseJoinColumns = @JoinColumn(name = "user_like_iduser_like"))
    private List<User> users = new ArrayList<>();


}