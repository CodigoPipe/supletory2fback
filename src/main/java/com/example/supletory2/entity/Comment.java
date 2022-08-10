package com.example.supletory2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomment", nullable = false)
    private Integer id;

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
    private Set<User> user = new LinkedHashSet<>();


}