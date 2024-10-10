package cursoSerbatic.sesion3.banco_Herencia.correos.clases;

import java.util.ArrayList;

public class ListaCorreosRecibidos {
    private ArrayList<Correo> correosRecibidos;

    public ListaCorreosRecibidos(ArrayList<Correo> correosRecibidos) {
        this.correosRecibidos = correosRecibidos;
    }

    public ArrayList<Correo> getCorreosRecibidos() {
        return correosRecibidos;
    }
    public void setCorreosRecibidos(ArrayList<Correo> correosRecibidos) {
        this.correosRecibidos = correosRecibidos;
    }
}
