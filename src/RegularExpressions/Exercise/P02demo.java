package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String name : names) {
            racers.put(name, 0);
        }
        String input = scanner.nextLine();

        while (!input.equals("end of race")) {

            String regexName = "[A-Za-z]+";
            Pattern patternName = Pattern.compile(regexName);
            String regexDigits = "[0-9]";
            Pattern patternDigits = Pattern.compile(regexDigits);

            StringBuilder name = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);

            while (matcherName.find()) {
                name.append(matcherName.group());
            }

            if (racers.containsKey(name.toString())) {

                Matcher matcherDigits = patternDigits.matcher(input);
                int sum = 0;

                while (matcherDigits.find()) {
                    sum += Integer.parseInt(matcherDigits.group());
                }

                racers.put(name.toString(),racers.get(name.toString()) + sum);
            }

            input = scanner.nextLine();
        }

        int count = 1;
        for (Map.Entry<String, Integer> entry : racers.entrySet()) {

            if(count == 1){
                System.out.printf("1st place: %s%n",entry.getKey());
                count++;
            }else if (count == 2){
                System.out.printf("2nd place: %s%n",entry.getKey());
                count++;
            }else if (count == 3){
                System.out.printf("3rd place: %s%n",entry.getKey());
                break;
            }

        }

    }
}