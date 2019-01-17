package com.zq.springboot.redis.distributesessiondemo.repository;

import com.zq.springboot.redis.distributesessiondemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}