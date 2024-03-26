package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attacks = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String regexSTAR = "[starSTAR]";
            Pattern patternSTAR = Pattern.compile(regexSTAR);
            Matcher matcherSTAR = patternSTAR.matcher(input);

            int cout = 0;

            while (matcherSTAR.find()) {
                cout++;
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {

                char symbol = input.charAt(j);
                char symbol2 = (char) (symbol - cout);

                sb.append(symbol2);
            }
            String regexMessage = "@(?<name>[A-Z][a-z]+)[^-!:@>]*:(?<population>[\\d]+)[^-!:@>]*!(?<command>[AD])![^-!:@>]*->(?<soldiers>[\\d]+)";
            Pattern patternMessage = Pattern.compile(regexMessage);
            Matcher matcherMessage = patternMessage.matcher(sb);

            while (matcherMessage.find()) {

                String name = matcherMessage.group("name");
                String command = matcherMessage.group("command");
                if (command.equals("A")) {
                    attacks.add(name);
                } else if (command.equals("D")) {
                    destroyed.add(name);
                }
            }
        }
        attacks.sort(Comparator.naturalOrder());
        // Collections.sort(attacks);
        destroyed.sort(Comparator.naturalOrder());
        //Collections.sort(destroyed);

        if (attacks.isEmpty()) {
            System.out.println("Attacked planets: 0");
        } else {
            System.out.printf("Attacked planets: %d%n", attacks.size());
            for (String planet : attacks) {
                System.out.printf("-> %s%n", planet);
            }
        }
        if (destroyed.isEmpty()) {
            System.out.println("Destroyed planets: 0");
        } else {
            System.out.printf("Destroyed planets: %d%n", destroyed.size());
            for (String planet : destroyed) {
                System.out.printf("-> %s%n", planet);
            }
        }

    }
}
