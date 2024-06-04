package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.RegistrationRepository;

@Service
public class RegistrationService {
	// it will call the inbuilt method of repository
	
@Autowired
private RegistrationRepository repo;

public User saveUser(User user)
{
	// it will call the inbuilt method of repository
  return repo.save(user);	
}

// to find by using email id 
public User fetchUserByEmailId(String email) {
	return repo.findByEmailId(email);
}

public User fetchUserByEmailIdAndPassword(String email, String password) {
	return repo.findByEmailIdAndPassword(email, password);
}
}
