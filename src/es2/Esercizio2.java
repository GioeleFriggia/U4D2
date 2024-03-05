package es2;

import java.util.Scanner;

public class Esercizio2 {

    // Metodo per stampare il numero in lettere
    public static void stampaInLettere(int numero) {
        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("VALORE NON VALIDO. DEVE ESSERE COMPRESO TRA 0 E 3 !!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiede all'utente di inserire un numero compreso tra 0 e 3
        System.out.print("Inserisci un numero compreso tra 0 e 3: ");
        int numero = scanner.nextInt();

        // Chiama il metodo per stampare il numero in lettere
        stampaInLettere(numero);

        scanner.close();
    }
}
