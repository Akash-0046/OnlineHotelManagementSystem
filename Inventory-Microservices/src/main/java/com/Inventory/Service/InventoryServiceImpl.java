package com.Inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventory.Model.Inventory;
import com.Inventory.Repository.InventoryRepo;
import com.google.common.base.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryRepo inventoryRepo;
	
	@Override
	public Inventory addInventory(Inventory inv) {
		// TODO Auto-generated method stub
		return inventoryRepo.insert(inv);
	}

	@Override
	public Optional<Inventory> getInventory(long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory updateInventory(Inventory inv) {
		// TODO Auto-generated method stub
		return inventoryRepo.save(inv);
	}

	@Override
	public String deleteInventory(long parseLong) {
		// TODO Auto-generated method stub
		inventoryRepo.deleteById(parseLong);
		return "Deleted Inventory";
	}

	@Override
	public List<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		return inventoryRepo.findAll();
	}

}
