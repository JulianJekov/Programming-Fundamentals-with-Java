package _01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countLetters; i++) {

            int inputNumber = Integer.parseInt(scanner.nextLine());
            String numberAsText = Integer.toString(inputNumber);
            int digitsCount = numberAsText.length();
            int mainDigit = inputNumber % 10;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + digitsCount - 1;
            if (mainDigit == 0) {
                System.out.print(" ");
            } else {
                System.out.print((char) (letterIndex + 97));
            }
        }
    }
}
