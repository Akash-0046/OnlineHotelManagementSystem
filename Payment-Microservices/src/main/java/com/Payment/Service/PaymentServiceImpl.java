package com.Payment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Payment.Model.Payment;
import com.Payment.Repository.PaymentRepo;
import com.google.common.base.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepo repo;

	@Override
	public Payment makePayment(Payment payment) {
		// TODO Auto-generated method stub
		return repo.insert(payment);
	}

	@Override
	public Optional<Payment> getPayment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
