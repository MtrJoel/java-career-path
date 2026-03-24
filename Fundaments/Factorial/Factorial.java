package Fundaments.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero : ");
        int n = scanner.nextInt();
        int total = 1;
        for(int i = 1; i <= n; i++){
            total *= i;
            System.out.println(total);
        }
        scanner.close();
    }
}
