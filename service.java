package com.RegistrationForm.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RegistrationForm.entity.User;
import com.RegistrationForm.repository.Userrepo;


@Service
public class UserService {
	@Autowired
     Userrepo repository;
	
	public User saveuser(User user) {
		return repository.save(user);
		
	}
	
	
	//fetching user details 
	
	public boolean authenticateUser(String email,String password) {
		Optional<User> user = repository.findByEmailAndPassword( email, password);
		return user.isPresent();
	}
	

}
