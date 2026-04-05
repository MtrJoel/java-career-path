package POO.Productos;

public class Producto {
    private String nombreProducto;
    private double precioProducto;


    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setPrecioProducto(double precioProducto){
        this.precioProducto = precioProducto;
    }

    public double getPrecioProducto(){
        return precioProducto;
    }

    public Producto(String nombreProducto, double precioProducto){
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public void verInfo(){
        System.out.println("Nombre : " + nombreProducto);
        System.out.println("Precio : " + precioProducto);
    }
}
