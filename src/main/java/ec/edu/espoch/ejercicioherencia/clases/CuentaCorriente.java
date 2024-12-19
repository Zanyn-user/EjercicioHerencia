package ec.edu.espoch.ejercicioherencia.clases;

public class CuentaCorriente extends CuentaBancaria {

    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (saldo >= cantidad) {
            super.retirar(cantidad);
        } else {
            sobregiro = sobregiro + (cantidad - saldo);
            saldo = 0;
            numRetiros++;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad = cantidad - sobregiro;
                sobregiro = 0;
            } else {
                sobregiro = sobregiro - cantidad;
                cantidad = 0;
            }
        }
        super.consignar(cantidad);
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }
    
    
    public void imprimir(){
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Comsion Mensual: " + comisionMensual);
        System.out.println("Numero de transacciones realizadas: "+(numConsignaciones+numRetiros));
        System.out.println("Valor de sobregiro: "+ sobregiro);
    }
    
    
    

}
