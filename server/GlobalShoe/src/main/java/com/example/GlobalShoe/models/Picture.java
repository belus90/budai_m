package com.example.GlobalShoe.models;

import javax.persistence.*;

@Entity
@Table(name = "picture")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "shoe_id")
    private Shoe shoe;


    public Picture(String name, Shoe shoe) {
        this.name = name;
        this.shoe = shoe;
    }

    public Picture (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }


}
