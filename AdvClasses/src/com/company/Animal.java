package com.company;

/**
 * Created by Gs1800 on 3/12/2019.
 */
public class Animal {
    //properties
    String species;
    String name;

    public Animal(String Species, String Name){
        //constructor
        name = Name;
        species = Species;
    }
    //method
    public void MakeSound(){
        System.out.println("Grrr");
    }
    public void PrintName(){
        System.out.println(name);
    }
}
