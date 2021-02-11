package com.qa.pages;

public class LoginPage extends HomePage{
	
	
	public void loginPage() {
		
		System.out.println("login page");
		
		HomePage ll=new HomePage();
		String kk=ll.homePage();
		
		
		System.out.println(kk);
	}

}
