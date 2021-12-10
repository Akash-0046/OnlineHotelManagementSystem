package com.Owner.OwnerUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

	@GetMapping("/own")
	public String helloworld() {
		return "Hello World";
	}
}
