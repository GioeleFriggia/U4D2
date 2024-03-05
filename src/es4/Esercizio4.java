package es4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Richiedo all'utente di inserire un numero intero
            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt();

            // Stampo il conto alla rovescia a partire dal numero inserito fino a zero
            System.out.println("Conto alla rovescia:");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        } catch (InputMismatchException e) {
            // Gestisco l'eccezione nel caso in cui l'utente inserisca un "input" non valido
            System.out.println("Input non valido. Assicurati di inserire un numero intero.");
        }

        scanner.close();
    }
}
