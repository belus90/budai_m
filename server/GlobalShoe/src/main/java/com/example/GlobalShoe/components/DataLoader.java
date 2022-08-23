package com.example.GlobalShoe.components;

import com.example.GlobalShoe.models.Gender;
import com.example.GlobalShoe.models.Shoe;
import com.example.GlobalShoe.models.ShoeType;
import com.example.GlobalShoe.repositories.GenderRepository;
import com.example.GlobalShoe.repositories.PictureRepository;
import com.example.GlobalShoe.repositories.ShoeRepository;
import com.example.GlobalShoe.repositories.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements ApplicationRunner {

    @Autowired
    GenderRepository genderRepository;

    @Autowired
    ShoeTypeRepository shoeTypeRepository;

    @Autowired
    ShoeRepository shoeRepository;

    @Autowired
    PictureRepository pictureRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        //List of the gender
        Gender gender = new Gender("Mens");
        genderRepository.save(gender);
        Gender gender1 = new Gender("Women's");
        genderRepository.save(gender1);

        //List of the types of shoes
        ShoeType shoeType = new ShoeType("Sports",gender);
        shoeTypeRepository.save(shoeType);
        ShoeType shoeType1 = new ShoeType("Evening Wear",gender);
        shoeTypeRepository.save(shoeType1);
        ShoeType shoeType2 = new ShoeType("Casual",gender);
        shoeTypeRepository.save(shoeType2);
        ShoeType shoeType3 = new ShoeType("Sandals",gender);
        shoeTypeRepository.save(shoeType3);
        ShoeType shoeType4 = new ShoeType("Slippers",gender);
        shoeTypeRepository.save(shoeType4);

        ShoeType shoeType5 = new ShoeType("Sports",gender1);
        shoeTypeRepository.save(shoeType5);
        ShoeType shoeType6 = new ShoeType("Evening Wear",gender1);
        shoeTypeRepository.save(shoeType6);
        ShoeType shoeType7 = new ShoeType("Casual",gender1);
        shoeTypeRepository.save(shoeType7);
        ShoeType shoeType8 = new ShoeType("Sandals",gender1);
        shoeTypeRepository.save(shoeType8);
        ShoeType shoeType9 = new ShoeType("Slippers",gender1);
        shoeTypeRepository.save(shoeType9);

        //Sports shoes for men
        Shoe shoe = new Shoe("name","description", 56,15,shoeType);
        shoeRepository.save(shoe);
        Shoe shoe1 = new Shoe("name","description", 25,10,shoeType);
        shoeRepository.save(shoe1);
        Shoe shoe2 = new Shoe("name","description", 89,5,shoeType);
        shoeRepository.save(shoe2);
        Shoe shoe3 = new Shoe("name","description", 32,20,shoeType);
        shoeRepository.save(shoe3);

    }
}
