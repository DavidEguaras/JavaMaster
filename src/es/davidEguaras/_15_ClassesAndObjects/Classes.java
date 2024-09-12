package es.davidEguaras._15_ClassesAndObjects;

public class Classes {

    public static void main(String[] args) {
        Cat neko = new Cat("Neko", 4);
        System.out.println(neko.getName());
        neko.meow();


        Cat gatuki = new Cat("Gatuki", 7);
        System.out.println(gatuki.getName());
        gatuki.meow();

        Cat michi = new Cat("michi");
        System.out.println(michi.getName());
        System.out.println(michi.getAge());

        Cat purrloin = new Cat("Purrloin", 3, "purple");

        //using the toString method
        System.out.println(purrloin);
    }

}
