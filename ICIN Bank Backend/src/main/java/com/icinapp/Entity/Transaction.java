package com.icinapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionid;
	@Column
	private long senderaccountnumber;
	@Column
	private int senderamount;
	@Column
	private long recevieraccountnumber;
	@Column
	private String receivername;
	@Column
	private String sendernotes;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public long getSenderaccountnumber() {
		return senderaccountnumber;
	}
	public void setSenderaccountnumber(long senderaccountnumber) {
		this.senderaccountnumber = senderaccountnumber;
	}
	public int getSenderamount() {
		return senderamount;
	}
	public void setSenderamount(int senderamount) {
		this.senderamount = senderamount;
	}
	public long getRecevieraccountnumber() {
		return recevieraccountnumber;
	}
	public void setRecevieraccountnumber(long recevieraccountnumber) {
		this.recevieraccountnumber = recevieraccountnumber;
	}
	
	public String getSendernotes() {
		return sendernotes;
	}
	public void setSendernotes(String sendernotes) {
		this.sendernotes = sendernotes;
	}
	public String getReceivername() {
		return receivername;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	
	
	
}
