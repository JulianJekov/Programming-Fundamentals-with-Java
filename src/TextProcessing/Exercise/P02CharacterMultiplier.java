package TextProcessing.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        int sum = 0;

        int min = Math.min(words[0].length(), words[1].length());
        int max = Math.max(words[0].length(), words[1].length());

        for (int j = 0; j < min; j++) {
            int first = words[0].charAt(j);
            int second = words[1].charAt(j);
            sum += first * second;
        }
        if (words[0].length() > words[1].length()) {
            leftSum(words, min, max);

        } else if (words[1].length() > words[0].length()) {
            leftSum(words, min, max);
        }
        sum += leftSum(words, min, max);
        System.out.println(sum);
    }

    public static int leftSum(String[] words, int min, int max) {
        int left = 0;
        int index = 0;
        if (words[0].length() > words[1].length()) {

            for (int i = min; i < max; i++) {
                left += words[0].charAt(min + index);
                index++;
            }
            return left;
        } else if (words[1].length() > words[0].length()) {
            for (int i = min; i < max; i++) {
                left += words[1].charAt(min + index);
                index++;
            }
        }
        return left;
    }
}
