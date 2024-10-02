package es.davidEguaras._20_Abstraction.Intro;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("wof wof");
    }
}

