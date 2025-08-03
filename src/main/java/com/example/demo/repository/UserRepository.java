package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}











// JpaRepository provides ready-made methods like:
//
//    findAll() → Get all users
//
//    findById(id) → Get user by ID
//
//    save(user) → Insert/Update user
//
//    deleteById(id) → Delete user
//
//     No need to write SQL Queries........