package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int asciiSum = 0;
        for (int i = 1; i <= numbers; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);
            asciiSum += currentSymbol;

        }
        System.out.printf("The sum equals: %d", asciiSum);
    }
}
