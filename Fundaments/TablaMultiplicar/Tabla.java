package Fundaments.TablaMultiplicar;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args){
        /**
         * 1. El usuario elige que tabla desea mostrar
         * 2. Se muestra la tabla seleccionada desde 1 hasta 12
         */

        Scanner scanner = new Scanner(System.in);
        int limiteTabla = 12; // * limite de la tabla
        System.out.print("Ingrese el numero de la tabla : ");
        int tabla = scanner.nextInt(); // * entrada de datos
        for(int i = 1; i <= limiteTabla; i++){

            System.out.format("%d * %d = %d \n",tabla, i, tabla * i);
        }
        
        scanner.close();
    }
}
