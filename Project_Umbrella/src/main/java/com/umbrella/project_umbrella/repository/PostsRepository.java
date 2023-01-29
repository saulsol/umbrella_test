package com.umbrella.project_umbrella.repository;

import com.umbrella.project_umbrella.domain.Post.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {

}
