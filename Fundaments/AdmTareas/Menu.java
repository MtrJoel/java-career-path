package Fundaments.AdmTareas;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void desplegarMenu(){ // * Metodo  para mostrar las opciones
        System.out.println("======SYSTEMA DE TAREAS======");
        System.out.println("1. Agregar tareas");
        System.out.println("2. Ver tareas");
        System.out.println("3. Salir del programa");
        
    }

    public int mensajesOpciones(String mensaje){
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public String leertexto(){
        scanner.nextLine();
        System.out.print("Ingrese la tarea : ");
        return scanner.nextLine();
    }
}
