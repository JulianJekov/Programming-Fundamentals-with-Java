package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Contains")) {
                printContains(numbers, command);

            } else if (command.equals("Print even")) {
                printEvenNumbers(numbers);
                printNewLine();

            } else if (command.equals("Print odd")) {
                printOddNumbers(numbers);
                printNewLine();

            } else if (command.equals("Get sum")) {
                printSum(numbers);

            } else if (command.startsWith("Filter")) {
                String condition = command.split(" ")[1];
                int numberToFilter = Integer.parseInt(command.split(" ")[2]);

                printFilteredNumbers(numbers, condition, numberToFilter);
                printNewLine();
            }
            command = scanner.nextLine();
        }
    }

    private static void printNewLine() {
        System.out.println();
    }

    private static void printContains(List<Integer> numbers, String command) {
        int numberToCheck = Integer.parseInt(command.split(" ")[1]);
        if (numbers.contains(numberToCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printFilteredNumbers(List<Integer> numbers, String condition, int numberToFilter) {

        switch (condition) {
            case "<":
                for (int number : numbers) {
                    if (number < numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">":
                for (int number : numbers) {
                    if (number > numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">=":
                for (int number : numbers) {
                    if (number >= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case "<=":
                for (int number : numbers) {
                    if (number <= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
        }
    }

    private static void printSum(List<Integer> numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }


    private static void printOddNumbers(List<Integer> numbers) {

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

    }

    private static void printEvenNumbers(List<Integer> numbers) {

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

    }
}