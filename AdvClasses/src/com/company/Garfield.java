package com.company;

/**
 * Created by Gs1800 on 3/12/2019.
 */
public class Garfield {
    //properties
    String species;
    String name;

    public Garfield() {
        //constructors
        species = "Cat";
        name = "Garfield";
    }
    //methods
    public void MakeSound() {
        System.out.println("mmmm, lasagna");
    }
    public void PrintName() {
        System.out.println(name);
    }
    public void BeHappy() {
        LayOnLap();
        System.out.println("*takes a nap*");
    }
    public void LayOnLap() {
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser() {
        BeHappy();
    }
}
