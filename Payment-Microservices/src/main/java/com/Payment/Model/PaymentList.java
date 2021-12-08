package com.Payment.Model;

import java.util.List;

public class PaymentList {
	
	private List<Payment> allPayments;

	public List<Payment> getAllPayments() {
		return allPayments;
	}

	public void setAllPayments(List<Payment> allPayments) {
		this.allPayments = allPayments;
	}
	
}
