package POO.PeajeSistema;

public class Vehiculo {
    private String tagId;
    private String propietario;
    private double balance;

    public Vehiculo(String tagId, String propietario, double balance){
        this.tagId = tagId;
        this.propietario = propietario;
        this.balance = balance;
    }

    // * Getters and setters
    public String getTagId(){ // ! devuelve el tagId del vehiculo
        return tagId; 
    }

    public double getBalance(){ // ! devuelve el balance actual del propietario
        return balance;
    }

    public String getPropietario(){ // ! devuelve el propietario del vehiculo
        return propietario;
    }

    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

    public void setNuevoBalance(double monto){
        this.balance = monto;
    }

    // * Metodo recargar balance 
    public double recargarBalance(double monto){
        return balance += monto;
    }
}
