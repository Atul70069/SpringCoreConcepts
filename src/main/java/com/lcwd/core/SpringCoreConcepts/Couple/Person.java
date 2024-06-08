package com.lcwd.core.SpringCoreConcepts.Couple;

public class Person {

    Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playwithAnimal()
    {
        //using animla class
        animal.play();

    }

}
