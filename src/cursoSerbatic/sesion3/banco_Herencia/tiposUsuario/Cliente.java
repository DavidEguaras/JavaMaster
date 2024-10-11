package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.DireccionCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreos;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.EmisorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.correos.interfaces.ReceptorCorreo;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

public class Cliente extends Usuario implements EmisorCorreo<Cliente>, ReceptorCorreo<Cliente> {
    private double saldoTotal;
    private ListaCorreos listaCorreosEnviados;
    private ListaCorreos listaCorreosRecibidos;

    public Cliente(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto, DireccionCorreo direccionCorreo, double saldoTotal, ListaCorreos listaCorreosEnviados, ListaCorreos listaCorreosRecibidos) {
        super(DNI, nombre, apellido1, apellido2, direccion, contacto, direccionCorreo);
        this.saldoTotal = saldoTotal;
        this.listaCorreosEnviados = listaCorreosEnviados;
        this.listaCorreosRecibidos = listaCorreosRecibidos;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }


}
