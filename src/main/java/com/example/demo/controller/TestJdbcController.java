package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserJdbcRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jdbc-users")
public class TestJdbcController {

    private final UserJdbcRepository repo;

    public TestJdbcController(UserJdbcRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/public")
    public List<User> getUsers() {
        return repo.findAll();
    }


    @PostMapping
    public String saveUser(@RequestBody User user) {
        repo.save(user);
        return "User Saved!";
    }
}

