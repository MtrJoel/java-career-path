package Fundaments.Mayor_de_tres;

import java.util.Scanner;

public class Mayor {
    public static void main(String[] args){
        System.out.println("===Ingrese 3 numeros para saber cual es mayor===");

        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Ingrese un valor para A : ");
        a = scanner.nextInt();
        System.out.print("Ingrese un valor para B : ");
        b = scanner.nextInt();
        System.out.print("Ingrese un valor para C : ");
        c = scanner.nextInt();

        if(a == b && b == c){
            System.out.println("Todos los números son iguales : ");
            System.out.format("A = %d\nB = %d\nC = %d", a, b, c);
        } else if(a == b && a > c ){
            System.out.println("A y B son iguales");
        } else if(a == c && a > b){
            System.out.println("A y c son iguales");
        } else if(b == c && b > a){
            System.out.println("B y C son iguales");
        } else if(a > b && a > c){
            System.out.println("El mayor es A");
        } else if(b > a && b > c){
            System.out.println("B es mayor");
        } else {
            System.out.println("C es mayor");
        }
        scanner.close();
    }
}
