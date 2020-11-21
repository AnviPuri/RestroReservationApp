package com.project.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
