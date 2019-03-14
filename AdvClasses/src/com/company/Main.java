package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myAnimal = new Animal("cat", "Cannoli");
        myAnimal.MakeSound();
        myAnimal.PrintName();

        Dog myDog = new Dog("Biscotti", true);
        myDog.MakeSound();
        myDog.PrintName();
        myDog.PlayFetch();
        myDog.getDockedTail();

        Cat myCat = new Cat("Penguin");
        myCat.MakeSound();
        myCat.PrintName();
        myCat.BeHappy();
        myCat.SeeLaser();

        OrangeTabby myOrangeTabby = new OrangeTabby("Riddler");
        myOrangeTabby.MakeSound();
        myOrangeTabby.PrintName();
        myOrangeTabby.BeHappy();
        myOrangeTabby.LayOnLap();
        myOrangeTabby.SeeLaser();

        RussianBlue myRussianBlue = new RussianBlue("Ja'Crispy");
        myRussianBlue.MakeSound();
        myRussianBlue.PrintName();
        myRussianBlue.BeHappy();
        myRussianBlue.SeeLaser();

        Garfield myGarfield = new Garfield();
        myGarfield.MakeSound();
        myGarfield.PrintName();
        myGarfield.BeHappy();
        myGarfield.LayOnLap();
        myGarfield.SeeLaser();


    }
}
