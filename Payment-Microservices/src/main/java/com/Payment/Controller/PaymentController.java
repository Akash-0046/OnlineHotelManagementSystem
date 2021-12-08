package com.Payment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Payment.Model.Payment;
import com.Payment.Model.PaymentList;
import com.Payment.Service.PaymentService;
import com.google.common.base.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/hello")
	public String test() {
		return "Hello i am from Payment Microservices";
	}
	
	@PostMapping("/makepayment")
	public Payment makePayment(Payment payment) {
		return this.paymentService.makePayment(payment);
		
	}
	
	@GetMapping("/allpayments")
	public PaymentList getAllPayment() {
		PaymentList list=new PaymentList();
		list.setAllPayments(this.paymentService.getAllPayment());
		return list;
	}
	
	public Optional<Payment> getPayment(@PathVariable String id){
		return this.paymentService.getPayment(Integer.parseInt(id));
	}
	

}
