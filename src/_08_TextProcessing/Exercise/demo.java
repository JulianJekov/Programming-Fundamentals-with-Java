package _08_TextProcessing.Exercise;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");
        double totalSum = 0;

        for (String code : codes) {
            totalSum += codeSum(code);
        }
        System.out.printf("%.2f",totalSum);
    }

    public static double codeSum(String code) {
        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(lastLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            number /= (firstLetter - 64);
        } else if (Character.isLowerCase(firstLetter)) {
            number *= firstLetter - 96;
        }
        if (Character.isUpperCase(lastLetter)) {
            number -= lastLetter - 64;
        } else if (Character.isLowerCase(lastLetter)) {
            number += lastLetter - 96;
        }
        return number;
    }
}