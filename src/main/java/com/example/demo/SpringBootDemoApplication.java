package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.models.User;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
//		for (String bean : ctx.getBeanDefinitionNames())
//		{
//			System.out.println("Bean ---->"+bean);
//		}
	}

	@Bean
	@Primary //Used as third type of resolving
	public User getAdminUser()
	{
		//construct admin user by getting details from DB. 
		User adminuser = new User("Abinash", "abinash@gmail.com", 6738901L);
		return adminuser;
				
	}
	
	@Bean
	public User getITUser()
	{
		//construct admin user by getting details from DB.
		User ITuser = new User("IT", "abinash-IT@gmail.com", 6738901L);
		return ITuser;
				
	}
	
}
