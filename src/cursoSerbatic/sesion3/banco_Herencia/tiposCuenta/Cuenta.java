package cursoSerbatic.sesion3.banco_Herencia.tiposCuenta;

import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Cliente;

public class Cuenta implements Transferible {

    //--------------------atributos y constructores--------------------
    private String dniCliente;
    private int numeroCuenta;
    private double saldoTotalCuenta;

    public Cuenta(Cliente cliente, int numeroCuenta, double saldoTotalCuenta) {
        this.dniCliente = cliente.getDNI();
        this.numeroCuenta = numeroCuenta;
        this.saldoTotalCuenta = saldoTotalCuenta;
    }
    //--------------------atributos y constructores--------------------


    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoTotalCuenta() {
        return saldoTotalCuenta;
    }

    public void setSaldoTotalCuenta(double saldoTotalCuenta) {
        this.saldoTotalCuenta = saldoTotalCuenta;
    }



    public void visualizarSaldo(){
        System.out.println(saldoTotalCuenta);
    }

    public void realizarIngreso(double cantidadIngresada) {
        saldoTotalCuenta += cantidadIngresada;
        System.out.println("Se ha realizado el ingreso de " + cantidadIngresada + "$");
    }


    public void realizarTransferencia(Cuenta cuentaDestino, double cantidadTransferida){
        this.transferir(this, cuentaDestino, cantidadTransferida);

    }

    public boolean validarTransferencia(double cantidadTransferida) {
        if (cantidadTransferida <= 0) {
            System.out.println("La cantidad a transferir debe ser mayor a cero");
            return false;
        }
        else if (cantidadTransferida > saldoTotalCuenta) {
            System.out.println("No tienes suficiente saldo para realizar la transferencia");
            return false;
        }else{
            return true;
        }
    }

}
