package Fundaments.Par_o_Impar;

import java.util.Scanner;

public class IsEven {

    public static void main(String[] args){
        /**
         * Este programa valida si un programa es par o impar
         * Se declara una variable de tipo entero para guardar el dato ingresado por el usuario
         * Se debe usar el operador de modulo ( % ) para validar la condidicion
         * 
        */ 
        Scanner scanner = new Scanner(System.in); // ! Llamamos a la clase scanner para instanciarla luego
        System.out.print("\n Ingrese un numero para validar : ");

        int number = scanner.nextInt(); // * Guarda el dato ingresado por el usuario
        if(number % 2 == 0){
            System.out.format("%d es un número par ", number); // ? True
        } else {
            System.out.format("%d no es, un número par", number); // ? False
        }
        
        scanner.close(); // * Cierra el scanner
    }
}