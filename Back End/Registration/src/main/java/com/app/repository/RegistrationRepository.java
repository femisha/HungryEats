package com.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository
@Transactional
public interface RegistrationRepository extends JpaRepository<User, Integer>{
	
 public User findByEmailId(String emailId);
 public User findByEmailIdAndPassword(String emailId, String password);
 
 
}
