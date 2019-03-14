package com.company;

/**
 * Created by Gs1800 on 3/12/2019.
 */
public class RussianBlue {
    //properties
    String species;
    String name;

    public RussianBlue(String Name) {
        //constructors
        species = "cat";
        name = Name;
    }
    //methods
    public void MakeSound() {
        System.out.println("Hisss");
    }
    public void PrintName() {
        System.out.println(name);
    }
    public void BeHappy() {
        System.out.println("purrrr");
        SeeLaser();
    }
    public void SeeLaser() {
        System.out.println("*cat pounces*");
    }

}
