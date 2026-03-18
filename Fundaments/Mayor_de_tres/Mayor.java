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

        if(a > b && a > c){
            System.out.println("El mayor es a : " + a);
        } else if(b > a && b > c){
            System.out.println("El mayor es b : " + b);
        } else {
            System.out.println("El mayor es c : " + c);
        }
        scanner.close();
    }
}
