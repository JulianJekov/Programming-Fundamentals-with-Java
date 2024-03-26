package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long coolThreshold = 1;
        List<String> coolEmoji = new ArrayList<>();
        String input = scanner.nextLine();
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                coolThreshold *= Integer.parseInt(symbol + "");
            }
        }
//        coolThreshold =1;
//        for (int i = 0; i < input.length(); i++) {
//            if(Character.isDigit(input.charAt(i))){
//                coolThreshold *= Integer.parseInt(input.charAt(i)+ "");
//            }
//        }
//        System.out.println(coolThreshold);

        System.out.println("Cool threshold: " + coolThreshold);

        Pattern pattern = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        int countValidEmoji = 0;

        while (matcher.find()) {
            countValidEmoji++;
            int coolLevelCurrentEmoji = 0;
            String emoji = matcher.group("emoji");
            for (char symbol : emoji.toCharArray()) {
                coolLevelCurrentEmoji += symbol;
            }
            if(coolLevelCurrentEmoji >= coolThreshold){
                coolEmoji.add(matcher.group());
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n",countValidEmoji);
        coolEmoji.forEach(System.out::println);
    }
}
