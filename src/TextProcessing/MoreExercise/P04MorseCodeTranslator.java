package TextProcessing.MoreExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?"};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};

        Map<String, String> alphaMorseMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");

        for (int i = 0; i < morse.length; i++) {

            alphaMorseMap.put(morse[i], alpha[i]);

        }
        StringBuilder sb = new StringBuilder();
        for (String s : inputArr) {
            if (s.equals("|")) {
                sb.append(" ");
            } else {
                sb.append(alphaMorseMap.get(s).toUpperCase());
            }
        }
        System.out.println(sb);
    }
}
