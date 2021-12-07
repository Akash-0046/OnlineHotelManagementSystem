package com.Staff.StaffMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffGreeting {
	
	@GetMapping("/st")
	public String helloworld() {
		return "Hello World";
	}

}
