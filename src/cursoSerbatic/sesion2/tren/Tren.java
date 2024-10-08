package cursoSerbatic.sesion2.tren;


import java.util.Arrays;

public class Tren {
//----------------------attributes and constructors-----------------------
    //--------static
    private static int trenCounter = 0;
    //--------!static

    private int id;
    private String nombre;
    private String lugarSalida;
    private String lugarDestino;
    private Vagon[] vagones;


    public Tren(String nombre, String lugarSalida, String lugarDestino) {
        this.id = trenCounter;
        this.nombre = nombre;
        this.lugarSalida = lugarSalida;
        this.lugarDestino = lugarDestino;
        this.vagones = new Vagon[3];
        for (int i = 0; i < vagones.length; i++) {
            vagones[i] = new Vagon(); // Creamos cada vagon, ya que aunque se este reservando el espacio tendrian un valor de null si no los inicializamos
        }
        trenCounter++;
    }
//----------------------!attributes and constructors-----------------------



    //----------------------getters and setters-----------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Vagon[] getVagones() {
        return vagones;
    }
    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }
    public static int getTrenCounter() {
        return trenCounter;
    }
    public static void setTrenCounter(int trenCounter) {
        Tren.trenCounter = trenCounter;
    }
    public String getLugarSalida() {
        return lugarSalida;
    }
    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }
    public String getLugarDestino() {
        return lugarDestino;
    }
    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }
//----------------------!getters and setters-----------------------


//----------------------methods----------------------
    //--------private
    private static void imprimirTicket(int numeroVagon, Persona persona, int numeroFila, int numeroColumna){
        System.out.println("----------Ticket de " + persona.getNombre() +"----------");
        System.out.println("Identificador de pasajero: " +persona.getId());
        System.out.println("Nombre completo: " +persona.getApellidos() +", " +persona.getNombre());
        System.out.println("--informacion de asiento--");
        System.out.println("Vagón: " + numeroVagon);
        System.out.println("Asiento: C"+numeroColumna + " F" +numeroFila);
        System.out.println("------------------------------------");
    }
    //--------!private

    //--------public
    public void imprimirPlazasTren(){
        for (int i = 0; i < vagones.length; i++) {
            System.out.println("Vagon " + (i + 1) + ":");
            vagones[i].imprimirPlazasVagon();
            System.out.println();
        }
    }

    public void reservarPlazaEspecifica(int numeroVagon, Persona persona, int numeroFila, int numeroColumna){

        // Validar que el número de vagon, fila y columna estén dentro de los limites
        if (numeroVagon < 1 || numeroVagon > vagones.length) {
            System.out.println("Número de vagón no válido.");
            return;
        }

        if (numeroFila < 0 || numeroFila >= 16 || numeroColumna < 0 || numeroColumna >= 4) {
            System.out.println("Número de fila o columna no válido.");
            return;
        }

        // Seleccionar el vagon correcto
        Vagon vagonSeleccionado = vagones[numeroVagon - 1];
        Persona[][] plazasVagonSeleccionado = vagonSeleccionado.getPlazas();

        // Verificar si la plaza esta libre
        if (plazasVagonSeleccionado[numeroFila][numeroColumna] == null) {
            System.out.println("✅Su reserva ha sido realizada correctamente✅, imprimiendo ticket...");
            plazasVagonSeleccionado[numeroFila][numeroColumna] = persona;
            imprimirTicket(numeroVagon, persona, numeroFila, numeroColumna);
        } else {
            System.out.println("La reserva no se ha podido realizar, esa plaza ya está ocupada.");
        }

    }


    public void reservarPlazaAutomaticamente(int numeroVagon, Persona persona) {

        if (numeroVagon < 1 || numeroVagon > vagones.length) {
            System.out.println("Número de vagón no válido.");
            return;
        }


        Vagon vagonSeleccionado = vagones[numeroVagon - 1];
        Persona[][] plazasVagonDisponible = vagonSeleccionado.getPlazas();


        for (int fila = 0; fila < plazasVagonDisponible.length; fila++) {
            for (int columna = 0; columna < plazasVagonDisponible[fila].length; columna++) {
                if (plazasVagonDisponible[fila][columna] == null) {
                    plazasVagonDisponible[fila][columna] = persona;
                    System.out.println("✅Su reserva ha sido realizada correctamente✅, imprimiendo ticket...");
                    imprimirTicket(numeroVagon, persona, fila, columna);
                    return;
                }
            }
        }

        System.out.println("No hay plazas disponibles en el vagón " + numeroVagon + ".");
    }

    @Override
    public String toString() {
        return "Tren{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarDestino='" + lugarDestino + '\'' +
                ", vagones=" + Arrays.toString(vagones) +
                '}';
    }
//--------!public
//----------------------!methods----------------------


}
