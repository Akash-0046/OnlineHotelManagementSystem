package com.Reservation.ReservationMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
	
	@GetMapping("/reservation")
	public String helloworld() {
		return "Hello World";
	}

}