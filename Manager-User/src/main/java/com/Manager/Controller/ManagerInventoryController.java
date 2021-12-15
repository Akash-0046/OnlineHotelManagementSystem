package com.Manager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.Manager.Model.Inventory;
import com.Manager.Model.InventoryList;

@RestController
@RequestMapping("/manager/inventory")
public class ManagerInventoryController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAllInv")
	public InventoryList getInventary() 
	{
		return restTemplate.getForObject("http://Inventory-Microservice/Inventory/getAllInv/", InventoryList.class);
	}
	
	@GetMapping("/getByInv/{id}")
	public Inventory getInventary(@PathVariable("id") String id) 
	{
		return restTemplate.getForObject("http://Inventary-Microservice/Inventory/getByInv/"+id, Inventory.class);
	}
	
	@PostMapping("/addInv")
	public Inventory addInventary(@RequestBody Inventory inv) {
		return restTemplate.postForObject("http://Inventory-Microservice/Inventory/addInv/", inv, Inventory.class);
	}
	
	@PutMapping("/updateInv")
	public Inventory updateInventary(@RequestBody Inventory inv) {
	 restTemplate.put("http://Inventory-Microservice/Inventory/updateInv/",inv, Inventory.class);
	 return inv;
	}
	
	@DeleteMapping("/deleteByInv/{id}")
	public String deleteInventary(@PathVariable("id") String id) {
		 restTemplate.delete("http://Inventory-Microservice/Inventory/deleteByInv/"+id);
		return "Deleted room "+id;
	}

}

