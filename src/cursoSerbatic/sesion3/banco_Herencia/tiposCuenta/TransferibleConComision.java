package cursoSerbatic.sesion3.banco_Herencia.tiposCuenta;

public interface TransferibleConComision {
    default void transferirConComision(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidadTransferida, double comsision) {
        if(cuentaOrigen.validarTransferencia(cantidadTransferida)){
            cuentaOrigen.setSaldoTotalCuenta(cuentaOrigen.getSaldoTotalCuenta() - cantidadTransferida);
            cuentaDestino.setSaldoTotalCuenta(cuentaDestino.getSaldoTotalCuenta() + cantidadTransferida);
            System.out.println("Se ha realizado la transferencia de " + cantidadTransferida + "$");
        }
    }
}
