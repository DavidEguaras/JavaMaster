package cursoSerbatic.sesion6.Files;

import java.io.*;

import static cursoSerbatic.sesion6.Files.FileUtility.*;


public class Files {
    public static void main(String[] args) {
            File file = createFile("src/foo.txt");
            writeRandomLinesToFile(file, false);
            writeLineToFile("hemos modificado el fichero", file, true);
            deleteLineFromFile(3, file);
            safeRename(file, "renamed");
    }

}
