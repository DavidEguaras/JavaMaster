package cursoSerbatic.sesion3.Banco.tiposCuenta;

import cursoSerbatic.sesion3.Banco.Cuenta;
import cursoSerbatic.sesion3.Banco.tiposUsuario.Cliente;

public class CuentaVivienda extends Cuenta {

    private double pendienteHipoteca;


    public CuentaVivienda(Cliente cliente, int numeroCuenta, double saldoTotalCuenta, double pendienteHipoteca) {
        super(cliente, numeroCuenta, saldoTotalCuenta);
        this.pendienteHipoteca = pendienteHipoteca;
    }

    public double getPendienteHipoteca() {
        return pendienteHipoteca;
    }

    public void setPendienteHipoteca(double pendienteHipoteca) {
        this.pendienteHipoteca = pendienteHipoteca;
    }

    @Override
    public void visualizarSaldo() {
        System.out.println(getSaldoTotalCuenta() - pendienteHipoteca);
    }

    public void verRestoHipoteca(){
        System.out.println(pendienteHipoteca);
    }

    public void pagarImporteHipoteca(double importe){
        pendienteHipoteca =- importe;
        System.out.println("Pagado un importe a la hipoteca de "+importe);
    }
}
