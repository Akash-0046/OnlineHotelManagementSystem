package com.Payment.PaymentMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping("/payment")
	public String helloworld() {
		return "Hello World";
	}
}
