package com.Manager.ManagerUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {
	
	@GetMapping("/man")
	public String helloworld() {
		return "Hello World";
	}

}
