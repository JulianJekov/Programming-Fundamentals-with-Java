package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isSpecialNumber = false;

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int currentNumber = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                isSpecialNumber = true;
            }
            System.out.printf("%d -> %b%n", currentNumber, isSpecialNumber);
            i = currentNumber;
        }
    }
}
