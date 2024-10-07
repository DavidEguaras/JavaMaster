package cursoSerbatic.Sesion2.tren;

public class Vagon {
    private static int vagonCounter = 0;
    private int id;
    private Persona[][] plazas;


    //---------------------constructors------------------------
    public Vagon() {
        this.id = vagonCounter;
        this.plazas = new Persona[16][4];
        vagonCounter++;
    }
    //---------------------!constructors------------------------



    //-----------------------getters and setters-----------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Persona[][] getPlazas() {
        return plazas;
    }
    public void setPlazas(Persona[][] plazas) {
        this.plazas = plazas;
    }
    //!----------------------getters and setters-----------------------



    public void imprimirPlazasVagon() {
        System.out.println("");
        // Indicamos las columnas de la tabla
        for (int col = 0; col < plazas[0].length; col++) {
            System.out.print(" "+" C" + col + " ");
        }
        System.out.println();

        System.out.println("   +---+---+---+---+");

        // Iteramos las filas del vagon
        for (int i = 0; i < plazas.length; i++) {
            //Indicamos la fila de la tabla
            System.out.print("F" + i + " |");

            //Iteramos las columnas
            for (int j = 0; j < plazas[i].length; j++) {
                // Si la plaza esta libre
                if (plazas[i][j] != null) {
                    System.out.print(" L |");
                } else {
                    System.out.print(" O |");
                }
            }
            System.out.println();
            System.out.println("   +---+---+---+---+"); // Separador de filas
        }
    }

    public boolean comprobarDisponibilidadVagon (){
        boolean plazaDisponible = false;
        for(int i = 0; i < plazas.length; i++){
            for(int j = 0; i < plazas.length; i++){

            }
        }

        return plazaDisponible;
    }
}
