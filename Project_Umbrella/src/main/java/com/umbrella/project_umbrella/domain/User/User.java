package com.umbrella.project_umbrella.domain.User;

import com.umbrella.project_umbrella.domain.Comment.Comment;
import com.umbrella.project_umbrella.domain.Post.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private String id;

    @Column
    private String password;

    @Column
    private String name;

    @OneToMany(mappedBy = "user")
    private List<Posts> posts;

    @OneToMany(mappedBy = "user")
    private List<Comment> comment;

    @Builder
    public User(String id , String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
