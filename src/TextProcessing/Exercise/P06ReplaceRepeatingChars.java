package TextProcessing.Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 1) {
                sb.append(text.charAt(i));
            } else {
                if (text.charAt(i) != text.charAt(i + 1)) {
                    sb.append(text.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
