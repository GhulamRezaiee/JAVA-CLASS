package com.Syntax.Class26;

public class Registration {
	private String email;
	private String userName;
	private String password;
	
	public void setEmail (String email) {
		if(!email.isEmpty() && email.endsWith("yahoo.com"))
			this.email = email;
		else
			System.out.println("Email cannot be empty and it must be yahoo");
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUserName (String userName) {
		if(!userName.isEmpty() && userName.length()>6)
			this.userName = userName;
		else
			System.out.println("User Name can not be empty and it must be more than six charactors");
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword (String password) {
		if(!password.isEmpty() && password.length()>6 && !password.contains(userName))
			this.password = password;
		else
			System.out.println("Password can not be empty and it cannot contain user name. Also, it must be more than six charactors");
	}
	
	public String getPassword() {
		return password;
	}

}
