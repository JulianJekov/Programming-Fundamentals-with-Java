package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalCalories = 0;

        List<String> items = new ArrayList<>();

        Pattern FinalPattern = Pattern.compile("([#|])(?<food>[A-Za-z\\s*]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1");
        Matcher FinalMatcher = FinalPattern.matcher(input);

        while (FinalMatcher.find()) {
            String food = FinalMatcher.group("food");
            String date = FinalMatcher.group("date");
            String calories = FinalMatcher.group("calories");

            totalCalories += Integer.parseInt(calories);
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %s", food, date, calories));

        }
        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);

       items.forEach(System.out::println);
    }
}
