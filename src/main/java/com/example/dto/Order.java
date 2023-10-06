package com.example.dto;

import java.io.Serializable;

public class Order implements Serializable  {
	
	private static final long serialVersionUID =1L;
	
	
	private int orderId;
	
	
	private String ordDate;
	
   
	private int purchAmt;
   
   
   private Person person;

public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public Order(int orderId, String ordDate, int purchAmt, Person person) {
	super();
	this.orderId = orderId;
	this.ordDate = ordDate;
	this.purchAmt = purchAmt;
	this.person = person;
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public String getOrdDate() {
	return ordDate;
}

public void setOrdDate(String ordDate) {
	this.ordDate = ordDate;
}

public int getPurchAmt() {
	return purchAmt;
}

public void setPurchAmt(int purchAmt) {
	this.purchAmt = purchAmt;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", ordDate=" + ordDate + ", purchAmt=" + purchAmt + ", person=" + person + "]";
}
	
   
	

}
