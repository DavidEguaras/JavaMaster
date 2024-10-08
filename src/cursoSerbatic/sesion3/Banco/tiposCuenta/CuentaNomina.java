package cursoSerbatic.sesion3.Banco.tiposCuenta;

import cursoSerbatic.sesion3.Banco.Cuenta;
import cursoSerbatic.sesion3.Banco.tiposUsuario.Cliente;

public class CuentaNomina extends Cuenta {

    private final double COMISION = 0.05;

    public CuentaNomina(Cliente cliente, int numeroCuenta, double saldoTotalCuenta) {
        super(cliente, numeroCuenta, saldoTotalCuenta);
    }

    @Override
    public void realizarIngreso(double cantidadIngresada) {
        if (cantidadIngresada > 1500) {
            double nuevoSaldo = (getSaldoTotalCuenta() + cantidadIngresada) * 0.01;
            setSaldoTotalCuenta(nuevoSaldo);
            System.out.println("Se ha aplicado un interés especial por el ingreso de más de 1500$. Nuevo saldo: " + nuevoSaldo + "$");
        } else {
            super.realizarIngreso(cantidadIngresada);
        }
    }

    public void realizarTransferenciaComisionNomina(Cuenta cuentaDestino, double cantidadTransferida){
        super.validarTransferencia(cantidadTransferida);
        setSaldoTotalCuenta(getSaldoTotalCuenta() - cantidadTransferida + cantidadTransferida * COMISION);
        cuentaDestino.setSaldoTotalCuenta(cuentaDestino.getSaldoTotalCuenta() + cantidadTransferida);
    }
}
