package cursoSerbatic.sesion2.arrays;

public class Vagon {
//----------------------attributes and constructors-----------------------
    //--------static
    private static int vagonCounter = 0;
    //--------static
    private int id;
    private cursoSerbatic.sesion2.arrays.Persona[][] plazas;

    public Vagon() {
        this.id = vagonCounter;
        this.plazas = new cursoSerbatic.sesion2.arrays.Persona[16][4];
        vagonCounter++;
    }
//----------------------!attributes and constructors-----------------------


//-----------------------getters and setters-----------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public cursoSerbatic.sesion2.arrays.Persona[][] getPlazas() {
        return plazas;
    }
    public void setPlazas(Persona[][] plazas) {
        this.plazas = plazas;
    }
//!----------------------getters and setters-----------------------


//----------------------methods----------------------
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
                // Si la plaza no esta libre
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
        for(int i = 0; i < plazas.length; i++){
            for(int j = 0; j < plazas[i].length; j++){
                if(plazas[i][j] == null){
                    return true;
                }
            }
        }
        return false;
    }
//----------------------!methods----------------------

}
