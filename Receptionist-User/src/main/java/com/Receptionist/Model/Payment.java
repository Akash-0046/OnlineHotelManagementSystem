package com.Receptionist.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Payment Details")
public class Payment {
	
	@Id
	private int paymentId;
	private double amount;
	private String paymentType;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Payment(int paymentId, double amount, String paymentType) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentType = paymentType;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentType=" + paymentType + "]";
	}
	
	

}
