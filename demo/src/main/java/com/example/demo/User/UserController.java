package com.example.demo.User;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// API lyer

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    
    private final UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping
	public List<User> getUser(){
        return userService.getUser();
	}
}
