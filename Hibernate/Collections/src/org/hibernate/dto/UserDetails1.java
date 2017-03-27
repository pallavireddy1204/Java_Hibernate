//Collections in hibernate

package org.hibernate.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity 
public class UserDetails1 {
@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int UserId;
    private String UserName;

    @ElementCollection
    private Set<Address> listOfAddresses=new HashSet();
    
    public Set<Address> getListOfAddresses() {
		return this.listOfAddresses;
	}

	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}

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
