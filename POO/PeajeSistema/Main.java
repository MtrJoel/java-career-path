package POO.PeajeSistema;

public class Main {
    public static void main(String[] args) {
        ControladorPeaje controlOne = new ControladorPeaje();
        Vehiculo v1 = new Vehiculo("toyota-centra", "Joel Montero", 50.14);
        Vehiculo v2 = new Vehiculo("honda-civic", "Sawuel Montero", 54.45);

        controlOne.registrarVehiculo(v1);
        controlOne.registrarVehiculo(v2);

        try {
            controlOne.procesarPasos("toyota-centra", 25.15);
            controlOne.procesarPasos("honda-civic", 45);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        MetodoPago servicMetodoPago;
        servicMetodoPago = new tarjetaCredito();
        servicMetodoPago.procesarPagos(250);

        servicMetodoPago = new pagoEfectivo();
        servicMetodoPago.procesarPagos(100);
    }

}
