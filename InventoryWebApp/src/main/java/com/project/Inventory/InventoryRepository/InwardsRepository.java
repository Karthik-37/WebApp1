package com.project.Inventory.InventoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Inventory.InventoryEntity.InwardsEntity;

@Repository
public interface InwardsRepository extends JpaRepository<InwardsEntity, Long>{
	

}
