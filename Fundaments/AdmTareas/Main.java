package Fundaments.AdmTareas;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu(); // ! Instancia de la clase menu
        menu.desplegarMenu(); // ! Metodo desplegar de la clase menu

        Tareas services = new Tareas();
        boolean  isTrue = true;

        while (isTrue) {
            int opciones = menu.mensajesOpciones("Seleccione una operacion : ");
            switch (opciones) {
                case 1:
                    String tarea = menu.leertexto();
                    services.AgregarTareas(tarea);
                    break;
                case 2:
                    services.MostrarTareas();
                    break;
                case 3:
                    System.out.println("Saliendo......");
                    isTrue = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        
    }
}
