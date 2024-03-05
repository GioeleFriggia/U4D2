public class Esercizio1 {

    // Metodo per determinare se la lunghezza della stringa è pari o dispari
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0; // Restituisce true se la lunghezza della stringa è pari, altrimenti false
    }

    // Metodo per determinare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        // Un anno è bisestile se è divisibile per 4, eccetto quelli divisibili per 100 che non sono divisibili per 400
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0))
            return true; // Restituisce true se l'anno è bisestile
        else
            return false; // Restituisce false se l'anno non è bisestile
    }

    public static void main(String[] args) {
        // Testiamo i metodi con alcuni valori di esempio

//         Stringhe di esempio
       String str1 = "ciao";
       String str2 = "hello";
        String str3 = "buongiorno";

        // Anni di esempio
        int anno1 = 2020;
        int anno2 = 2021;
        int anno3 = 1900;
        int anno4 = 2000;
        int anno5 = 1991;

        // Stampa il risultato del metodo stringaPariDispari per le stringhe di esempio
        System.out.println("La stringa \"" + str1 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str1));
        System.out.println("La stringa \"" + str2 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str2));
        System.out.println("La stringa \"" + str3 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str3));

        // Stampa il risultato del metodo annoBisestile per gli anni di esempio
        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
        System.out.println("L'anno " + anno3 + " è bisestile? " + annoBisestile(anno3));
        System.out.println("L'anno " + anno4 + " è bisestile? " + annoBisestile(anno4));
        System.out.println("L'anno " + anno5 + " è bisestile? " + annoBisestile(anno5));
    }
}
