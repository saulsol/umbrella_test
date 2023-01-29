package com.umbrella.project_umbrella.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsUpdateDto {

    private String title;
    private String content;

    private String writer;

    @Builder
    public PostsUpdateDto (String title, String content){
        this.title = title;
        this.content = content;

        }
    }