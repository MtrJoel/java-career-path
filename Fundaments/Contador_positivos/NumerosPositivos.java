package Fundaments.Contador_positivos;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        int num;
        int contadorNegativos = 0;
        int[] numeros = new int[5];
        int[] negativos = new int[5];

        while (valor < numeros.length) {
            System.out.print("Ingresa un valor :");
            num = scanner.nextInt();
            numeros[valor] = num;
            if(num < 0){
                negativos[contadorNegativos] = num;
                contadorNegativos++;
            }
            valor++;
        }

        System.out.println("\nNumeros Guardados");
        
        valor = 0;
        
        while (valor < numeros.length) {
            System.out.println(numeros[valor]);
            valor++;
        }

        System.out.println("\nNumeros Negativos");
        
        int i = 0;
        
        while (i < contadorNegativos) {
            System.out.println(negativos[i]);
            i++;
        }

        System.out.println("El numero de negativos es de : " + contadorNegativos);
        scanner.close();
    }
}
