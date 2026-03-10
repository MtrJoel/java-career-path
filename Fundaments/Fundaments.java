package Fundaments;

import java.util.Scanner;

public class Fundaments {
    public static void main(String[] args){
        /**
         * Vamos a crear un programa que :
         * Guarde tu nombre
         * Guarde tu edad
         * Si eres mayor de edad, diga que eres mayor por consola
        
        */

        Scanner scanner = new Scanner(System.in); // * Permite recibir datos por consola
        System.out.println("Bienvenido...");
        System.out.print("Como podemos llamarte : ");
        String name =  scanner.nextLine(); // * Recibe el nombre
        System.out.print("Ingrese su edad : ");
        int age = scanner.nextInt(); // * Recibe la edada del usuario

        if(age >= 18){
            System.out.println(name + " eres mayor de edad");
        } else {
            System.out.println(name + " no eres mayor de edad");
        }

        scanner.close(); // * Cierra el scanner
    }
    
}