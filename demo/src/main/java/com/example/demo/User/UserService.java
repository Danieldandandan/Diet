package com.example.demo.User;

import java.util.*;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class UserService {

    public List<User> getUser(){
		return List.of(
			new User(
				1L,
				"Daniel",
				LocalDate.of(1999,Month.SEPTEMBER,8),
				"chuzhencheng1999@gmail.com",
				23
			)
		);
	}
	
}
