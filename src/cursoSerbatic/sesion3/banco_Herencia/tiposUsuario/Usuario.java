package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

public class Usuario {

    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Direccion direccion;
    private Contacto contacto;

    public Usuario(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.contacto = contacto;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}

