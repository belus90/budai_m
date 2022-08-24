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
        Shoe shoe = new Shoe("Nike Air force 1' 07","The radiance lives on in the Nike Air Force 1 '07, the b-ball icon that puts a fresh spin on what you know best: crisp leather, bold colours and the perfect amount of flash to make you shine.", 110,15,shoeType,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/1/1.2.webp");
        shoeRepository.save(shoe);
        Shoe shoe1 = new Shoe("Air Jordan 1 Zoom CMFT","It simply doesn't get more classic than the Air Jordan 1. The shoe was brought to life by revered designer Peter Moore and premiered on the feet of Michael Jordan in the mid '80s. Readied in earth-inspired tones, the Air Jordan 1 Zoom CMFT 'Fossil Stone' delivers a padded upper, with premium suede and canvas dressed in tonal browns. Bright accents of white decorate throughout, most notably on the cut-out Swooshes, Jordan branding and laces. Ventilation arrives in the perforated toe-box, and the plush midsole is crafted with recycled Crater foam sporting a characteristic speckled look. As always, the out-sole is finished with hard-wearing rubber for grippy tread. | CT0978-201\n", 145,10,shoeType,"https://github.com/belus90/budai_m/blob/main/client/img/Men:Sports/2/2.2.jpeg?raw=true");
        shoeRepository.save(shoe1);
        Shoe shoe2 = new Shoe("Nike Pegasus Trail 3","Find your wings with an off-road run. The Nike Pegasus Trail 3 has the same comfort you love, with a design that nods to the classic Pegasus look. Nike React foam delivers responsive cushioning while tough traction helps you stay moving through rocky terrain. More support around the midfoot helps you feel secure on your journey.", 64,5,shoeType,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/3/3.webp");
        shoeRepository.save(shoe2);
        Shoe shoe3 = new Shoe("Nike Air Max Alpha Trainer 4","Tackle your most intense workouts in the Nike Air Max Alpha Trainer 4. The wide, flat base with Nike Air cushioning gives you comfortable stability for lifting. The heel is redesigned with supportive padding that helps take a load off during your heaviest sets. Everything comes together in a durable shoe built for the rigours of the gym.", 59,20,shoeType,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ASports/4/4.webp");
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
        Shoe shoe4 = new Shoe("Hush Puppies","A modern classic from Hush Puppies, the Gates men's shoe is crafted from premium leather with subtle padded collar for that easy to slip on style. Featuring comfortable memory foam insole and flexible, lightweight sole for all day wear.", 75,15,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/1/1.1.webp");
        shoeRepository.save(shoe4);
        Shoe shoe5 = new Shoe("Cost wold","For a stylish yet versatile option, choose these Rollright shoes from Cotswold. Made to last with durable leather uppers, the shoes benefit from a memory foam interior for comfort and a flat TPR sole that's ridged for grip.", 60,10,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/2/2.1.webp");
        shoeRepository.save(shoe5);
        Shoe shoe6 = new Shoe("Clark's","Offering instant comfort thanks to the combination of a dual density footbed with Cushion Max™ technology and the premium leather linings and sock, these casual lace-up shoes are ideal for everyday wear. The upper is crafted from a black leather and features subtle stitchwork, while the durable rubber sole has a lightweight feel thanks to the EVA midsole.", 89,5,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/3/3.1.webp");
        shoeRepository.save(shoe6);
        Shoe shoe7 = new Shoe("Dune","Keep things cool and casual with our Tezzy trainers. Perfect for off-duty days, they’re designed in a soft suedette with breathable perforations. Lace up to fasten.", 75,20,shoeType2,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Men%3ACasual/4/4.1.webp");
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
        Shoe shoe8 = new Shoe("Nike AIR MAX C","To celebrate the 35th anniversary of the iconic 'Air Max 1', Nike's latest iteration features a springtime-inspired colourway dubbed 'Light Madder Root'. They're made from panels of breathable mesh, felt and suede and offer the same comfortable cushioning as the original pair from '87.", 56,15,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/1/1.webp");
        shoeRepository.save(shoe8);
        Shoe shoe9 = new Shoe("Nike Air Force","The Nike Air Force 1 Low '07 LX UV Reactive displays a stem White composed of a mixture of leather textured and leather smooth. The Central Swoosh initially white becomes blue as a result of the UV rays from the sun. The same goes for the yoke white at the back of the pair that moves towards the pink, A sky blue outsole and a white midsole are added to the design.", 125,10,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/2/2.webp");
        shoeRepository.save(shoe9);
        Shoe shoe10 = new Shoe("Nike Winfloo","The Nike Winflo 8 is a budget-friendly shoe that doesn’t offer a whole lot of versatility but for the price, it’s a solid choice. I would recommend this shoe to someone who is just getting into running. It is a good introductory running shoe for the individual who wants some comfort and style in one shoe. Nike doesn't disappoint with making this shoe fresh. I received many compliments each time I wore them out in public.", 89,5,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/3/3.webp");
        shoeRepository.save(shoe10);
        Shoe shoe11 = new Shoe("Nike Junifer Trail","A LIGHT AND TOUGH OFF-ROAD RUNNER.\n" +
                "The Nike Juniper Trail delivers a consistent ride for your off-road runs. It's built for rocky trails, helping you stay focused on the path ahead. Tough traction mixes with a lightweight design so you can keep moving when tackling challenging terrain.", 45,20,shoeType5,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ASports/4/4.webp");
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
        Shoe shoe12 = new Shoe("Madalena Balett shoe","Loafers are low-cut, lace-less shoes that were originally worn around the house by gentry and the royal family during the Summer time.They are similar in shape to moccasins but have a broad, flat and low heel. The shoes have elasticated panels on both sides that eliminate the need for any shoe fastenings or laces and are generally made of leather.", 34,15,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/1/1.webp");
        shoeRepository.save(shoe12);
        Shoe shoe13 = new Shoe("Leather Moccasin","Our Madolina leather moccasins make a sophisticated choice for even the most casual of settings. With soft suede uppers on lightweight soles, Madolina presents exemplary craftsmanship in a contemporary style. Featuring a collapsible heel, these moccasins can transform into slip-on mules in an instant, offering endless styling opportunities for the new season.", 78,10,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/2/2.webp");
        shoeRepository.save(shoe13);
        Shoe shoe14 = new Shoe("Flat Leather Loafers","Give your feet a day off with our collection of flat shoes for women. We've got everything from summer espadrilles to memorable mules that'll elevate your outfits from ordinary to extraordinary. ASOS DESIGN has all the latest styles, featuring eye-catching embellishments from studs to oversized bows. Browse New Look for women's loafers, or for something chunkier, you can't beat Dr Martens' sturdy lace-up options in standout colours. Whether you're looking for flat sandals or ballet pumps, we've got just what you're after in our edit.", 89,5,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/3/3.webp");
        shoeRepository.save(shoe14);
        Shoe shoe15 = new Shoe("Begonia Leather Slip-On Shoes","If you love dressing down as much as we do, Gabor's Bergonia slip-on shoes are the perfect choice for you. Made from soft suede leather, these slip on shoes boast a classic silhouette that's been updated with the flexible trainer sole. As part of the brand's Comfort Collection, the leather footbed is equipped with cushioned zones across the heel and ball of your feet, to enhance your comfort. Wear yours with cropped trousers and a linen shirt, for an easy casual outfit option.\n", 54,20,shoeType7,"https://raw.githubusercontent.com/belus90/budai_m/main/client/img/Women%3ACasual/4/4.webp");
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
