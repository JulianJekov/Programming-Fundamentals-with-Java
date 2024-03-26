package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.###").format(calculate(number1, operator, number2)));

    }

    public static double calculate(int number1, String operator, int number2) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = 1.0 * number1 / number2;
                break;
        }

        return result;
    }
}
