package com.Receptionist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.Receptionist.Model.Payment;
import com.Receptionist.Model.PaymentList;

@RestController
@RequestMapping("/reception/payment")
public class ReceptionPaymentController {
	
	@Autowired
	RestTemplate rest;
	
	@PostMapping("/makepayment")
	public Payment makePayment(@RequestBody Payment payment) {
		return rest.postForObject("http://Payment-Microservice/payment/makepayment/", payment, Payment.class);
		
	}
	
	@GetMapping("/getPayment/{id}")
	public Payment getPayment(@PathVariable String id)
	{
		return rest.getForObject("http://Payment-Microservice/payment/getPayment/"+id, Payment.class);
	}

	@GetMapping("/allpayments")
	public PaymentList getAllGuest()
	{
		return rest.getForObject("http://Guest-Microservice/Guest/allpayments/", PaymentList.class);
	}
	
}
