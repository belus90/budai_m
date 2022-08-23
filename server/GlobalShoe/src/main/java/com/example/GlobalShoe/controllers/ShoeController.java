package com.example.GlobalShoe.controllers;

import com.example.GlobalShoe.models.Shoe;
import com.example.GlobalShoe.repositories.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoeController {

    @Autowired
    ShoeRepository shoeRepository;

    @GetMapping(value = "/shoes")
    public ResponseEntity<List<Shoe>> getAllShoe(){
        return new ResponseEntity<>(shoeRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/shoes/{id}")
    public ResponseEntity getShoe(@PathVariable Long id){
        return new ResponseEntity<>(shoeRepository.findById(id), HttpStatus.OK);
    }
}