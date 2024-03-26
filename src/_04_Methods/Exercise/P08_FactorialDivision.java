package _04_Methods.Exercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = numberFactorial(number1);
        long fact2 = numberFactorial(number2);

        double divisionFactorials = 1.0 * fact1 / fact2;
        System.out.printf("%.2f", divisionFactorials);

    }

    public static long numberFactorial(int number) {

        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
