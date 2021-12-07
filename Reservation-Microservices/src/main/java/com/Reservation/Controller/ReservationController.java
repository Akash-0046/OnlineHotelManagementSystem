package com.Reservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Reservation.Model.Reservation;
import com.Reservation.Model.ReservationList;
import com.Reservation.Service.ReservationService;
import com.google.common.base.Optional;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService service;
	
	

	@GetMapping("/hello")
	public String helloMsgs() {
		return "Reservation Microservice";
	}
	
	@PostMapping("/addReservation")
	public String addReservation(@RequestBody Reservation book) 
	{
		
		return  this.service.addReservation(book); 
	}


	@PutMapping("/updateReservation")
	public Reservation updateReservation(@RequestBody Reservation book)
	{
		return this.service.updateReservation(book); 
	}
	

	@DeleteMapping("/cancelReservation/{id}")
	public String deleteReservation(@PathVariable("id") String id) 
	{
		return this.service.deleteReservation(Long.parseLong(id));
	}
	

	@GetMapping("/ShowAllReservations")
	public ReservationList getResList()
	{
		ReservationList list=new ReservationList();
		list.setResList(this.service.getResList());
		return list;
	}
	
	@GetMapping("/getByreservation/{id}")
	public Optional<Reservation> getReservation(@PathVariable("id") String id)
	{
		return this.service.getReservation(Long.parseLong(id));
	}
	
}