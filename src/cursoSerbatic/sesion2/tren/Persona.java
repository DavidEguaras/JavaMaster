package cursoSerbatic.sesion2.tren;

public class Persona {
    //----------------------attributes and constructors-----------------------
    private static int personasCounter = 0;
    private int id;
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.id = personasCounter;
        this.nombre = nombre;
        this.apellidos = apellidos;
        personasCounter++;
    }
    //----------------------!attributes and constructors-----------------------


    //----------------------getters and setters-----------------------
    public static int getPersonasCounter() {
        return personasCounter;
    }

    public static void setPersonasCounter(int personasCounter) {
        Persona.personasCounter = personasCounter;
    }

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //----------------------!getters and setters-----------------------


}
