package es.davidEguaras._19_Inheritance;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python"};

        Programmer javaProgrammer = new Programmer(
                "David",
                19,
                "Calle nose que",
                "java",
                languages
        );
        System.out.println(javaProgrammer);
    }
}
