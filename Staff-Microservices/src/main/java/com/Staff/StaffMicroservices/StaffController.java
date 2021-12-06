package com.Staff.StaffMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
	
	@GetMapping("/staff")
	public String helloworld() {
		return "Hello World";
	}

}
