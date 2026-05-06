package POO.Empleado;

public class Empleado {
    // * atributos
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(double porcentaje){
        salario += salario * porcentaje;
    }

    
    public void infoEmpleado(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Salario : " + salario);
    }
}
