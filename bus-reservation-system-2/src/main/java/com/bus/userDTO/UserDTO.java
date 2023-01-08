package com.bus.userDTO;

public class UserDTO {
	private String firstName = "Enter your FirstName";
	private String lastName = "Enter your LastName";
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "UserDTO [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
