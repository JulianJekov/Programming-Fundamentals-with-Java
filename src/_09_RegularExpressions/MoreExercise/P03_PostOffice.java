package _09_RegularExpressions.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];

        Map<Character, Integer> letters = new LinkedHashMap<>();

        Pattern patternText = Pattern.compile("([#$%*&])(?<capitalLetters>[A-Z]+)\\1");
        Matcher matcherText = patternText.matcher(firstPart);

        StringBuilder sb = new StringBuilder();
        while (matcherText.find()) {
            sb.append(matcherText.group("capitalLetters"));
        }

        for (int i = 0; i < sb.length(); i++) {

            char symbol = sb.charAt(i);

            Pattern patternDigits = Pattern.compile("(?<letter>[0-9]{2}):(?<length>[0-9]{2})");
            Matcher matcherDigits = patternDigits.matcher(secondPart);

            while (matcherDigits.find()) {
                int asciiCode = Integer.parseInt(matcherDigits.group("letter"));
                int length = Integer.parseInt(matcherDigits.group("length"));

                if (symbol == asciiCode && !letters.containsKey(symbol)) {
                    letters.put(symbol, length + 1);
                    break;
                }
            }
        }
        String[] words = thirdPart.split("\\s+");
        for (int i = 0; i < sb.length(); i++) {

            char firstLetter = sb.charAt(i);
            int length = letters.get(firstLetter);

            for (String word : words) {

                int wordLength = word.length();
                char firstChar = word.charAt(0);

                if (firstLetter == firstChar && length == wordLength) {
                    System.out.println(word);
                    break;
                }

            }

        }
    }
}
