package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.DireccionCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreosEnviados;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreosRecibidos;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.EmisorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.ReceptorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

public class Empleado extends Usuario implements EmisorCorreo<Cliente>, ReceptorCorreo<Cliente> {

    private String username;
    private String password;
    private ListaCorreosRecibidos correosRecibidos;
    private ListaCorreosEnviados correosEnviados;


    public Empleado(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto, DireccionCorreo direccionCorreo, String username, String password, ListaCorreosRecibidos correosRecibidos, ListaCorreosEnviados correosEnviados) {
        super(DNI, nombre, apellido1, apellido2, direccion, contacto, direccionCorreo);
        this.username = username;
        this.password = password;
        this.correosRecibidos = correosRecibidos;
        this.correosEnviados = correosEnviados;
    }

    public ListaCorreosRecibidos getCorreosRecibidos() {
        return correosRecibidos;
    }

    public void setCorreosRecibidos(ListaCorreosRecibidos correosRecibidos) {
        this.correosRecibidos = correosRecibidos;
    }

    public ListaCorreosEnviados getCorreosEnviados() {
        return correosEnviados;
    }

    public void setCorreosEnviados(ListaCorreosEnviados correosEnviados) {
        this.correosEnviados = correosEnviados;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
