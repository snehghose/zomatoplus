package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
		@Autowired
		private UserRepository userRepository;
		
		@PostMapping("/add")
		public User addUser(@RequestBody User user)
		{
			User persistedUser=userRepository.save(user);
			return persistedUser;
		}
		
		@GetMapping("/getAll")
		public List<User> getAll()
		{
			List<User> listofusers=userRepository.findAll();
			return listofusers;
		}
		
		/*
		@GetMapping("/login")
		public String userLogin() {
			return "Hello from thinkxfactor";
		}*/
		/*@GetMapping("/login")
		public User userLogin()
		{
			User u=new User();
			u.setUsername("Jon");
			u.setPassword("winter is coming");
			System.out.println(u.toString());
			return u;
		}*/
		/*@PostMapping("/create")
		public User userCreate(@RequestBody User user)
		{
			System.out.println(user.toString());
			return user;
		}
		@PostMapping("/login")
		public User userCreate(@RequestParam ("username") String username, @RequestParam ("password") String password)
		{
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			return user;
		}*/
		
}
