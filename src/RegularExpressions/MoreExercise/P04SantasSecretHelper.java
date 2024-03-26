package RegularExpressions.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        List<String> names = new ArrayList<>();

        while (!input.equals("end")) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {

                char symbol = input.charAt(j);
                char symbol2 = (char) (symbol - key);

                sb.append(symbol2);
            }
            String regex = "@(?<name>[A-Za-z]+)[^-@!:>]*!(?<behavior>[GN])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);
            while (matcher.find()) {

                String name = matcher.group("name");
                String behavior = matcher.group("behavior");

                if (behavior.equals("G")) {
                    names.add(name);
                }

            }
            input = scanner.nextLine();
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
