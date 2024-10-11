package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.DireccionCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreos;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.EmisorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.ReceptorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

public class Cliente extends Usuario implements EmisorCorreo<Cliente>, ReceptorCorreo<Cliente> {

    //---------------------------atributos & constructores---------------------------
    private double saldoTotal;
    //en base a las interfaces implementadas
    private ListaCorreos correosEnviados;
    private ListaCorreos correosRecibidos;

    public Cliente(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto, DireccionCorreo direccionCorreo, double saldoTotal) {
        super(DNI, nombre, apellido1, apellido2, direccion, contacto, direccionCorreo);
        this.saldoTotal = saldoTotal;
        //en base a las interfaces implementadas
        this.correosEnviados = new ListaCorreos();
        this.correosRecibidos = new ListaCorreos();
    }
    //---------------------------atributos & constructores---------------------------


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
    //---------------------------metodos correo---------------------------


    //---------------------------getters & setters---------------------------
    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    //---------------------------getters & setters---------------------------


}
