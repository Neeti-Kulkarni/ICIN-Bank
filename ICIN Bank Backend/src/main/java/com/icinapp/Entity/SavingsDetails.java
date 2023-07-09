package com.icinapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavingsDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int savingsid;
	@Column
	private String schemename;
	@Column
	private String debitcard;
	@Column
	private String productfeatures;
	@Column
	private String offers;
	public int getSavingsid() {
		return savingsid;
	}
	public void setSavingsid(int savingsid) {
		this.savingsid = savingsid;
	}
	public String getSchemename() {
		return schemename;
	}
	public void setSchemename(String schemename) {
		this.schemename = schemename;
	}
	public String getDebitcard() {
		return debitcard;
	}
	public void setDebitcard(String debitcard) {
		this.debitcard = debitcard;
	}
	public String getProductfeatures() {
		return productfeatures;
	}
	public void setProductfeatures(String productfeatures) {
		this.productfeatures = productfeatures;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	
	
}
