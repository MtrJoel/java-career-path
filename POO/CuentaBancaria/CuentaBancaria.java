package POO.CuentaBancaria;

public class CuentaBancaria {
    private double saldo; // ? Atributos 

    // ? Getter y Setters

    public double getSaldo(){
        return saldo;
    }

    // ? Metodos
    public void depositar(double monto){
        saldo += monto;
    }

    public void retirar(double monto){
        if(monto <= saldo){
            saldo -= monto;
        } else {
            System.out.println("Fondos Insuficientes " + saldo);
        }

    }

    public void cuentaInfo(){
        System.out.println("su saldo actual : " + saldo);
    }

    // ? Constructor
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

}
