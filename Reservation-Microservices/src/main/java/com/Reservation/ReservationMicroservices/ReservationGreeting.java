package com.Reservation.ReservationMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationGreeting {
	
	@GetMapping("/reserve")
	public String helloworld() {
		return "Hello World";
	}

}
