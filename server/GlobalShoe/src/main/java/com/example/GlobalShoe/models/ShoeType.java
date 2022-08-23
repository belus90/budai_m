package com.example.GlobalShoe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "styles")
public class ShoeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shoe_style")
    private String shoe_style;
    @JsonIgnoreProperties({"styles"})
    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @JsonIgnoreProperties({"shoeType"})
    @OneToMany(mappedBy = "shoeType", fetch = FetchType.LAZY)
    private List<Shoe> shoeType;


    public ShoeType(String shoe_style, Gender gender) {
        this.shoe_style = shoe_style;
        this.gender = gender;
        this.shoeType = new ArrayList<>();
    }
    public ShoeType(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShoe_style() {
        return shoe_style;
    }

    public void setShoe_style(String shoe_style) {
        this.shoe_style = shoe_style;
    }
    public Gender getGender() {
        return gender;
    }


    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Shoe> getShoeType() {
        return shoeType;
    }

    public void setShoeType(List<Shoe> shoeType) {
        this.shoeType = shoeType;
    }
}
