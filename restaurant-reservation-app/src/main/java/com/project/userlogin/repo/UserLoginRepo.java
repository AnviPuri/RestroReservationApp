package com.project.userlogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.userlogin.entity.UserLogin;

public interface UserLoginRepo extends JpaRepository<UserLogin, Integer> {

}
