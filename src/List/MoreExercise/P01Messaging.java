package List.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Character> symbols = new ArrayList<>();
        String text = scanner.nextLine();
        for(char i : text.toCharArray()){
                symbols.add(i);
        }
        String textToPrint = "";
        for (int currentNumber : numberList) {
            int sum = 0;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
            }
            for (int j = 0; j < symbols.size(); j++) {

                if (sum > symbols.size() - 1) {
                    sum = 1;
                }
                if (j == sum) {
                    textToPrint += symbols.get(j);
                    symbols.remove(j);
                    break;
                }
            }

        }

        System.out.println(textToPrint);
    }
}
