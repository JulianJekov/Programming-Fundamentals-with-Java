package FinalExamPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([#@])(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Map<String, String> mirrorWords = new LinkedHashMap<>();

        List<String> words = new ArrayList<>();

        while (matcher.find()) {

            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            words.add(matcher.group());

            String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();

            if (reversedSecondWord.equals(firstWord)) {
                mirrorWords.put(firstWord, secondWord);
            }


        }
        if (words.isEmpty()) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", words.size());
        }
        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : mirrorWords.entrySet()) {
                sb.append(String.format("%s <=> %s, ",entry.getKey(),entry.getValue()));
            }
            String finalOutput = sb.substring(0,sb.length() - 2);
            System.out.println(finalOutput);
        }
    }
}
