package _01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double spend = 0;
        double price = 0;

        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                price = 39.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    spend += price;
                    balance -= price;
                    System.out.println("Bought " + input);
                }
            } else if (input.equals("CS: OG")) {
                price = 15.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    spend += price;
                    balance -= price;
                    System.out.println("Bought " + input);
                }
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    spend += price;
                    balance -= price;
                    System.out.println("Bought " + input);
                }
            } else if (input.equals("Honored 2")) {
                price = 59.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    spend += price;
                    balance -= price;
                    System.out.println("Bought " + input);
                }
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    spend += price;
                    balance -= price;
                    System.out.println("Bought " + input);
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    spend += price;
                    balance -= price;
                    System.out.println("Bought " + input);
                }
            } else {
                System.out.println("Not Found");
            }
            if (balance <= 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }
        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, balance);
        }
    }
}