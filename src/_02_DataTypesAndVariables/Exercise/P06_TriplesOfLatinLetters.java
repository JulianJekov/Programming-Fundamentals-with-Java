package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num - 1; i++) {
            char firstChar = (char) ('a' + i);

            for (int j = 0; j <= num - 1; j++) {
                char secondChar = (char) ('a' + j);

                for (int k = 0; k <= num - 1; k++) {

                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}