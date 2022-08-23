package com.example.GlobalShoe.components;

import com.example.GlobalShoe.models.Gender;
import com.example.GlobalShoe.models.Picture;
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

        //Pictures for "shoe"
        Picture picture = new Picture("",shoe);
        pictureRepository.save(picture);
        Picture picture1 = new Picture("",shoe);
        pictureRepository.save(picture1);
        Picture picture2 = new Picture("",shoe);
        pictureRepository.save(picture2);
        Picture picture3 = new Picture("",shoe);
        pictureRepository.save(picture3);

        //Pictures for "shoe1"
        Picture picture4 = new Picture("",shoe1);
        pictureRepository.save(picture4);
        Picture picture5 = new Picture("",shoe1);
        pictureRepository.save(picture5);
        Picture picture6 = new Picture("",shoe1);
        pictureRepository.save(picture6);
        Picture picture7 = new Picture("",shoe1);
        pictureRepository.save(picture7);

        //Pictures for "shoe2"
        Picture picture8 = new Picture("",shoe2);
        pictureRepository.save(picture8);
        Picture picture9 = new Picture("",shoe2);
        pictureRepository.save(picture9);
        Picture picture10 = new Picture("",shoe2);
        pictureRepository.save(picture10);
        Picture picture11 = new Picture("",shoe2);
        pictureRepository.save(picture11);

        //Pictures for "shoe3"
        Picture picture12 = new Picture("",shoe3);
        pictureRepository.save(picture12);
        Picture picture13 = new Picture("",shoe3);
        pictureRepository.save(picture13);
        Picture picture14 = new Picture("",shoe3);
        pictureRepository.save(picture14);
        Picture picture15 = new Picture("",shoe3);
        pictureRepository.save(picture15);

        //Casual shoes for men
        Shoe shoe4 = new Shoe("name","description", 56,15,shoeType2);
        shoeRepository.save(shoe4);
        Shoe shoe5 = new Shoe("name","description", 25,10,shoeType2);
        shoeRepository.save(shoe5);
        Shoe shoe6 = new Shoe("name","description", 89,5,shoeType2);
        shoeRepository.save(shoe6);
        Shoe shoe7 = new Shoe("name","description", 32,20,shoeType2);
        shoeRepository.save(shoe7);

        //Sports shoes for women's
        Shoe shoe8 = new Shoe("name","description", 56,15,shoeType5);
        shoeRepository.save(shoe8);
        Shoe shoe9 = new Shoe("name","description", 25,10,shoeType5);
        shoeRepository.save(shoe9);
        Shoe shoe10 = new Shoe("name","description", 89,5,shoeType5);
        shoeRepository.save(shoe10);
        Shoe shoe11 = new Shoe("name","description", 32,20,shoeType5);
        shoeRepository.save(shoe11);

        //Casual shoes for women's
        Shoe shoe12 = new Shoe("name","description", 56,15,shoeType7);
        shoeRepository.save(shoe12);
        Shoe shoe13 = new Shoe("name","description", 25,10,shoeType7);
        shoeRepository.save(shoe13);
        Shoe shoe14 = new Shoe("name","description", 89,5,shoeType7);
        shoeRepository.save(shoe14);
        Shoe shoe15 = new Shoe("name","description", 32,20,shoeType7);
        shoeRepository.save(shoe15);


    }
}
