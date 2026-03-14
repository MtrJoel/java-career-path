package Fundaments.Calculadora;

public class Calculadora {
    public static void main(String[] args){
        /**
         * Este programa realiza las operaciones basicas de una calculadora
         * Se debe presentar un menu de opciones 
         * pedir dos numeros al usuario
         * mostrar resultado
        */

        MostrarMenu menu = new MostrarMenu();
        Operaciones cal = new Operaciones();
        int opciones = menu.opcionesMenu();

        if (opciones > 4 || opciones < 1) {
            System.out.println("Opciones validas solo van desde 1 hasta 4");
        } else {
            double a = menu.leerMensaje("Ingrese numerador : ");
            double b = menu.leerMensaje("Ingrese denominador : ");

            switch (opciones) {
            case 1:
                System.out.println( "Resultado suma : " + cal.sumar(a, b));
                break;
            case 2:
                System.out.println( "Resultado resta : " + cal.restar(a,b));
                break;
            case 3:
                System.out.println( "Resultado dividir : " + cal.dividir(a, b));
                break;
            case 4:
                System.out.println( "Resultado multiplicar : " + cal.multiplicar(a, b));
                break;
            default:
                System.out.println("Opcion no valida vuelva a ejecutar el programa");
                break;
            }
        }

    }
}
