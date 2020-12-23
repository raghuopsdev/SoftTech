package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.*;

//HomeController homeController = new HomeController()
//homeController.setAdminUser = getadminUser from App contx
//put homecontroller in app context 
//Dependency Injection Example

@RestController
public class HomeController 
{
	@GetMapping("/")
	public String greetings()
	{
		return "Hello";
	}
	
	/* FIRST METHOD of resolving conflict [Resolving by type (here type = "User")]
	 * Rename the variable of User type i.e, "User getITUser"  
	 * with the bean name i.e,  getAdminUser or getITUser).
	 * Below we are using the User getITUser */
	
//	
//	  @Autowired 
//	  public User getITUser;
//	  
//	  
//	  @GetMapping("/user") 
//	  public User getUser() 
//	  {
//	    System.out.println(getITUser); 
//	    return getITUser; 
//	  }
	 
	
	/*FIRST METHOD ENDS */
	
	
	/*SECOND METHOD [Resolving by name]*/
	
//	  @Autowired 
//	  public User getITUser;
//	  
//	  @GetMapping("/it-user") 
//	  public User getITUser() 
//	  { 
//	    System.out.println(getITUser);
//	    return getITUser; 
//	  }
//	  
//	  @Autowired 
//	  public User getAdminUser;
//	  
//	  @GetMapping("/admin-user") 
//	  public User getAdminUser() 
//	  { 
//	    System.out.println(getAdminUser);
//	    return getAdminUser; 
//	  }
//	  
	  
	/*THIRD METHOD [Making one of the bean as primary]*/
	  
//	  @Autowired 
//	  public User asdf;
//	  
//	  
//	  @GetMapping("/user") 
//	  public User getUser() 
//	  {
//	    System.out.println(asdf); 
//	    return asdf; 
//	  }
	
	/*Fourth METHOD, By Qualifiers*/
	
	  @Autowired 
	  @Qualifier("getITUser")
	  public User myITUser;
	  
	  
	  @GetMapping("/it-user") 
	  public User getUser() 
	  {
	    System.out.println(myITUser); 
	    return myITUser; 
	  }
	
}

