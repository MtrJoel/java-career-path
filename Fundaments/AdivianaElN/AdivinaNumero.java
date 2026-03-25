package Fundaments.AdivianaElN;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alertorio = (int) (Math.random() * 10) + 1;

        System.out.print("Adivina el numero ( entre 10 y 1 ): ");
        int n = scanner.nextInt();
        System.out.println(alertorio);

        while (alertorio != n) {
            System.out.print("Intenta otra vez : ");
            n = scanner.nextInt();

        }
        System.out.println("adivinaste : " + n);

        scanner.close();
    }
}
