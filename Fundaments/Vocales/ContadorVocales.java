package Fundaments.Vocales;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {

        String vocalesEncontradas = ""; // * Para guardar las vocales encontradas
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto : ");
        String fraseUsuario = scanner.nextLine(); // * Pide el texto a evaluar

        String fraseMinusculas = fraseUsuario.toLowerCase(); // * Convierte el texto a minusculas

        for(int i = 0; i < fraseMinusculas.length(); i++){
            char c = fraseMinusculas.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i'||c == 'o' || c == 'u' ){
                vocalesEncontradas += c;
                contador++;
            }
            
        }

        System.out.println("Numeros de vocales en el texto : " + contador);
        if(contador > 0){
            System.out.println("Las vocales fueron : " + vocalesEncontradas.substring(0, vocalesEncontradas.length()));
        } else {
            System.out.println("No hay vocales en tu texto");
        }
        
        scanner.close();
    }
}
