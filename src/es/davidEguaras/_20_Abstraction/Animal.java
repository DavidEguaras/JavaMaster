package es.davidEguaras._20_Abstraction;

// When a class is declared as abstract, it means that we cannot create instances of that class.
// In this case, the rationale for making the Animal class abstract is that it does not make sense to create a generic instance of an animal.
// Instead, we should define specific species, such as Dog or Cat.

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    //this method should be abstract and override by the son classes
     public abstract void makeSound();
}
