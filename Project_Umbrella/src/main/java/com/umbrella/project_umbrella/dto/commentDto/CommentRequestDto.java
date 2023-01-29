package com.umbrella.project_umbrella.dto.commentDto;

import com.umbrella.project_umbrella.domain.Comment.Comment;
import lombok.Builder;
import lombok.Getter;


@Getter
public class CommentRequestDto {

    private String comment;

    private String id;

    @Builder
    public CommentRequestDto(String comment, String id) {
        this.comment = comment;
        this.id = id;
    }

    public Comment toEntity(){

       return Comment.builder()
                .comment(comment)
                .build();

    }


}
