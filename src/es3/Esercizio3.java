package es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        // Continua a chiedere all'utente di inserire una stringa fino a quando non inserisce ":q"
        while (true) {
            System.out.print("Inserisci una stringa (':q' per terminare): ");
            input = scanner.nextLine();

            // Verifica se l'utente ha inserito ":q" per terminare il programma
            if (input.equals(":q")) {
                System.out.println("Programma terminato!!!!");
                break; // Esce dal ciclo
            }
            // Suddivide la stringa in caratteri e li stampa separati da virgola
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i < input.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }


}
