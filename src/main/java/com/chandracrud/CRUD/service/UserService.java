package com.chandracrud.CRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandracrud.CRUD.Entity.User;
import com.chandracrud.CRUD.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	public User saveUser(User user){
		return userRepository.save(user);
	}
	
	
	
	
	public User findById(int id){
		Optional<User> user=userRepository.findById(id);
		if(user.isEmpty()){
			throw new RuntimeException("User not found");
		}
		return user.get();
	}
	
	
	
	
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	
	public User updateUser(User user){
		return userRepository.save(user);
	}




	public void deleteUser(int id) {
		Optional<User> user=userRepository.findById(id);
		if(user.isEmpty()){
			throw new RuntimeException("User not found");
		}
		userRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}




	 

}
