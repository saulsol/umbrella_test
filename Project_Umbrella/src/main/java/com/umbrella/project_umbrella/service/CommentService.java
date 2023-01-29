package com.umbrella.project_umbrella.service;

import com.umbrella.project_umbrella.domain.Comment.Comment;
import com.umbrella.project_umbrella.domain.User.User;
import com.umbrella.project_umbrella.dto.commentDto.CommentRequestDto;
import com.umbrella.project_umbrella.dto.commentDto.CommentResponseDto;
import com.umbrella.project_umbrella.repository.CommentRepository;
import com.umbrella.project_umbrella.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {

    private final UserRepository userRepository;
    private final CommentRepository commentRepository;

    List<CommentResponseDto> commentResponseDtoList = new ArrayList<>();

      // SAVE
//    public List<CommentResponseDto> save(CommentRequestDto commentRequestDto){
//
//        Comment comment = new Comment(commentRequestDto.getComment(), commentRequestDto.getId();
//        Optional<User> user = userRepository.findById(commentRequestDto.getId());
//
//
//
//    }





    // UPDATE

    // DELETE

    // FIND








}
