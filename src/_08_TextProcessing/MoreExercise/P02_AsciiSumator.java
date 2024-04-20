package _08_TextProcessing.MoreExercise;

import java.util.Scanner;

public class P02_AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        String text = scanner.nextLine();

        int totalValue = 0;
        for (char symbol : text.toCharArray()) {

            if (symbol > first && symbol < second) {
                totalValue += symbol;

            }
        }
        System.out.println(totalValue);
    }
}

