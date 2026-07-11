package POO.PeajeSistema;

public class tarjetaCredito implements MetodoPago{
    
    @Override
    public void procesarPagos(double monto) {
        System.out.println("Cobrando RD$ : " + monto + " a la tarjeta de crédito.");
    }
}
