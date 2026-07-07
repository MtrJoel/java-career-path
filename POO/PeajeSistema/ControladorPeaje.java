package POO.PeajeSistema;

import java.util.HashMap;
import java.util.Map;

public class ControladorPeaje {
    private Map<String, Vehiculo> mapaVehiculos = new HashMap<>();

    // * Metodo para agregar vehiculo al mapa
    public void registrarVehiculo(Vehiculo v){
        mapaVehiculos.put(v.getTagId(), v);
    }

    public void procesarPasos(String tagId, double costoPeaje) throws SaldoInsuficienteException{
        
        Vehiculo v = mapaVehiculos.get(tagId);

        if(v == null){
            System.out.println("Vehículo no registrado, barrera cerrada.");
            return;
        }

        if(v.getBalance() < costoPeaje){
            throw new SaldoInsuficienteException("El vehículo de : " + v.getPropietario() + " no tiene fondos suficientes. Balance actual : " + v.getBalance());
        }

        if(v.getBalance() >= costoPeaje){
            double nuevoBalance = v.getBalance() - costoPeaje;
            v.setNuevoBalance(nuevoBalance);
            System.out.println("¡Paso aprobado! Buen viaje : " + v.getPropietario() + " Balance actual : " + v.getBalance());
        }

    }  
}
