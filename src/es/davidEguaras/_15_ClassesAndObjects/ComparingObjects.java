package es.davidEguaras._15_ClassesAndObjects;

public class ComparingObjects {
    public static void main(String[] args) {
        Cat neko = new Cat("Neko", 4, "white");
        System.out.println(neko);
        Cat neko2 = new Cat("Neko", 4, "white");
        System.out.println(neko2);
        Cat neko3 = neko;
        System.out.println(neko2);

        //false, even if the objects are identical, the reference in the heap is pointing to different objects (we are creating a new Cat, identical to previous)
        System.out.println(neko == neko2);

        //true, here neko3 was created referencing/pointing to exact same object as neko
        System.out.println(neko == neko3);

        //without method overriding, this would print false
        System.out.println(neko.equals(neko2));

    }
}
