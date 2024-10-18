package cursoSerbatic.sesion10.personas;

public class Persona {

    private int dni;
    private boolean vacunado;

    public Persona(int dni, boolean vacunado) {
        this.dni = dni;
        this.vacunado = vacunado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}
