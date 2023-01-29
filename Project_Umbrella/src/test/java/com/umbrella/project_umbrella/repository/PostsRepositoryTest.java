package com.umbrella.project_umbrella.repository;

import com.umbrella.project_umbrella.domain.Post.Posts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;



@SpringBootTest
@TestPropertySource(locations="classpath:application-test.yml")
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @PersistenceContext
    EntityManager em;
    @Test
    public void PostsSave(){
        String title = "null";
        Posts posts = new Posts();

        postsRepository.save(posts);
        List<Posts> postsList = postsRepository.findAll();


        Assertions.assertEquals(postsList.get(0).getTitle(), title);


    }
}