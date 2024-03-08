package com.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.User;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
   @GetMapping("/user")
   public List<User> getUser() {
		System.out.println("getting users");
        return this.userService.getAllUsers();	   
   }
   
   @GetMapping("/currentUser")
   public String getLoginUser(Principal principal) {
	   return principal.getName();
   }
	
}
