package POO.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Empleado> empleados = new ArrayList<>();
        Empleado e1 = new Empleado("Sawuel Monntero", 250, "Desarrollo");
        Empleado e2 = new Empleado("Joel Montero", 250, "QA");
        Empleado e3 = new Empleado("Saul Montero", 250, "Desarrollo");
        Empleado e4 = new Empleado("Liliana", 250, "QA");

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        for(Empleado emp : empleados){
            if(emp.getDepartamento().equalsIgnoreCase("QA")){
                System.out.println("Empleados de QA encotrados : " + emp.getNombre());
            }
        }

    }
} 
