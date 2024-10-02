package es.davidEguaras._19_Inheritance;

public class Programmer extends Employee{

    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode(){
        System.out.println("Writing some code");
    }
}
