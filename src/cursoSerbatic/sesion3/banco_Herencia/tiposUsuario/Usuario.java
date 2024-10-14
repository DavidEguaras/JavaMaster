package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.DireccionCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreos;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

import java.util.ArrayList;

public abstract class Usuario {

    //-----------------------atributos & constructores-----------------------
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Direccion direccion;
    private Contacto contacto;
    private DireccionCorreo direccionCorreo;

    public Usuario(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto, DireccionCorreo direccionCorreo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.contacto = contacto;
        this.direccionCorreo = direccionCorreo;
    }
    //-----------------------!atributos & constructores-----------------------


    //-----------------------metodos de correos-----------------------
    //en las clases hijas donde estas condiciones sean diferentes(en base a las interfaces que implementen, realizaremos override
    public boolean puedeEnviarCorreo(){
        return false;
    }

    public boolean puedeRecibirCorreo(){
        return false;
    }

    public ListaCorreos getCorreosEnviados(){
        return null;
    }

    public ListaCorreos getCorreosRecibidos(){
        return null;
    }
    //-----------------------metodos de correos-----------------------


    //-----------------------getters & setters-----------------------
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

    public DireccionCorreo getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(DireccionCorreo direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    //-----------------------getters & setters-----------------------




}

