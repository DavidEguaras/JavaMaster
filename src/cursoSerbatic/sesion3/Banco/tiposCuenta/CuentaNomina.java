package cursoSerbatic.sesion3.Banco.tiposCuenta;

import cursoSerbatic.sesion3.Banco.Cuenta;
import cursoSerbatic.sesion3.Banco.tiposUsuario.Cliente;

public class CuentaNomina extends Cuenta {

    private final double COMISION = 0.0005; // 0.05% de comision

    public CuentaNomina(Cliente cliente, int numeroCuenta, double saldoTotalCuenta) {
        super(cliente, numeroCuenta, saldoTotalCuenta);
    }

    public void realizarTransferenciaConComision(Cuenta cuentaDestino, double cantidadTransferida) {
        double comision = cantidadTransferida * COMISION;
        double cantidadTotal = cantidadTransferida + comision;

        if (validarTransferencia(cantidadTotal)) {
            setSaldoTotalCuenta(getSaldoTotalCuenta() - comision);
            System.out.println("Se ha aplicado una comisión de " + comision + "$.");
            //llamamos al metodo de la clase padre
            super.realizarTransferencia(cuentaDestino, cantidadTransferida);
        }
    }
}
