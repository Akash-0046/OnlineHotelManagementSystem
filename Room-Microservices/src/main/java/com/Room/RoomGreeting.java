package com.Room;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomGreeting {
	
	@GetMapping("/ro")
	public String helloworld() {
		return "Hello World";
	}

}
