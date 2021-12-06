package com.Room;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
	
	@GetMapping("/room")
	public String helloworld() {
		return "Hello World";
	}

}
