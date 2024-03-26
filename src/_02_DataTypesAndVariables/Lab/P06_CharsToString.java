package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        String string = Character.toString(first) + (second) + (third);

        System.out.print(string);

    }
}
