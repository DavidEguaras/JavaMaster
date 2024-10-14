package cursoSerbatic.sesion6.Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.nio.file.Files;


public class FileUtility {

    public static File createFile(String path){
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

    /*
En Java, el bloque try-with-resources se utiliza para asegurar que los recursos que implementan la interfaz AutoCloseable
(como archivos, conexiones de base de datos, flujos de datos, etc.)
se cierren automáticamente al finalizar el bloque try, ya sea porque se completó exitosamente o
porque se produjo una excepción.
    */
    public static void writeLineToFile(String line, File file, boolean append) {
        // Try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRandomLinesToFile(File file, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            Random random = new Random();
            int randomLinesNumber = random.nextInt(6) + 5;
            System.out.println("The file has been printed: " + randomLinesNumber + " lines");
            for (int i = 1; i < randomLinesNumber + 1; i++) {
                writer.println("Line" + i);
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteLineFromFile(int numberOfLineToDelete, File file){
        List<String> fileLines = new ArrayList<>();

        //creates a reader to add all the lines from the files to the fileLines list, except the one we want to delete
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            int currentFileLineNumber = 1;
            //as long as the line readed is not null
            while((line = reader.readLine()) != null){
                if(currentFileLineNumber != numberOfLineToDelete){
                    fileLines.add(line);
                }
                currentFileLineNumber++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for(String line : fileLines){
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void renameFile(File originalFile, String newName) {
        File renamedFile = new File(originalFile.getParent(), newName);
        if (originalFile.renameTo(renamedFile)) {
            System.out.println("Archivo renombrado a: " + renamedFile.getAbsolutePath());
        } else {
            System.out.println("Error renombrando el archivo");
        }
    }

    public static void safeRename(File originalFile, String newName){
        if (!originalFile.exists()) {
            System.out.println("El archivo original no existe");
            return;
        }

        File renamedFile = new File(originalFile.getParent(), newName);

        if (renamedFile.exists()) {
            System.out.println("El archivo con el nuevo nombre ya existe.");
            return;
        }

        try {
            Files.copy(originalFile.toPath(), renamedFile.toPath());
            System.out.println("Archivo copiado exitosamente a: " + renamedFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ocurrio un error al copiar el archivo: " + e.getMessage());
        }
    }

}
