package es.davidEguaras._13_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkedExceptions {
    public static void main(String[] args) {

        try {
            // Trying to open a file that does not exist
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. This is a checked exception.");
        }
    }
}
