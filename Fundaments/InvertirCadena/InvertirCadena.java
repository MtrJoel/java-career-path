package Fundaments.InvertirCadena;

import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto : ");
        String userName = scanner.nextLine();
        String invertido = "";
        for(int i = userName.length() - 1; i>=0 ;i--){
            invertido += userName.charAt(i);
        }

        System.out.println("Texto invertido : " + invertido);

        scanner.close();
    }
}
