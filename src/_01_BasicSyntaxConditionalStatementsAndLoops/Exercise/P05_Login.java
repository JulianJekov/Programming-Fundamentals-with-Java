package _01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        String enteredPassword = scanner.nextLine();

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }
        int countFaildTries = 0;
        while (!enteredPassword.equals(password)) {
            countFaildTries++;
            if (countFaildTries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }

}
