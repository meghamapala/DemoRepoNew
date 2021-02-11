package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.LoginPage;

public class LoginTest extends LoginPage{
	
	@Test
	public void test1() {
		
		System.out.println("test1");
		
		LoginPage jj = new LoginPage();
		jj.homePage();
		jj.loginPage();
		
	}

}
