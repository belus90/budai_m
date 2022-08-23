package com.example.GlobalShoe.controllers;

import com.example.GlobalShoe.models.Gender;
import com.example.GlobalShoe.repositories.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenderController {

    @Autowired
    GenderRepository genderRepository;

    @GetMapping(value = "/gender/{id}")
    public ResponseEntity getGender(@PathVariable Long id){
        return new ResponseEntity<>(genderRepository.findById(id), HttpStatus.OK);
    }
    @GetMapping("/gender")
    public ResponseEntity<List<Gender>> getAllGender(@RequestParam(name = "name", required = false) String name){

        if (name != null){
            return new ResponseEntity<>(genderRepository.findAllByName(name), HttpStatus.OK);
        }

        return new ResponseEntity<>(genderRepository.findAll(), HttpStatus.OK);
    }


}
