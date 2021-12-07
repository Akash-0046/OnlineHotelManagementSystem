package com.Inventory.InventoryMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryGreeting {
	
	@GetMapping("/inv")
	public String helloworld() {
		return "Hello World";
	}

}
