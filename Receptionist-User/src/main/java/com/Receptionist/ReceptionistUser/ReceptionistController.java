package com.Receptionist.ReceptionistUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptionistController {
	
	@GetMapping("/reception")
	public String helloworld() {
		return "Hello World";
	}

}
