package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.*;

@RestController
public class HomeController 
{
	@GetMapping("/")
	public String greetings()
	{
		return "Hello";
	}
	
	@GetMapping("/user")
	public User getUser()
	{
		User newuser = new User("Abinash", "abinash@gmail.com", 6738901L);
		System.out.println(newuser);
		return newuser;
		
	}
}

