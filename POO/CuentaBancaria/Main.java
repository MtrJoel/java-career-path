package POO.CuentaBancaria;

public class Main {
    public static void main(String[] args){
        CuentaBancaria cb1 = new CuentaBancaria(1005.45);
        cb1.cuentaInfo();

        cb1.retirar(500.45);
        cb1.cuentaInfo(); // * Accede a la informacion de la cuenta
        
    }
}
