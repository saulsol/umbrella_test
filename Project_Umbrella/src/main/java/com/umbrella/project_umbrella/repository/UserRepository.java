package com.umbrella.project_umbrella.repository;

import com.umbrella.project_umbrella.domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
//    User findByid
}
