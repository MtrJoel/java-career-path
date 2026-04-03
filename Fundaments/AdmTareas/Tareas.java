package Fundaments.AdmTareas;

import java.util.ArrayList;

public class Tareas {
    private ArrayList<String> tareas;

    public Tareas(){
        tareas = new ArrayList<>();
    }

    public void AgregarTareas(String tarea){
        tareas.add(tarea);
    }

    public void MostrarTareas(){
        if(tareas.isEmpty()){
            System.out.println("No hay tareas registradas");
            return;
        }

        System.out.println("\nTareas Registradas :");
        for(int i = 0; i < tareas.size(); i++){
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }
}
