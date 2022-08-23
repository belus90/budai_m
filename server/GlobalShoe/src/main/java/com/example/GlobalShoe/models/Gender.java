package com.example.GlobalShoe.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gender")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties({"gender"})
    @OneToMany(mappedBy = "gender", fetch = FetchType.LAZY)
    private List<ShoeType> shoeTypes;


    public Gender(String name) {
        this.name = name;
        this.shoeTypes = new ArrayList<>();

    }
    public Gender(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ShoeType> getShoeTypes() {
        return shoeTypes;
    }

    public void setShoeTypes(List<ShoeType> shoeTypes) {
        this.shoeTypes = shoeTypes;
    }
}
