package POO.Empleado;

public class Empleado {
    // * atributos
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(String nombre, double salario, String departamento){
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getDepartamento(){
        return departamento;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(double porcentaje) throws AumentoInvalidoException {
        if(porcentaje > 0.15){
            throw new AumentoInvalidoException("El aumento no puede ser mayor al 15%");
        }
        salario += salario * porcentaje;
    }

    
    public void infoEmpleado(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Salario : " + salario);
    }
}
