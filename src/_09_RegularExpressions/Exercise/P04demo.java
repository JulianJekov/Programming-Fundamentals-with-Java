package _09_RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern patternStar = Pattern.compile("[starSTAR]");

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcherCount = patternStar.matcher(input);
            int count = 0;
            while (matcherCount.find()) {
                count++;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                int symbol = input.charAt(j) - count;
                sb.append((char) symbol);
            }
            String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>[0-9]+)";
            Pattern patternRegex = Pattern.compile(regex);
            Matcher matcherRegex = patternRegex.matcher(sb);
            while (matcherRegex.find()) {
                String planetName = matcherRegex.group("planetName");
                String attackType = matcherRegex.group("attackType");

                if (attackType.equals("A")) {
                    attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }

            }

        }
        Collections.sort(attacked);
        Collections.sort(destroyed);
        System.out.printf("Attacked planets: %d%n", attacked.size());
        attacked.forEach(name -> System.out.printf("-> %s%n", name));
        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed.forEach(name -> System.out.printf("-> %s%n", name));
    }
}
