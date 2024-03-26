package _01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (group.equals("Students")) {
            if (day.equals("Friday")) {
                price += num * 8.45;
            } else if (day.equals("Saturday")) {
                price += num * 9.80;
            } else if (day.equals("Sunday")) {
                price += num * 10.46;
            }
            if (num >= 30) {
                price *= 0.85;
            }
        } else if (group.equals("Business")) {
            if (num >= 100) {
                num -= 10;
            }
            if (day.equals("Friday")) {
                price += num * 10.90;
            } else if (day.equals("Saturday")) {
                price += num * 15.60;
            } else if (day.equals("Sunday")) {
                price += num * 16;
            }

        } else if (group.equals("Regular")) {
            if (day.equals("Friday")) {
                price += num * 15;
            } else if (day.equals("Saturday")) {
                price += num * 20;
            } else if (day.equals("Sunday")) {
                price += num * 22.50;
            }

            if (num >= 10 && num <= 20) {
                price *= 0.95;
            }

        }
        System.out.printf("Total price: %.2f", price);
    }
}
