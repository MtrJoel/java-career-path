package POO.Estudiantes;

import java.util.ArrayList;

public class Notas {
    private String nombre;
    private ArrayList<Double> notas; // * Atributo para guardar las notas
    

    public Notas(){
        notas = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void agregarNotas(double nota){
        notas.add(nota);
    }

    public double calcularPromedio(){
        double notaFinal = 0;
        for(int i = 0; i < notas.size(); i++){
            notaFinal += notas.get(i);
        }
        return notaFinal == 0 ? 0.00 : notaFinal / notas.size();
    }

    public void mostrarInfo(){
        System.out.println("Nombre : " + nombre);
        System.out.format("Nota final %.2f: ", calcularPromedio());
    }

}
