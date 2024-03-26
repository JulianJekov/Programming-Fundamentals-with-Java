package List.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                numbers.add(input.charAt(i));
            } else {
                letters.add(input.charAt(i));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int numToAdd = Character.getNumericValue(numbers.get(i));
            if (i % 2 == 0) {
                takeList.add(numToAdd);
            } else {
                skipList.add(numToAdd);
            }
        }

    }
}
