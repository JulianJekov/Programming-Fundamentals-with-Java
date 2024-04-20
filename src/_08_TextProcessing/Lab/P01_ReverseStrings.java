package _08_TextProcessing.Lab;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            StringBuilder reversWord = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                reversWord.append(symbol);
            }

            System.out.printf("%s = %s%n", input, reversWord);

            input = scanner.nextLine();
        }

    }
}
