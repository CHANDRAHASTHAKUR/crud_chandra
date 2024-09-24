package com.chandracrud.CRUD.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandracrud.CRUD.Entity.User;
import com.chandracrud.CRUD.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
   
 
	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		System.out.println(user.toString());
		return userService.saveUser(user);
	}
	
	@GetMapping("/findAll")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/findById")
	public User findById(@RequestParam int id) {
		return userService.findById(id);
	}
	
	@PutMapping("/update") 
	public User update(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteById")
	public void delete(@RequestParam int id) {
		userService.deleteUser(id);
	}
	
}