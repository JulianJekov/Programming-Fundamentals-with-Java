package _01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P10_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());


        while (true) {
            if (times >= 10) {
                break;
            }
            System.out.printf("%d X %d = %d%n", num, times, num * times);
            times++;
        }
        System.out.printf("%d X %d = %d%n", num, times, num * times);

    }
}
