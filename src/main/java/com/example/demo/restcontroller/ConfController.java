package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfController 
{
	@Value("${app.users.admin.name}")
	public String adminName;
	
	@GetMapping("/config")
	public String greetings()
	{
		return adminName;
	}
}
