package com.class31;

public class Registration {

	private String userName,email,password;
	

	public void setUserName(String userName) {
		if(userName.length()<6) {
			if(userName.isEmpty()) {
				
			}
		}else {
			this.userName=userName;
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setEmail(String email) {
if(email.equals("gamil.com")) {
			
		}
	}
	public String getEmail() {
		
		return email;
	}
	public void setPassword(String password) {
		if(password.length()<6) {
			if(password.isEmpty()) {
				
			}
		}else {
			this.password=password;
		}
		
		
		
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	
	
}
