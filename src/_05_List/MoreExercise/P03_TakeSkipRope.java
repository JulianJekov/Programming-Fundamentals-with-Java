package _05_List.MoreExercise;

import java.util.Scanner;

public class P03_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String letters = "";
        String numbers = "";

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                numbers += (input.charAt(i));
            } else {
                letters += (input.charAt(i));
            }
        }
        String take = "";
        String skip = "";

        for (int i = 0; i < numbers.length(); i++) {

            if (i % 2 == 0) {
                take += numbers.charAt(i);
            } else {
                skip += numbers.charAt(i);
            }
        }

        String result = "";

        for (int i = 0; i < take.length(); i++) {

            int takeCount = Character.getNumericValue(take.charAt(i));
            int skipCount = Character.getNumericValue(skip.charAt(i));

            if (takeCount > letters.length()) {
                takeCount = letters.length();
            }

            if (takeCount == 0) {
                letters = letters.substring(skipCount);
                continue;
            }

            result += (letters.substring(0, takeCount));

            if (i == take.length() - 1) {
                break;
            }
            letters = letters.substring(skipCount + takeCount);

        }

        System.out.println(String.join("", result));

    }
}
