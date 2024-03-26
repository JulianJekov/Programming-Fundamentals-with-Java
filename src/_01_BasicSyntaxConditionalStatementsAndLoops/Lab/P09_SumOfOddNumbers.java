package _01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= num * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("Sum: " + sum);

    }
}
