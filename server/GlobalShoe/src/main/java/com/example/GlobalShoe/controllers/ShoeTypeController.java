package com.example.GlobalShoe.controllers;

import com.example.GlobalShoe.models.ShoeType;
import com.example.GlobalShoe.repositories.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoeTypeController {
    @Autowired
    ShoeTypeRepository shoeTypeRepository;

    @GetMapping(value = "/styles")
    public ResponseEntity<List<ShoeType>> getAllShoeType(){
        return new ResponseEntity<>(shoeTypeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/styles/{id}")
    public ResponseEntity getShoeType(@PathVariable Long id){
        return new ResponseEntity<>(shoeTypeRepository.findById(id), HttpStatus.OK);
    }
}

