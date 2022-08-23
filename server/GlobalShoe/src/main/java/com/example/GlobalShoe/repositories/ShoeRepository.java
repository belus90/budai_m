package com.example.GlobalShoe.repositories;

import com.example.GlobalShoe.models.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeRepository  extends JpaRepository<Shoe, Long> {
}
