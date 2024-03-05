public class Esercizio1 {

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // Testiamo i metodi con alcuni valori di esempio
        String str1 = "ciao";
        String str2 = "hello";
        String str3 = "buongiorno";

        int anno1 = 2020;
        int anno2 = 2021;
        int anno3 = 1900;
        int anno4 = 2000;
          int      anno5 = 1991;

        System.out.println("La stringa \"" + str1 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str1));
        System.out.println("La stringa \"" + str2 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str2));
        System.out.println("La stringa \"" + str3 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str3));

        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
        System.out.println("L'anno " + anno3 + " è bisestile? " + annoBisestile(anno3));
        System.out.println("L'anno " + anno4 + " è bisestile? " + annoBisestile(anno4));
        System.out.println("L'anno " + anno5 + " è bisestile? " + annoBisestile(anno5));
    }
}
