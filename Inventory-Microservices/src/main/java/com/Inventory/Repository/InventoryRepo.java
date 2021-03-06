package com.Inventory.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.Inventory.Model.Inventory;

@Repository
public interface InventoryRepo extends MongoRepository<Inventory, Long>{

}
