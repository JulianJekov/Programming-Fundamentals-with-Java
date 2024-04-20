package _08_TextProcessing.MoreExercise;

import java.util.Scanner;

public class P01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();

            int startIndexName = text.indexOf('@');
            int endIndexName = text.indexOf('|');
            String name = text.substring(startIndexName + 1, endIndexName);

            int startIndexAge = text.indexOf('#');
            int endIndexAge = text.indexOf('*');
            int age = Integer.parseInt(text.substring(startIndexAge + 1, endIndexAge));

            System.out.printf("%s is %d years old.%n", name, age);
        }
    }
}
