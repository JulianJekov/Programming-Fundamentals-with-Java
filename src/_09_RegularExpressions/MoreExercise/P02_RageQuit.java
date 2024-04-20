package _09_RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<string>\\D+)(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {

            String string = matcher.group("string");
            int count = Integer.parseInt(matcher.group("count"));

            sb.append(string.toUpperCase().repeat(Math.max(0, count)));

        }
        System.out.printf("Unique symbols used: %d%n", sb.chars().distinct().count());
        System.out.println(sb);
    }
}
