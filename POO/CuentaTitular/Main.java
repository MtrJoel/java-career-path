package POO.CuentaTitular;

public class Main {
    public static void main(String[] args){
        Titular t1 = new Titular("Joel montero", 1200.255);

        t1.infoCuenta();
        t1.retirar(400);
        t1.infoCuenta();
        t1.depositar(5);
    }
}
