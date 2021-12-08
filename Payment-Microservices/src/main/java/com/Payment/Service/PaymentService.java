package com.Payment.Service;

import java.util.List;
import com.Payment.Model.Payment;
import com.google.common.base.Optional;

public interface PaymentService {
	
	Payment makePayment(Payment payment);
	
	Optional<Payment> getPayment(int id);
	
	List<Payment> getAllPayment();

}
