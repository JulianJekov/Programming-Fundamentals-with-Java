package _04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(calculation(operator, firstNum, secondNum)));
    }

    public static double calculation(String operator, int first, int second) {
        double result = 0;
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;

            case "*":
                result = first * second;
                break;
            case "/":
                result = 1.0 * first / second;
                break;
        }

        return result;
    }
}
