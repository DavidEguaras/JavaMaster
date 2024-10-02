package es.davidEguaras._20_Abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Foo");

        // But we could also instance an Animal-inherited class like this, since cat extends animal, it means a cat is always an animal
        // But we couldn't do it the other way around since an animal isn't always a cat
        Animal cat = new Cat("Faa");

        cat.makeSound();
        dog.makeSound();

    }
}
