package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController 
{
	@Value("${app.users.admin.name}")
	public String adminName;
	
	@GetMapping("/getadmin")
	public String getAdminName() {
		return adminName;
	}
	

	@Value("${app.users.itUser.name}")
	public String itUserName;


	@GetMapping("/getituser")
	public String getItUserName() {
		return itUserName;
	}
	
	@Value("${db.name}")
	public String dbName;

	@GetMapping("/dbname")
	public String getdbName() { 
		return dbName;
	}
	

//	@GetMapping("/config")
//	public String greetings()
//	{
//		
//		return adminName;
//	}
}
