package cursoSerbatic.sesion10.personas;

public class Sanitario extends Persona {

    int numeroEmpleado;

    public Sanitario(int dni, boolean vacunado, int numeroEmpleado) {
        super(dni, vacunado);
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}
