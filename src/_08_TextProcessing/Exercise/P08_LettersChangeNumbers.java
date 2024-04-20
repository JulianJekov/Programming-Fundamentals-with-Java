package _08_TextProcessing.Exercise;

import java.util.Scanner;

public class P08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");
        double finalSum = 0;
        for (String code : codes) {

            double number = getNumber(code);

            finalSum += number;

        }
        System.out.printf("%.2f", finalSum);

    }

    private static double getNumber(String code) {

        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            number = number / ((int) firstLetter - 64);
        } else if (Character.isLowerCase(firstLetter)) {
            number = number * ((int) firstLetter - 96);
        }

        if (Character.isUpperCase(secondLetter)) {
            number = number - ((int) secondLetter - 64);
        } else if (Character.isLowerCase(secondLetter)) {
            number = number + ((int) secondLetter - 96);
        }
        return number;
    }
}
