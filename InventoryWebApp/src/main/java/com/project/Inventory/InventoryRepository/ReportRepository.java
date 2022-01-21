package com.project.Inventory.InventoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Inventory.InventoryEntity.ReportEntity;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long>{

}
