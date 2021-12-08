package com.Payment.PaymentMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentGreeting {

	@GetMapping("/pay")
	public String helloworld() {
		return "Hello World";
	}
}
