package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deckOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> deckTwo = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!deckOne.isEmpty() && !deckTwo.isEmpty()) {
            if (deckOne.get(0) > deckTwo.get(0)) {
                deckOne.add(deckOne.get(0));
                deckOne.add(deckTwo.get(0));
                deckOne.remove(0);
                deckTwo.remove(0);
            } else if (deckOne.get(0) < deckTwo.get(0)) {
                deckTwo.add(deckTwo.get(0));
                deckTwo.add(deckOne.get(0));
                deckOne.remove(0);
                deckTwo.remove(0);
            } else {
                deckOne.remove(0);
                deckTwo.remove(0);
            }
        }

        if (!deckOne.isEmpty()) {
            int sum = 0;
            for (int i : deckOne) {
                sum += i;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else if (!deckTwo.isEmpty()) {
            int sum = 0;
            for (int i : deckTwo) {
                sum += i;
            }
            System.out.println("Second player wins! Sum: " + sum);

        }
    }
}
