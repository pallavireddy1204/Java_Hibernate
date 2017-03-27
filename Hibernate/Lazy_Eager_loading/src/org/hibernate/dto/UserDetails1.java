//Configuring collections and adding keys

package org.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;


@Entity 
public class UserDetails1 {
@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int UserId;
    private String UserName;

    @ElementCollection(fetch=FetchType.EAGER)
    @JoinTable(name="User_Collection",joinColumns=@JoinColumn(name="userid"))
    private Collection<Address> listOfAddresses=new ArrayList<Address>();
    
    public Collection<Address> getListOfAddresses() {
		return this.listOfAddresses;
	}

	public void setListOfAddresses(Collection<Address> listOfAddresses) {
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
