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

        //List of the types of shoes for Men's
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

        //List of the types of shoes for Women's
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

        //Sports shoes for Men's
        Shoe shoe = new Shoe("Nike Air force 1' 07","description", 110,15,shoeType,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/1/1.2.webp");
        shoeRepository.save(shoe);
        Shoe shoe1 = new Shoe("Air Jordan 1 Zoom CMFT","description", 145,10,shoeType,"https://github.com/belus90/budai_m/blob/main/client/img/Men:Sports/2/2.2.jpeg?raw=true");
        shoeRepository.save(shoe1);
        Shoe shoe2 = new Shoe("Nike Pegasus Trail 3","description", 64,5,shoeType,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/3/3.webp");
        shoeRepository.save(shoe2);
        Shoe shoe3 = new Shoe("Nike Air Max Alpha Trainer 4","description", 59,20,shoeType,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/4/4.webp");
        shoeRepository.save(shoe3);

        //Sport pictures for "shoe" (Men's)
        Picture picture1 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/1/1.webp",shoe);
        pictureRepository.save(picture1);
        Picture picture2 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/1/1.3.webp",shoe);
        pictureRepository.save(picture2);
        Picture picture3 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/1/1.1.webp",shoe);
        pictureRepository.save(picture3);

        //Sport pictures for "shoe1" (Men's)
        Picture picture5 = new Picture("https://github.com/belus90/budai_m/blob/main/client/img/Men:Sports/2/2.jpeg?raw=true",shoe1);
        pictureRepository.save(picture5);
        Picture picture6 = new Picture("https://github.com/belus90/budai_m/blob/main/client/img/Men:Sports/2/2.3.jpeg?raw=true",shoe1);
        pictureRepository.save(picture6);
        Picture picture7 = new Picture("https://github.com/belus90/budai_m/blob/main/client/img/Men:Sports/2/2.1.jpeg?raw=true",shoe1);
        pictureRepository.save(picture7);

        //Sport pictures for "shoe2" (Men's)
        Picture picture9 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/3/3.2.webp",shoe2);
        pictureRepository.save(picture9);
        Picture picture10 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/3/3.1.webp",shoe2);
        pictureRepository.save(picture10);
        Picture picture11 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/3/3.3.webp",shoe2);
        pictureRepository.save(picture11);

        //Sport pictures for "shoe3" (Men's)
        Picture picture13 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/4/4.4.webp",shoe3);
        pictureRepository.save(picture13);
        Picture picture14 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/4/4.1.webp",shoe3);
        pictureRepository.save(picture14);
        Picture picture15 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/4/4.2.webp",shoe3);
        pictureRepository.save(picture15);

        //Casual shoes for Men's
        Shoe shoe4 = new Shoe("Hush Puppies","description", 75,15,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/1/1.1.webp");
        shoeRepository.save(shoe4);
        Shoe shoe5 = new Shoe("Cost wold","description", 60,10,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/2/2.1.webp");
        shoeRepository.save(shoe5);
        Shoe shoe6 = new Shoe("Clark's","description", 89,5,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/3/3.1.webp");
        shoeRepository.save(shoe6);
        Shoe shoe7 = new Shoe("Dune","description", 75,20,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/4/4.1.webp");
        shoeRepository.save(shoe7);

        //Casual pictures for "shoe4" (Men's)
        Picture picture17 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/1/1.2.webp",shoe4);
        pictureRepository.save(picture17);
        Picture picture18 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/1/1.3.webp",shoe4);
        pictureRepository.save(picture18);
        Picture picture19 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/1/1.webp",shoe4);
        pictureRepository.save(picture19);

        //Casual pictures for "shoe5" (Men's)
        Picture picture20 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/2/2.3.webp",shoe5);
        pictureRepository.save(picture20);
        Picture picture22 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/2/2.2.webp",shoe5);
        pictureRepository.save(picture22);
        Picture picture23 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/2/2.webp",shoe5);
        pictureRepository.save(picture23);

        //Casual pictures for "shoe6" (Men's)
        Picture picture25 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/3/3.2.webp",shoe6);
        pictureRepository.save(picture25);
        Picture picture26 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/3/3.3.webp",shoe6);
        pictureRepository.save(picture26);
        Picture picture27 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/3/3.webp",shoe6);
        pictureRepository.save(picture27);

        //Casual pictures for "shoe7" (Men's)
        Picture picture29 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/4/4.2.webp",shoe7);
        pictureRepository.save(picture29);
        Picture picture30 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/4/4.3.webp",shoe7);
        pictureRepository.save(picture30);
        Picture picture31 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/4/4.webp",shoe7);
        pictureRepository.save(picture31);


        //Sports shoes for Women's
        Shoe shoe8 = new Shoe("Nike AIR MAX C","description", 56,15,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/1/1.webp");
        shoeRepository.save(shoe8);
        Shoe shoe9 = new Shoe("Nike Air Force","description", 125,10,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/2/2.webp");
        shoeRepository.save(shoe9);
        Shoe shoe10 = new Shoe("Nike Winfloo","description", 89,5,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/3/3.webp");
        shoeRepository.save(shoe10);
        Shoe shoe11 = new Shoe("Nike Junifer Trail","description", 45,20,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/4/4.webp");
        shoeRepository.save(shoe11);

        //Sport pictures for "shoe8" (Women's)
        Picture picture33 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/1/1.3.webp",shoe8);
        pictureRepository.save(picture33);
        Picture picture34 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/1/1.1.webp",shoe8);
        pictureRepository.save(picture34);
        Picture picture35 = new Picture("https://github.com/belus90/budai_m/blob/main/client/img/Women:Sports/1/1.2.jpeg?raw=true",shoe8);
        pictureRepository.save(picture35);

        //Sport pictures for "shoe9" (Women's)
        Picture picture37 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/2/2.1.webp",shoe9);
        pictureRepository.save(picture37);
        Picture picture38 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/2/2.2.webp",shoe9);
        pictureRepository.save(picture38);
        Picture picture39 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/2/2.3.webp",shoe9);
        pictureRepository.save(picture39);

        //Sport pictures for "shoe10" (Women's)
        Picture picture41 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/3/3.3.webp",shoe10);
        pictureRepository.save(picture41);
        Picture picture42 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/3/3.1.webp",shoe10);
        pictureRepository.save(picture42);
        Picture picture43 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/3/3.2.webp",shoe10);
        pictureRepository.save(picture43);

        //Sport pictures for "shoe11" (Women's)
        Picture picture45 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/4/4.3.webp",shoe11);
        pictureRepository.save(picture45);
        Picture picture46 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/4/4.1.webp",shoe11);
        pictureRepository.save(picture46);
        Picture picture47 = new Picture("https://github.com/belus90/budai_m/blob/main/client/img/Women:Sports/4/4.2.jpeg?raw=true",shoe11);
        pictureRepository.save(picture47);

        //Casual shoes for women's
        Shoe shoe12 = new Shoe("Madalena Balett shoe","description", 34,15,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/1/1.webp");
        shoeRepository.save(shoe12);
        Shoe shoe13 = new Shoe("Leather Moccasin","description", 78,10,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/2/2.webp");
        shoeRepository.save(shoe13);
        Shoe shoe14 = new Shoe("Flat Leather Loafers","description", 89,5,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/3/3.webp");
        shoeRepository.save(shoe14);
        Shoe shoe15 = new Shoe("name","description", 54,20,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/4/4.webp");
        shoeRepository.save(shoe15);

        //Casual pictures for "shoe12" (Women's)
        Picture picture49 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/1/1.3.webp",shoe12);
        pictureRepository.save(picture49);
        Picture picture50 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/1/1.1.webp",shoe12);
        pictureRepository.save(picture50);
        Picture picture51 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/1/1.2.webp",shoe12);
        pictureRepository.save(picture51);

        //Casual pictures for "shoe13" (Women's)
        Picture picture53 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/2/2.3.webp",shoe13);
        pictureRepository.save(picture53);
        Picture picture54 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/2/2.1.webp",shoe13);
        pictureRepository.save(picture54);
        Picture picture55 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/2/2.2.webp",shoe13);
        pictureRepository.save(picture55);

        //Casual pictures for "shoe14" (Women's)
        Picture picture57 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/3/3.3.webp",shoe14);
        pictureRepository.save(picture57);
        Picture picture58 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/3/3.1.webp",shoe14);
        pictureRepository.save(picture58);
        Picture picture59 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/3/3.2.webp",shoe14);
        pictureRepository.save(picture59);

        //Casual pictures for "shoe15" (Women's)
        Picture picture61 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/4/4.3.webp",shoe15);
        pictureRepository.save(picture61);
        Picture picture62 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/4/4.1.webp",shoe15);
        pictureRepository.save(picture62);
        Picture picture63 = new Picture("https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/4/4.2.webp",shoe15);
        pictureRepository.save(picture63);


    }
}
