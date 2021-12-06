package com.Guest.GuestMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {

	@GetMapping("/guest")
	public String helloworld() {
		return "Hello World";
	}
}
