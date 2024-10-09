package cursoSerbatic.sesion3.banco_Herencia.tiposCuenta;

import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Cliente;

public class CuentaAhorro extends Cuenta {

    private final double COMISION = 0.01;
    private double[] historialComisiones;

    public CuentaAhorro(Cliente cliente, int numeroCuenta, int saldoTotalCuenta, double[] historialComisiones) {
        super(cliente, numeroCuenta, saldoTotalCuenta);
        this.historialComisiones = historialComisiones;
    }

    public double[] getHistorialComisiones() {
        return historialComisiones;
    }

    public void setHistorialComisiones(double[] historialComisiones) {
        this.historialComisiones = historialComisiones;
    }

    public void realizarTransferenciaComisionAhorro(Cuenta cuentaDestino, double cantidadTransferida, double comision) {
        super.validarTransferencia(cantidadTransferida);
        setSaldoTotalCuenta(getSaldoTotalCuenta() - cantidadTransferida + cantidadTransferida * COMISION);
        cuentaDestino.setSaldoTotalCuenta(cuentaDestino.getSaldoTotalCuenta() + cantidadTransferida);
    }

    public void verComisionesCobradas(){
        System.out.println("historial de comisiones pagadas por transferencias realizadas");
        for (int i = 0; i < historialComisiones.length; i++) {
            System.out.println(i);
        }
    }
}
