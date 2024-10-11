
package cursoSerbatic.sesion3.banco_Herencia.correos.clases;

import java.util.ArrayList;

public class ListaCorreos {
    private ArrayList<Correo> listaCorreos;

    public ListaCorreos() {
        this.listaCorreos = new ArrayList<Correo>();
    }

    public ArrayList<Correo> getListaCorreos() {
        return listaCorreos;
    }

    public void setListaCorreos(ArrayList<Correo> listaCorreos) {
        this.listaCorreos = listaCorreos;
    }

    public void agregarCorreo(Correo correo){
        listaCorreos.add(correo);
    }
}
