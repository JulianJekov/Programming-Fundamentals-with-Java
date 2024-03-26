package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int open = 0;
        int close = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.charAt(0) == '(') {
                open++;
            } else if (input.charAt(0) == ')') {
                close++;
                if (open - close != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }

        }
        if (open == close) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
