package es.davidEguaras._21_Interfaces;

import es.davidEguaras._20_Abstraction.Intro.Animal;
import es.davidEguaras._20_Abstraction.Intro.Cat;
import es.davidEguaras._20_Abstraction.Intro.Dog;

public class PolymorphismIntro {
    public static void main(String[] args) {
        Dog dog = new Dog("Baldur");
        Cat cat = new Cat("Kity");

        Animal[] animals = {cat, dog};

        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
