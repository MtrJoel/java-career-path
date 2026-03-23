package Fundaments.Suma_N;

import java.util.Scanner;

public class SumaN {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Ingrese un valor : ");
        int numeros = scanner.nextInt();
        int total = 0;
        for(int i = 1; i <= numeros; i++){
            total += i;
            
        }
        System.out.println("Total : " + total);
        scanner.close();
    }
}
