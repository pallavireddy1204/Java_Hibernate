
package org.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;


@Entity 
public class UserDetails1 {
@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int UserId;
    private String UserName;

	public int getUserId() {
		return this.UserId;
	}

	public void setUserId(int userId) {
		this.UserId = userId;
	}
	public String getUserName() {
		return this.UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}
    
	
}
