package com.company;

/**
 * Created by Gs1800 on 3/12/2019.
 */
public class Cat {
    //properties
    String species;
    String name;

    public Cat(String Name) {
        //constructor
        species = "cat";
        name = Name;
    }
    //methods
    public void MakeSound(){
        System.out.println("Meow");
    }
    public void PrintName() {
        System.out.println(name);
    }
    public void BeHappy() {
        System.out.println("purrrr");
        MakeSound();
        SeeLaser();
    }
    public void SeeLaser() {
        System.out.println("*cat pounces*");
    }
}

