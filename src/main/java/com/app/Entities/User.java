package com.app.Entities;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class User {

	private Integer ID;
	private String username;
	private String email;
	private String password;
	
	
	//Constructors
	@Autowired
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "User [ID=" + ID + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}



	// The ID field is set at storing time in database
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}




	@Override
	public int hashCode() {
		return Objects.hash(ID, email, password, username);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(email, other.email)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}




	// Setters and Getters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getID() {
		return ID;
	}
	public String getUsername() {
		return username;
	}

	public void setID(Integer iD) {
		ID = iD;
	}
	
	
	
}
