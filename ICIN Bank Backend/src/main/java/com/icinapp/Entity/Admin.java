package com.icinapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private String adminemail;
	@Column
	private String password;
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
