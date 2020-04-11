package com.Syntax.Class26;

public class RegistrationTest {
	public static void main(String[] args) {
		Registration user = new Registration();
		
		user.setEmail("");
		System.out.println(user.getEmail());
		user.setEmail("user@gmail.com");
		System.out.println(user.getEmail());
		user.setEmail("user@yahoo.com");
		System.out.println(user.getEmail());
		
		System.out.println("---------------------------------------");
		
		user.setUserName("");
		System.out.println(user.getUserName());
		user.setUserName("John");
		System.out.println(user.getUserName());
		user.setUserName("JohnTorres");
		System.out.println(user.getUserName());
		
		System.out.println("---------------------------------------");
		
		user.setPassword("");
		System.out.println(user.getPassword());
		user.setPassword("passw");
		System.out.println(user.getPassword());
		user.setPassword("JohnTorres123");
		System.out.println(user.getPassword());
		user.setPassword("flowerMonth");
		System.out.println(user.getPassword());
	}

}
