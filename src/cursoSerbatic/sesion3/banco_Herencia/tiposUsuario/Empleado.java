package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.DireccionCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreos;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.EmisorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.ReceptorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;


public class Empleado extends Usuario implements EmisorCorreo<Cliente>, ReceptorCorreo<Cliente> {


    //---------------------------atributos y constructores---------------------------
    private String username;
    private String password;

    //en base a las interfaces implementadas
    private ListaCorreos correosEnviados;
    private ListaCorreos correosRecibidos;

    public Empleado(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto, DireccionCorreo direccionCorreo, String username, String password) {
        super(DNI, nombre, apellido1, apellido2, direccion, contacto, direccionCorreo);
        this.username = username;
        this.password = password;
        //en base a las interfaces implementadas
        this.correosEnviados = new ListaCorreos();
        this.correosRecibidos = new ListaCorreos();
    }
    //---------------------------atributos y constructores---------------------------


    //---------------------------metodos correo---------------------------
    //cambiar en base a las interfaces implementadas
    @Override
    public boolean puedeEnviarCorreo(){
        return true;
    }
    @Override
    public boolean puedeRecibirCorreo(){
        return true;
    }
    @Override
    public ListaCorreos getCorreosEnviados(){
        return correosEnviados;
    }
    @Override
    public ListaCorreos getCorreosRecibidos(){
        return correosRecibidos;
    }


    //metodo interfaz
    public boolean enviarCorreo(){
        //implementar Scanner para leer el asunto y el mensaje y el receptor
        String asunto = "";
        String mensaje = "";
        Usuario usuarioReceptor = null;
        return enviarCorreo(this, correosEnviados, asunto, mensaje, usuarioReceptor);
    }
    //---------------------------metodos correo---------------------------


    //---------------------------getters & setters---------------------------
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
    //---------------------------getters & setters---------------------------
}
