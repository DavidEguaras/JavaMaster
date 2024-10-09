package cursoSerbatic.sesion3.banco_Herencia.infoUsuarios;

public class Contacto {

    String [] direccionesMail;
    int[] numerosTelefono;

    public Contacto(String[] direccionesMail, int[] numerosTelefono) {
        this.direccionesMail = direccionesMail;
        this.numerosTelefono = numerosTelefono;
    }

    public String[] getDireccionesMail() {
        return direccionesMail;
    }

    public void setDireccionesMail(String[] direccionesMail) {
        this.direccionesMail = direccionesMail;
    }

    public int[] getNumerosTelefono() {
        return numerosTelefono;
    }

    public void setNumerosTelefono(int[] numerosTelefono) {
        this.numerosTelefono = numerosTelefono;
    }
}

