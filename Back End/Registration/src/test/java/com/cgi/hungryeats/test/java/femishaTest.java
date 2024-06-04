package com.cgi.hungryeats.test.java;

import org.junit.Before;
import org.junit.Test;

import com.app.model.User;

import junit.framework.Assert;

public class femishaTest {
private User user;
	
	@Before
	public void setUp() throws Exception{
		user=new User();
		user.setId(1);
		user.setEmailId("femisha31@gmail.com");
		user.setUserName("femi");
		user.setPassword("femisha");
		user.setMobile("9123456789");
		
	}
	@Test
	public void testGetId() {
		int expected=1;
		int actual=user.getId();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testGetEmailId() {
		String expected="femisha31@gmail.com";
		String actual=user.getEmailId();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testGetUserName() {
		String expected="femi";
		String actual=user.getUserName();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testGetPassword() {
		String expected="femisha";
		String actual=user.getPassword();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testGetMobile() {
		String expected="9123456789";
		String actual=user.getMobile();
		Assert.assertEquals(expected,actual);
	}

}
