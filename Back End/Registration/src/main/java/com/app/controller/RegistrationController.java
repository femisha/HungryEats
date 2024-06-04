package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.RegistrationService;

@RestController
public class RegistrationController {

	//error->use database 
	@Autowired
	private RegistrationService service;
	
	// now this method is called so we need to do mapping here 
	//whener user will hit localhost this registeruser method will be called 
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200/")
	public User registerUser(@RequestBody User user) throws Exception
	{
		// to check wherether it is not repeated email id 
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId))
		{
			User userobj=service.fetchUserByEmailId(tempEmailId);
			if(userobj != null)
			{
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200/")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		System.out.println(tempPass);
		User userObj = null;
		if(tempEmailId != null && tempPass != null)
		{
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if (userObj == null) {
			throw new Exception ("bad credentials");
		}
		return userObj;
		
		
	}
	@RequestMapping(value = "/")
    public String test() {
        return "testing";
    }
}
