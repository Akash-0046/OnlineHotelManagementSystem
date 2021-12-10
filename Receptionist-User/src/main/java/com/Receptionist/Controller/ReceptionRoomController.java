package com.Receptionist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.Receptionist.Model.Room;
import com.Receptionist.Model.RoomList;


@RestController
@RequestMapping("/reception/room")
public class ReceptionRoomController {
	
	@Autowired
	private RestTemplate restTemplate;
		
	@GetMapping("/findAllRoom")
	public RoomList getRoom() 
	{
		return restTemplate.getForObject("http://Room-Microservice/rooms/findAllRoom/", RoomList.class);
	}
	
	
	@GetMapping("/findById/{id}")
	public Room getRoom(@PathVariable("id") String id) 
	{
		return restTemplate.getForObject("http://Room-Microservice/rooms/findById/"+id, Room.class);
	}
	
}
