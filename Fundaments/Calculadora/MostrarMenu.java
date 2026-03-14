package Fundaments.Calculadora;

import java.util.Scanner;

public class MostrarMenu {
    Scanner scanner = new Scanner(System.in);

    public int opcionesMenu(){
        System.out.println("===Calculadora===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");

        return scanner.nextInt();
    }

    public double leerMensaje(String mensaje){
        System.out.print(mensaje);

        return scanner.nextDouble();
    }
}
