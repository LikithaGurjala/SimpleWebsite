package com.example.simplewebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simplewebsite.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
