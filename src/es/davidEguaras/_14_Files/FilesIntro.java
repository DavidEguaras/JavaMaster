package es.davidEguaras._14_Files;

import java.io.File;
import java.io.IOException;

public class FilesIntro {
    public static void main(String[] args) {
        try {
            File file = new File("src/foo.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
