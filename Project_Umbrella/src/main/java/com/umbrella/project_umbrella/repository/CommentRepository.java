package com.umbrella.project_umbrella.repository;

import com.umbrella.project_umbrella.domain.Comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByUser_Id(String id);

}
