package es.davidEguaras._14_Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriting {
    public static void main(String[] args) {
        File file = createFile("src/foo.txt");
        writeToFile(file, false);
    }

    private static void writeToFile(File file, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Hello");
            writer.println("");
            writer.println("World");
            writer.flush();
            writer.close();
        } catch (IOException e) {
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
