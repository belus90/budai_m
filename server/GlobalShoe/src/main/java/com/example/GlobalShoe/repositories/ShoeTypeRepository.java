package com.example.GlobalShoe.repositories;

import com.example.GlobalShoe.models.ShoeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeTypeRepository extends JpaRepository<ShoeType, Long> {
}
