package com.umbrella.project_umbrella.service;

import com.umbrella.project_umbrella.domain.Post.Posts;
import com.umbrella.project_umbrella.dto.PostSaveRequestDto;
import com.umbrella.project_umbrella.dto.PostsUpdateDto;
import com.umbrella.project_umbrella.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    public Long update(Long id, PostsUpdateDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id =" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }


}
