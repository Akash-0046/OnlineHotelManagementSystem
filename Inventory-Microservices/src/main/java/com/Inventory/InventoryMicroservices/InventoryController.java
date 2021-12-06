package com.Inventory.InventoryMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	
	@GetMapping("/inventory")
	public String helloworld() {
		return "Hello World";
	}

}
