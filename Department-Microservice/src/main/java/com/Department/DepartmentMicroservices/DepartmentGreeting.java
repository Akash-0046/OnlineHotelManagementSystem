package com.Department.DepartmentMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentGreeting {

	@GetMapping("/dept")
	public String helloworld() {
		return "Hello World";
	}
}
