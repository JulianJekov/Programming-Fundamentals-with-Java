package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        names.forEach(name -> racerDistances.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String command = scanner.nextLine();

        while (!command.equals("end of race")) {

            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(command);
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }

            int distance = 0;

            Matcher matcherDigits = patternDigits.matcher(command);

            while (matcherDigits.find()) {

                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())) {
                int currentDistance = racerDistances.get(racerName.toString());
                racerDistances.put(racerName.toString(), currentDistance + distance);
            }
            command = scanner.nextLine();
        }
//        List<String> top3Names =
//        racerDistances.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(3).map(entry -> entry.getKey())
//                .collect(Collectors.toList());
//
//        System.out.println("1st place: " + top3Names.get(0));
//        System.out.println("2nd place: " + top3Names.get(1));
//        System.out.println("3rd place: " + top3Names.get(2));

        int count = 1;
        for (Map.Entry<String, Integer> pair : racerDistances.entrySet()) {

            if (count == 1) {
                System.out.println("1st place: " + pair.getKey());
                count++;
            } else if (count == 2) {
                System.out.println("2nd place: " + pair.getKey());
                count++;
            } else {
                System.out.println("3rd place: " + pair.getKey());
                break;
            }

        }

    }
}
