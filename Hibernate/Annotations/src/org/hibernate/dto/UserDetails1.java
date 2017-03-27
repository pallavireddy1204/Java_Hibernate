//Creating a table in oracle db and inserting values using hibernate as ORM

package org.hibernate.dto;

import java.util.Date;

import javax.persistence.*;

@Entity 
public class UserDetails1 {
@Id

	private int UserId;
    private String UserName;
    
    @Embedded
    private Address address;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    
    
    
	
}
