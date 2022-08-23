package com.example.GlobalShoe.repositories;

import com.example.GlobalShoe.models.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderRepository  extends JpaRepository<Gender, Long> {
    List<Gender> findAllByName(String name);
}
