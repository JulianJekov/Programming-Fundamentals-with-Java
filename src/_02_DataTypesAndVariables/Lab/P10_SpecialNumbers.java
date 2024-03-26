package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            int first = i % 10;
            int second = i / 10;
            int sum = first + second;

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}
