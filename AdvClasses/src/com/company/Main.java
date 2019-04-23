package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myAnimal = new Animal("cat", " Ebenizer");
        myAnimal.MakeSound();
        myAnimal.PrintName();
        System.out.println("-----------------");
        Dog myDog = new Dog("Peper", true);
        myDog.MakeSound();
        myDog.PrintName();
        myDog.PlayFetch();
        Boolean Docked =myDog.getDockedTail();
        System.out.println(Docked);
        System.out.println("-----------------");
        Cat myCat = new Cat("Work");
        myCat.MakeSound();
        myCat.PrintName();
        myCat.BeHappy();
        myCat.SeeLaser();
        System.out.println("-----------------");
        OrangeTabby myOrangeTabby = new OrangeTabby("Knockoff Garfield");
        myOrangeTabby.MakeSound();
        myOrangeTabby.PrintName();
        myOrangeTabby.BeHappy();
        myOrangeTabby.LayOnLap();
        myOrangeTabby.SeeLaser();
        System.out.println("-----------------");
        RussianBlue myRussianBlue = new RussianBlue("Vladimus Von Hack'N'Slash");
        myRussianBlue.MakeSound();
        myRussianBlue.PrintName();
        myRussianBlue.BeHappy();
        myRussianBlue.SeeLaser();
        System.out.println("-----------------");
        Garfield myGarfield = new Garfield();
        myGarfield.MakeSound();
        myGarfield.PrintName();
        myGarfield.BeHappy();
        myGarfield.LayOnLap();
        myGarfield.SeeLaser();


    }
}