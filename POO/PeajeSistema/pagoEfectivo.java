package POO.PeajeSistema;

public class pagoEfectivo implements MetodoPago{
    @Override
    public void procesarPagos(double monto){
        System.out.println("Recibiendo RD$: " + monto + " en efectivo en cabina.");
    }
}
