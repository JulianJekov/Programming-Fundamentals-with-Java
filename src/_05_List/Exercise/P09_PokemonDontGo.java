package _05_List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!numbers.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int firstElement = numbers.get(0);
                sum += firstElement;
                numbers.remove(0);
                int lastIndex = numbers.get(numbers.size() - 1);
                numbers.add(0, lastIndex);
                modifyList(numbers, firstElement);


            } else if (index > numbers.size() - 1) {
                int lastElement = numbers.get(numbers.size() - 1);
                sum += lastElement;
                numbers.remove(numbers.size() - 1);
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                modifyList(numbers, lastElement);

            } else {
                int removedNumber = numbers.get(index);
                sum += removedNumber;
                numbers.remove(index);
                modifyList(numbers, removedNumber);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedNumber) {

        for (int i = 0; i < numbers.size(); i++) {
            int currentElement = numbers.get(i);
            if (currentElement <= removedNumber) {
                currentElement += removedNumber;
            } else {
                currentElement -= removedNumber;
            }
            numbers.set(i, currentElement);
        }

    }
}
