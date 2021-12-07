package com.Inventory.Service;

import java.util.List;
import com.Inventory.Model.Inventory;
import com.google.common.base.Optional;

public interface InventoryService {

	Inventory addInventory(Inventory inv);

	Optional<Inventory> getInventory(long parseLong);

	Inventory updateInventory(Inventory inv);

	String deleteInventory(long parseLong);

	List<Inventory> getAllInventory();
}
