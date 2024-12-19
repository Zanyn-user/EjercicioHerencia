package ec.edu.espoch.ejercicioherencia.clases;

public class CuentaAhorros extends CuentaBancaria {

    private boolean activa;

    public CuentaAhorros(boolean activa, float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva");
        }
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual = comisionMensual + (numRetiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo >= 10000;
    }
    
    public void imprimir(){
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Comsion Mensual: " + comisionMensual);
        System.out.println("Numero de transacciones realizadas: "+(numConsignaciones+numRetiros));
    }
    

}
