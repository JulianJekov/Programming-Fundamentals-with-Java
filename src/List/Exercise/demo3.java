package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        while (numbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int firstElement = numbers.get(0);
                sum += firstElement;
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
                modifyList(numbers, firstElement);

            } else if (index > numbers.size()) {
                int lastElement = numbers.get(numbers.size() - 1);
                sum+= lastElement;
                numbers.remove(numbers.get(numbers.size()-1));
                numbers.add(numbers.size()-1,numbers.get(0));
                modifyList(numbers,lastElement);

            } else if (index < numbers.size()) {
                int removedElement = numbers.get(index);
                sum += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentElement = numbers.get(i);
            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }
            numbers.set(i, currentElement);
        }
    }
}
