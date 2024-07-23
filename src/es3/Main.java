package es3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci una stringa");
            String stringa = scanner.nextLine();
            if (Objects.equals(stringa, ":q")) break;
            char[] arrayChar = stringa.toCharArray();
            System.out.println(Arrays.toString(arrayChar));
        }
    }
}