package com.Owner.OwnerUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

	@GetMapping("/owner")
	public String helloworld() {
		return "Hello World";
	}
}
