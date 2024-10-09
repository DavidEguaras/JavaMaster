package cursoSerbatic.sesion3.banco_Herencia.tiposUsuario;

import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Contacto;
import cursoSerbatic.sesion3.banco_Herencia.infoUsuarios.Direccion;

public class Cliente extends Usuario {
    private double saldoTotal;

    public Cliente(String DNI, String nombre, String apellido1, String apellido2, Direccion direccion, Contacto contacto, double saldoTotal) {
        super(DNI, nombre, apellido1, apellido2, direccion, contacto);
        this.saldoTotal = saldoTotal;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
