package Fundaments.Promedio;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args){
        /** 
         * Este programa toma 3 notas y muestra el promedio
         * */ 

        Scanner scanner = new Scanner(System.in);
        double oneNotes, secondNotes, threeNotes;
        System.out.println("====Avarage Notes====");
        System.out.print("Ingrese su primera nota : ");
        oneNotes = scanner.nextDouble();
        System.out.print("Ingrese su segunda nota : ");
        secondNotes = scanner.nextDouble();
        System.out.print("Ingrese su tercera nota : ");
        threeNotes = scanner.nextDouble();


        double total = (oneNotes + secondNotes + threeNotes) / 3;

        if(total >= 90){
            System.out.format("Excelente su nota es de : %.2f", total);
        } else if(total >= 70){
            System.out.format("Promovido su nota es de : %.2f", total);
        } else {
            System.out.format("Repitente su nota es de : %.2f", total);
        }
        
    }
}
