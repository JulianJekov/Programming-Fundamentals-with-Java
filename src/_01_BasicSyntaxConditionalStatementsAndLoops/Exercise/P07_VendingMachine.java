package _01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("Start")) {
            double currentCoins = Double.parseDouble(input);
            if (currentCoins == 0.1 || currentCoins == 0.2 || currentCoins == 0.5 || currentCoins == 1 || currentCoins == 2) {
                sum += currentCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double price;
        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    price = 0;
                    break;
            }
            if (sum >= price && price != 0) {
                System.out.printf("Purchased %s%n", product);
                sum -= price;
            } else if (sum < price && price != 0) {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}