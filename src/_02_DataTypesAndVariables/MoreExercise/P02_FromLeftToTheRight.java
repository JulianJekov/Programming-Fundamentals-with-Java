package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            long first = Long.parseLong(scanner.next());
            long second = Long.parseLong(scanner.next());
            long sum = 0;
            if (first > second) {
                while (Math.abs(first) > 0) {
                    sum += Math.abs(first) % 10;
                    first /= 10;
                }
            } else {
                while (Math.abs(second) > 0) {
                    sum += Math.abs(second) % 10;
                    second /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}
