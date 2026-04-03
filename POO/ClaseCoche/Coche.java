package POO.ClaseCoche;

public class Coche {
    private String marca;
    private String modelo;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }
    }

    public String getModelo(){
        return modelo;
    }

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
    }
}

