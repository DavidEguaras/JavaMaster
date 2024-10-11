package cursoSerbatic.sesion3.banco_Herencia.correos.clases;

import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.EmisorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public class Correo {
    private DireccionCorreo direccionCorreoEmisor;
    private DireccionCorreo direccionCorreoReceptor;
    private String asunto;
    private String mensaje;
    private boolean leido;

    public Correo(Usuario usuarioEmisor, Usuario usuarioReceptor, String asunto, String mensaje, boolean leido) {
        this.direccionCorreoEmisor = usuarioEmisor.getDireccionCorreo();
        this.direccionCorreoReceptor = usuarioReceptor.getDireccionCorreo();
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.leido = leido;
    }

    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public boolean isLeido() {
        return leido;
    }
    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    public DireccionCorreo getDireccionCorreoEmisor() {
        return direccionCorreoEmisor;
    }
    public void setDireccionCorreoEmisor(DireccionCorreo direccionCorreoEmisor) {
        this.direccionCorreoEmisor = direccionCorreoEmisor;
    }
    public DireccionCorreo getDireccionCorreoReceptor() {
        return direccionCorreoReceptor;
    }
    public void setDireccionCorreoReceptor(DireccionCorreo direccionCorreoReceptor) {
        this.direccionCorreoReceptor = direccionCorreoReceptor;
    }

}
