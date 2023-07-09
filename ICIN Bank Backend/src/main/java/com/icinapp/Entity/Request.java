package com.icinapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String username;
	@Column
	private long useraccountnumber;
	@Column
	private String requestnotes;
	@Column
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUseraccountnumber() {
		return useraccountnumber;
	}
	public void setUseraccountnumber(long useraccountnumber) {
		this.useraccountnumber = useraccountnumber;
	}
	public String getRequestnotes() {
		return requestnotes;
	}
	public void setRequestnotes(String requestnotes) {
		this.requestnotes = requestnotes;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
