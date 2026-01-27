package com.dabApp.InventoryManagement.business.repository;

import com.dabApp.InventoryManagement.business.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Business,Long>
{
    boolean existsByEmail(String email);
}
