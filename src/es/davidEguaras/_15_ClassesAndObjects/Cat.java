package es.davidEguaras._15_ClassesAndObjects;

import java.util.Objects;

public class Cat {
    //These are properties
    private String name;
    private int age;
    private String color;

    //These are constructors
    //We can have multiple constructors for different use cases
    public Cat (String name, int age, String color){
        //inside constructor
        this(name, age);
        this.color = color;
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat (String name){
        this.name = name;
        this.age = 0;
        this.color = "white";
    }
    //this is the default constructor Java will assign to the object by default
    public Cat(){

    }

    //these are behaviors/methods
    public void meow(){
        System.out.println(name + ": meow...");
    }



    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter methods
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Cat name: " +name+ ", Color: " +color+ ", Age: " +age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}