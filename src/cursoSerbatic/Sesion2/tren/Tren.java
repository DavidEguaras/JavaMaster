package cursoSerbatic.Sesion2.tren;

public class Tren {
    private static int trenCounter = 0;
    private static int plazasVendidas = 0;
    private int id;
    private String nombre;
    private Vagon[] vagones;


    public Tren(String nombre) {
        this.id = trenCounter;
        this.nombre = nombre;
        this.vagones = new Vagon[3];
        for (int i = 0; i < vagones.length; i++) {
            vagones[i] = new Vagon(); // Creamos cada vagon, ya que aunque se este reservando el espacio tendrian un valor de null si no los inicializamos
        }
        trenCounter++;
    }



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
    //----------------------!!getters and setters-----------------------



    //----------------------methods----------------------

    //--------private
    private static void imprimirTicket(Vagon vagonSeleccionado, Persona persona, int numeroFila, int numeroColumna){
        System.out.println("----------Ticket de " + persona.getNombre() +"----------");
        System.out.println("Identificador de pasajero: " +persona.getId());
        System.out.println("Nombre completo: " +persona.getApellidos() +" ," +persona.getNombre());
        System.out.println("--informacion de asiento--");
        System.out.println("Vagón: " + vagonSeleccionado.toString());
        System.out.println("Asiento: C"+numeroColumna + " F" +numeroFila);
        System.out.println("----------------------------------------");
    }
    //--------!!private


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
            System.out.println("Su reserva ha sido realizada correctamente, imprimiendo ticket...");
            plazasVagonSeleccionado[numeroFila][numeroColumna] = persona;
            imprimirTicket(vagonSeleccionado, persona, numeroFila, numeroColumna);
        } else {
            System.out.println("La reserva no se ha podido realizar, esa plaza ya está ocupada.");
        }

    }

    public void resevarPlazaAutomaticamente(int numeroVagon){

    }
    //--------!!public


    //----------------------methods----------------------


}
