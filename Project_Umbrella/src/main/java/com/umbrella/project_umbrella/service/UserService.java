package com.umbrella.project_umbrella.service;

import com.umbrella.project_umbrella.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    // 멤버 테이블
    private final UserRepository memberRepository;




}
