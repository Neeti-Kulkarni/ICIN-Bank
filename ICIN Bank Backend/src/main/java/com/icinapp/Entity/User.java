package com.icinapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userid;
	@Column
	private long useraccountnumber;
	@Column
	private String username;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private long pincode;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private String mobilenumber;
	@Column
	private String productcode;
	@Column
	private String accountcurrency;
	@Column
	private String epin;
	@Column
	private String block;
	@Column
	private int amountdeposited;
	@Column
	private int primaryaccount;
	@Column
	private String status;
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrimaryaccount() {
		return primaryaccount;
	}
	public void setPrimaryaccount(int primaryaccount) {
		this.primaryaccount = primaryaccount;
	}
	public int getAmountdeposited() {
		return amountdeposited;
	}
	public void setAmountdeposited(int amountdeposited) {
		this.amountdeposited = amountdeposited;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getUseraccountnumber() {
		return useraccountnumber;
	}
	public void setUseraccountnumber(long useraccountnumber) {
		this.useraccountnumber = useraccountnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getAccountcurrency() {
		return accountcurrency;
	}
	public void setAccountcurrency(String accountcurrency) {
		this.accountcurrency = accountcurrency;
	}
	public String getEpin() {
		return epin;
	}
	public void setEpin(String epin) {
		this.epin = epin;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	
	
}
