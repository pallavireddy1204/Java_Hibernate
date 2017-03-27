//Creating a table in oracle db and inserting values using hibernate as ORM

package org.hibernate.dto;

import java.util.Date;

import javax.persistence.*;

@Entity 
public class UserDetails {
@Id

	private int UserId;
    private String UserName;
    private Date JoinedDate;
    private String Address;
    private String Description;
    
    
    
	public Date getJoinedDate() {
		return JoinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.JoinedDate = joinedDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		this.UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	
	
}
