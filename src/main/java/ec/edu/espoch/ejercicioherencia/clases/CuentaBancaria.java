
package ec.edu.espoch.ejercicioherencia.clases;


public class CuentaBancaria {
    
    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    //Constructor
    public CuentaBancaria(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad){
        saldo = cantidad + saldo;
        numConsignaciones++; 
    }
    
    public void retirar(float cantidad){
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            numRetiros++;
        } else {
            System.out.println("Saldo insuficiente");
        }  
    }
    
    public void calcularInteresMensual(){
        float interesMensual = (tasaAnual/12)*saldo/100;
        saldo = saldo + interesMensual;
    }
    
    public void extractoMensual(){
        saldo = saldo - comisionMensual;
        calcularInteresMensual();
        comisionMensual = 0;
    }

     public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Consignaciones: " + numConsignaciones);
        System.out.println("Retiros: " + numRetiros);
         System.out.println("Tasa Anual: "+ tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }
    
    
}
