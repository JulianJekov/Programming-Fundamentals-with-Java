package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        if (firstNumbers.size() > secondNumbers.size()) {
            firstResult(firstNumbers, secondNumbers, result);

        } else if (firstNumbers.size() < secondNumbers.size()) {
            secondResult(firstNumbers, secondNumbers, result);
        } else {
            thirdResult(firstNumbers, secondNumbers, result);
        }

        for (int number : result) {
            System.out.print(number + " ");
        }

    }

    private static void thirdResult(List<Integer> firstNumbers, List<Integer> secondNumbers, List<Integer> result) {
        for (int i = 0; i < firstNumbers.size(); i++) {
            result.add(firstNumbers.get(i));
            result.add(secondNumbers.get(i));
        }
    }

    private static void secondResult(List<Integer> firstNumbers, List<Integer> secondNumbers, List<Integer> result) {
        for (int i = 0; i < firstNumbers.size(); i++) {
            result.add(firstNumbers.get(i));
            result.add(secondNumbers.get(i));
        }

        for (int i = firstNumbers.size(); i < secondNumbers.size(); i++) {
            result.add(secondNumbers.get(i));
        }
    }

    private static void firstResult(List<Integer> firstNumbers, List<Integer> secondNumbers, List<Integer> result) {
        for (int i = 0; i < secondNumbers.size(); i++) {
            result.add(firstNumbers.get(i));
            result.add(secondNumbers.get(i));
        }
        for (int i = secondNumbers.size(); i < firstNumbers.size(); i++) {
            result.add(firstNumbers.get(i));
        }
    }
}
