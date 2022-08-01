package com.company;

import com.composition.*;
import com.innerclass_prac.Button;
import com.innerclass_prac.GearBox;
import com.interface_prac.DeskPhone;
import com.interface_prac.ITelephone;
import com.interface_prac.MobilePhone;

import java.util.Scanner;
import com.abstractclass_prac.Animal;
import com.abstractclass_prac.Dog;
public class Main {

    public static void main(String[] args) {


        // Inheritance [IS-A]

//        Animal animal=new Animal(1,1,5,5,"Animal");
//        Dog dog=new Dog(20,20,"Dog",2,1,20,"long silky");
//        //dog.eat();
//        //dog.walk();
//        //dog.run();
//        Fish fish=new Fish(10,20,"Fish",1,2,2);
//        fish.move();


        // Composition [HAS-A]
//        Dimensions dimensions=new Dimensions(20,20,5);
//        Case theCase=new Case("101","Dell",dimensions);
//        Monitor theMonitor=new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
//        Motherboard theMotherboard=new Motherboard("102","Intel",5);
//
//        PC thePC=new PC(theCase,theMonitor,theMotherboard);
//
////        thePC.getMonitor().drawPixel();
////        thePC.getMotherboard().loadProgram("BOOT");
////        thePC.getTheCase().pressPowerButton();
//
//        thePC.powerUp("BOOT");

//
//        ITelephone timPhone;
//        timPhone=new DeskPhone(123456);
//        timPhone.powerOn();
//        timPhone.callPhone(123456);
//        timPhone.answer();
//
//        timPhone=new MobilePhone(123456);
//        timPhone.powerOn();
//        timPhone.dial(123456);

//        GearBox mclaren=new GearBox(5);
////        GearBox.Gear first=mclaren.new Gear(1,12.3);
//        mclaren.addGear(1,12.3);

        Animal dog=new Dog("Zoey");
        dog.eat();
        dog.breathe();


    }
}
