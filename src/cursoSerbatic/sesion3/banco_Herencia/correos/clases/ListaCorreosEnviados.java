package cursoSerbatic.sesion3.banco_Herencia.correos.clases;

import java.util.ArrayList;

public class ListaCorreosEnviados{
    private ArrayList<Correo> correosEnviados;

    public ListaCorreosEnviados(ArrayList<Correo> correosEnviados) {
        this.correosEnviados = correosEnviados;
    }

    public ArrayList<Correo> getCorreosEnviados() {
        return correosEnviados;
    }

    public void setCorreosEnviados(ArrayList<Correo> correosEnviados) {
        this.correosEnviados = correosEnviados;
    }
}
