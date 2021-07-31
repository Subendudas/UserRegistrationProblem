package com.UserRegistration;
import java.util.Scanner;

public class UserRegistration 
{
	Scanner scan = new Scanner(System.in);

	String inputFirstName() 
	{
		System.out.println("Enter First Name");
		String firstname = scan.next();
		return firstname;
	}
	public static void main(String[] args) 
	{
		UserRegistrationTest firstnamecheck = new UserRegistrationTest();
		firstnamecheck.checkFirstName();
	}

}
