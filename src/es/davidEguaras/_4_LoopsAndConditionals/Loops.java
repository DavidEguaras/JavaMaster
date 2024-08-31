package es.davidEguaras._4_LoopsAndConditionals;

public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop Demo:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();

        // While loop
        System.out.println("While Loop Demo:");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();

        // Do-while loop
        System.out.println("Do-While Loop Demo:");
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
        System.out.println();

        // Enhanced for loop (for-each)
        System.out.println("Enhanced For Loop Demo:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number = " + num);
        }
    }
}
