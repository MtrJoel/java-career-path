package POO.Empleado;

public class Main {
    public static void main(String[] args){
        Empleado e1 = new Empleado("Joel Monntero", 250);
        e1.infoEmpleado();
        e1.aumentarSalario(0.5);
        System.out.println("Salario aumentado");
        System.out.println(e1.getSalario());
    }
} 
