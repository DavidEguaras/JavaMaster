package cursoSerbatic.Sesion2.tren;

import java.util.Scanner;

public class AppTren {
    public static void main(String[] args) {
        Tren aveMadrid = new Tren("Ave a Madrid");
        Tren[] trenes = {aveMadrid};


        aveMadrid.imprimirPlazasTren();
        Scanner scanner = new Scanner(System.in);

    }
}
