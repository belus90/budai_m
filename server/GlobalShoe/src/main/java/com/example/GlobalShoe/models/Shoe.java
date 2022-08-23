package com.example.GlobalShoe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shoes")
public class Shoe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shoe_name")
    private String shoe_name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "quantity")
    private Integer quantity;

    @JsonIgnoreProperties({"shoe"})
    @OneToMany(mappedBy = "shoe", fetch = FetchType.LAZY)
    private List<Picture> pictures;

    @JsonIgnoreProperties({"shoes"})
    @ManyToOne
    @JoinColumn(name = "shoeType_id", nullable = false)
    private ShoeType shoeType;

    public Shoe(){

    }

    public Shoe(String shoe_name, String description, Integer price, Integer quantity, ShoeType shoeType) {
        this.shoe_name = shoe_name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.pictures = new ArrayList<>();
        this.shoeType = shoeType;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShoe_name() {
        return shoe_name;
    }

    public void setShoe_name(String shoe_name) {
        this.shoe_name = shoe_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
