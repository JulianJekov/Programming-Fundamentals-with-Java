package _03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");
            String currentCommand = commandParts[0];

            switch (currentCommand) {

                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    int swappedElement = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = swappedElement;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commandParts[1]);
                    index2 = Integer.parseInt(commandParts[2]);
                    int multipliedElement = numbers[index1] * numbers[index2];
                    numbers[index1] = multipliedElement;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        int decrease = numbers[i] - 1;
                        numbers[i] = decrease;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

    }
}