package com.umbrella.project_umbrella.controller;

import com.umbrella.project_umbrella.dto.PostSaveRequestDto;
import com.umbrella.project_umbrella.dto.PostsUpdateDto;
import com.umbrella.project_umbrella.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PostsController {


    private final PostsService postsService;
    @PostMapping("/posting")
    public Long save (@RequestBody PostSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/posting/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateDto requestDto){
        return postsService.update(id,requestDto);
    }

}
