package es.davidEguaras._14_Files;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        File file = createFile("src/foo.txt");
        writeFileWithTryResources(file, false);

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void writeFileWithTryResources(File file, boolean append){
        try(
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ){
            writer.println("Hello");
            writer.println("World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    private static File createFile(String path){
        try {
            File file = new File("src/foo.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            return file;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}