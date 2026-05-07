package POO.CuentaTitular;

public class Titular {
    private String titular;
    private double saldo;

    public Titular(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void retirar(double monto){
        if(monto <= 0){
            System.out.println("Monto Invalido");
        } else if(monto > saldo){
            System.out.println("Saldo Insuficiente");
        } else {
            saldo -= monto;
        }
    }
    public void depositar(double monto){
        if(monto < 0 ){
            System.out.println("No Puedes hacer depositos menores a 1");
        } else if(monto == 0 ){
            System.out.println("No puedes depositar 0");
        } else {
            saldo += monto;
        }

    }

    public void infoCuenta(){
        System.out.println("titular : " + titular);
        System.out.println("Saldo disponible : " + saldo);
    }
}
