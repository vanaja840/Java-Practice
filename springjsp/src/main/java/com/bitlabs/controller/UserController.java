package com.bitlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bitlabs.dao.Dao;
import com.bitlabs.dao.Daoimple;
import com.bitlabs.entity.User;

@Controller
public class UserController {
	
	Dao d=new Daoimple();
	
	/*
	@GetMapping("/register1")
	public String home() { 
		
		return "index"; 
	}
	 */
	//https://localhost:8080/register
	@GetMapping("/register1")
	public String register()
	{
		
		return "index";
	}
	
	@PostMapping("/UserRegistration")
	public String addUser(@ModelAttribute("user")  User user)
	{
		boolean b=d.addUser(user);
		return "index";
	}
	
	@PostMapping("/reqLogin")
	public String login(@ModelAttribute("user") User user)
	{
		boolean b=d.login(user.getUsername(), user.getPassword());
		
		if(b)
		{
			return "Success";
		}
		else
		{
			return "Error";
		}
	}

}