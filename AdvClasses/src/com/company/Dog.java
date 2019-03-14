package com.company;

/**
 * Created by Gs1800 on 3/12/2019.
 */
public class Dog {
    //properties
    String species;
    String name;
    boolean dockedTail;

    public Dog(String Name, boolean DockedTail) {
        //constructor
        species = "Dog";
        name = Name;
        dockedTail = DockedTail;
    }
    //Methods
    public void MakeSound() {
        System.out.println("Woof");
    }
    public void PrintName() {

        System.out.println(name);
    }
    public void PlayFetch() {

        System.out.println("*chases ball 5 times then quits");
    }
    public boolean getDockedTail(){
        return(dockedTail);


    }


}

