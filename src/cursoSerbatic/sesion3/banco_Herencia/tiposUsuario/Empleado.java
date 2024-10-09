package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

public class Empleado extends Usuario {

    private String username;
    private String password;


    public Empleado(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto) {
        super(DNI, nombre, apellido1, apellido2, direccion, contacto);
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
