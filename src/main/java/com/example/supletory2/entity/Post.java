package com.example.supletory2.entity;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
        generator= ObjectIdGenerators.PropertyGenerator.class,
        property="postId")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpost", nullable = false)
    private Integer postId;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "number_of_likes", nullable = false)
    private Integer numberOfLikes = 0;

    @ManyToMany
    @JoinTable(name = "user_like_has_post",
            joinColumns = @JoinColumn(name = "post_idpost"),
            inverseJoinColumns = @JoinColumn(name = "user_like_iduser_like"))
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "postIdpost")
    private List<Comment> comments = new ArrayList<>();



}