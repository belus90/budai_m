package com.example.GlobalShoe.models;

import javax.persistence.*;

@Entity
@Table(name = "picture")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "img")
    private String img;

    @ManyToOne
    @JoinColumn(name = "shoe_id")
    private Shoe shoe;


    public Picture(String img, Shoe shoe) {
        this.img = img;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }


}
