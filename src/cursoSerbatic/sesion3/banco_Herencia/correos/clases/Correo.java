package cursoSerbatic.sesion3.banco_Herencia.correos.clases;

import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.EmisorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public class Correo {
    private DireccionCorreo direccionCorreoDestino;
    private DireccionCorreo direccionCorreoOrigen;
    private String contenido;
    private boolean leido;

    public Correo(Usuario usuarioReceptor, Usuario usuarioEmisor, String contenido, boolean leido) {
        this.direccionCorreoDestino = usuarioReceptor.getDireccionCorreo();
        this.direccionCorreoOrigen = usuarioEmisor.getDireccionCorreo();
        this.contenido = contenido;
        this.leido = leido;
    }

    public DireccionCorreo getDireccionCorreoDestino() {
        return direccionCorreoDestino;
    }

    public void setDireccionCorreoDestino(DireccionCorreo direccionCorreoDestino) {
        this.direccionCorreoDestino = direccionCorreoDestino;
    }

    public DireccionCorreo getDireccionCorreoOrigen() {
        return direccionCorreoOrigen;
    }

    public void setDireccionCorreoOrigen(DireccionCorreo direccionCorreoOrigen) {
        this.direccionCorreoOrigen = direccionCorreoOrigen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
