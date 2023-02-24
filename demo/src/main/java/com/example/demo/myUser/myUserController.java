package com.example.demo.myUser;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// API lyer

@RestController
@RequestMapping(path = "api/v1/myuser")
public class myUserController {
    
    private final myUserService myUserService;

    @Autowired
    public myUserController (myUserService myUserService) {
        this.myUserService = myUserService;
    }

    @GetMapping
	public List<myUser> getmyUser(){
        return myUserService.getmyUser();
	}
}
