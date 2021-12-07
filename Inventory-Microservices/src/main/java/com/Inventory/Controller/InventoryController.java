package com.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.Inventory.Model.Inventory;
import com.Inventory.Model.InventoryList;
import com.Inventory.Service.InventoryService;
import com.google.common.base.Optional;

public class InventoryController {

	@Autowired
	InventoryService inventoryService;
	
	
	@PostMapping("/addInv")
	public Inventory addInventary(@RequestBody Inventory inv)
	{
		return this.inventoryService.addInventory(inv);
	}
	@GetMapping("/getAllInv")
	public InventoryList getAllInventory(){
		InventoryList list=new InventoryList();
		list.setAllstaff(this.inventoryService.getAllInventory());
		return list;
	}
	
	@GetMapping("/getByInv/{id}")
	public Optional<Inventory> getInventary(@PathVariable("id") String id)
	{
		return this.inventoryService.getInventory(Long.parseLong(id));
	}
	
	@PutMapping("/updateInv")
	public Inventory updateInventary(@RequestBody Inventory inv)
	{
		return this.inventoryService.updateInventory(inv);
	}
	
	@DeleteMapping("/deleteByInv/{id}")
	public String deleteInventary(@PathVariable("id") String id)
	{
		return this.inventoryService.deleteInventory(Long.parseLong(id));
	}
}
