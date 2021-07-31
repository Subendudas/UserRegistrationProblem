package com.UserRegistration;
import org.junit.Test;

public class UserRegistrationTest 
{
	
	@Test
	public void checkFirstName() 
	{
		UserRegistration object = new UserRegistration();
		String firstName = object.inputFirstName();
		if (firstName.matches("^[A-Z]{1}[a-z]{2,}$") == true)
			System.out.println("First Name Accepted.");
		else
			System.out.println("Please Enter a valid First Name.");
		
	}

}
