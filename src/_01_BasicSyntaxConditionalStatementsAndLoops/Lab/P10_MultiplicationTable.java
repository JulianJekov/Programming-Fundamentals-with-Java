package _01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int times = 1;

        while (times <= 10) {

            int product = n * times;

            System.out.printf("%d X %d = %d%n", n, times, product);

            times++;
        }

    }
}
