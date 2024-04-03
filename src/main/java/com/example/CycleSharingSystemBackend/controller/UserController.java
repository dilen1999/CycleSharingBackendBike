package com.example.CycleSharingSystemBackend.controller;

import com.example.CycleSharingSystemBackend.model.User;
import com.example.CycleSharingSystemBackend.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")

public class UserController {
    @Autowired
    private Userrepository userrepository;

    @PostMapping("/User")
    public User newUser(@RequestBody User newUser) {
        return (userrepository.save(newUser));
    }

    @GetMapping("/User")
    List<User> getAllUser() {
        return userrepository.findAll();
    }


}
