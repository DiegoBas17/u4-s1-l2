package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un testo e ti diro se è pari o disparo");
        String stringa = scanner.nextLine();
        System.out.println("Il numero dei caratteri inserita è pari? " + stringaPariDispari(stringa));

        System.out.println("Inserisci un anno per sapere se bisestile");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println("L'anno inserito è Bisestile? " + bisestile(anno));
    }

    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean bisestile(int anno) {
        return anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0;
    }
}