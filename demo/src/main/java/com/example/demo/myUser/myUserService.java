package com.example.demo.myUser;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//SERVICE layer

@Service
public class myUserService {

	private final myUserRepository myUserRepository;

	@Autowired
	public myUserService(myUserRepository myUserRepository) {
		this.myUserRepository = myUserRepository;
	}
    public List<myUser> getmyUser(){
		return myUserRepository.findAll();
		// return List.of(
		// 	new myUser(
		// 		1L,
		// 		"Daniel",
		// 		LocalDate.of(1999,Month.SEPTEMBER,8),
		// 		"chuzhencheng1999@gmail.com",
		// 		23
		// 	)
		// );
	}
	
}
