package com.cgi.hungryeats.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.app.model.User;
import com.app.repository.RegistrationRepository;
import com.app.service.RegistrationService;

public class RegistrationServiceTest {
	@Mock
	private RegistrationRepository registrationRepo;
	
	@InjectMocks
	private RegistrationService registrationService;
	
	private User user;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		user = new User(1,"femisha31@gmail.com","femi","femisha","9123456789");
	}
	@Test
	public void saveUserTest() {
		when(registrationRepo.save(user)).thenReturn(user);
		assertEquals(user,registrationService.saveUser(user));
	}
	@Test
	public void saveUserFailureTest() throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId))
		{
			User userobj=registrationService.fetchUserByEmailId(tempEmailId);
			if(userobj != null)
			{
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		}
	}
	@Test
	public void fetchUserByEmailId() {
		when(registrationRepo.findByEmailId("femisha31@gmail.com")).thenReturn(user);
		assertEquals(user,registrationService.fetchUserByEmailId("femisha31@gmail.com"));     
	}
	@Test
	public void fetchingUserByWrongEmailId() {
		String tempEmail="femisha31@gmail.com";
		when(registrationRepo.findByEmailId(tempEmail)).thenReturn(null);
		User result=registrationService.fetchUserByEmailId(tempEmail);
		assertNotEquals(result,"femisha31@gmail.com");
	}
	
	@Test
	public void fetchUserByEmailIdAndPassword() {
		when(registrationRepo.findByEmailIdAndPassword("femisha31@gmail.com","femisha")).thenReturn(user);
		assertEquals(user,registrationService.fetchUserByEmailIdAndPassword("femisha31@gmail.com","femisha"));
	}
	
	@SuppressWarnings("unused")
	@Test
	public void fetchUserByWrongEmailIdAndPassword() throws Exception {
		String tempEmailId ="femisha31@gmail.com";
		String tempPassword="femisha";
		if (tempEmailId==null && tempEmailId!=user.getEmailId() &&
				tempPassword==null && tempPassword!=user.getPassword()) {
			throw new Exception ("bad credentials");
		}
		
	}

}
