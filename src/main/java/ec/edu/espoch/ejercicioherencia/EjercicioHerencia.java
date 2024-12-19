package ec.edu.espoch.ejercicioherencia;

// autor @Eddy
import ec.edu.espoch.ejercicioherencia.clases.CuentaAhorros;
import ec.edu.espoch.ejercicioherencia.clases.CuentaCorriente;

public class EjercicioHerencia {

    public static void main(String[] args) {

        //Cuenta ahorros
        System.out.println("CUENTA DE AHORROS");
        CuentaAhorros cuentaAhorros = new CuentaAhorros(true, 15000, 3.5f);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        System.out.println("...................................................");

        System.out.println("CUENTA CORRIENTE");
        //Cuenta Corriente
        CuentaCorriente cuentaCorriente = new CuentaCorriente(10000, 4.0f);
        cuentaCorriente.retirar(12000); // Activa sobregiro
        cuentaCorriente.consignar(5000); // Reduce sobregiro
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();

    }

}
