package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=/])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;

        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {
            String word = matcher.group().replaceAll("[=/]", "");
            count += word.length();
            destinations.add(word);
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.printf("Travel Points: %d", count);
    }
}
