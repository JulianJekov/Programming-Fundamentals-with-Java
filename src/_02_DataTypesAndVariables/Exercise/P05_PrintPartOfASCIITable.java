package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asciiStart = Integer.parseInt(scanner.nextLine());
        int asciiEnd = Integer.parseInt(scanner.nextLine());

        for (int i = asciiStart; i <= asciiEnd; i++) {
            System.out.print((char) i + " ");
        }
    }
}
