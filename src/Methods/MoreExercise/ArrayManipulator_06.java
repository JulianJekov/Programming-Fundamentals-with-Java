package Methods.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();


        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {

                case "exchange":
                    int index = Integer.parseInt(commandParts[1]);
                    if (isValidIndex(index, numbers.length)) {
                        exchange(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOddMax = commandParts[1];
                    if (evenOrOddMax.equals("even")) {
                        printIndexMaxEvenNumber(numbers);
                    } else if (evenOrOddMax.equals("odd")) {
                        printIndexMaxOddNumber(numbers);
                    }
                    break;
                case "min":
                    String evenOrOddMin = commandParts[1];
                    if (evenOrOddMin.equals("even")) {
                        printIndexMinEvenNumber(numbers);
                    } else if (evenOrOddMin.equals("odd")) {
                        printIndexMinOddNumber(numbers);
                    }
                    break;
                case "first":
                    int firstCount = Integer.parseInt(commandParts[1]);
                    String evenOrOddFirst = commandParts[2];
                    if (evenOrOddFirst.equals("even")) {
                        if (firstCount > numbers.length) {
                            System.out.println("Invalid count");
                        } else {
                            printFirstEven(numbers, firstCount);
                        }
                    } else if (evenOrOddFirst.equals("odd")) {
                        if (firstCount > numbers.length) {
                            System.out.println("Invalid count");
                        } else {
                            printFirstOdd(numbers, firstCount);
                        }
                    }
                    break;
                case "last":
                    int lastCount = Integer.parseInt(commandParts[1]);
                    String evenOrOddLast = commandParts[2];
                    if (evenOrOddLast.equals("even")) {
                        if (lastCount > numbers.length) {
                            System.out.println("Invalid count");
                        } else {
                            printLastEven(numbers, lastCount);
                        }
                    } else if (evenOrOddLast.equals("odd")) {
                        if (lastCount > numbers.length) {
                            System.out.println("Invalid count");
                        } else {
                            printLastOdd(numbers, lastCount);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if(i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            }else{
                System.out.print(numbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void printLastOdd(int[] numbers, int lastCount) {
        System.out.print("[");

        int[] lastOdd = new int[lastCount];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0 && lastCount != 0) {
                lastCount--;
                lastOdd[index] = numbers[i];
                index++;
            }
        }
        for (int i = lastOdd.length - 1; i >= 0; i--) {
            if(lastOdd[i] == 0){
                continue;
            }
            if (i == 0) {
                System.out.print(lastOdd[i]);
            } else if(lastOdd[i - 1] != 0) {
                System.out.print(lastOdd[i] + ", ");
            }else{
                System.out.print(lastOdd[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private static void printLastEven(int[] numbers, int lastCount) {
        System.out.print("[");
        int[] lastEven = new int[lastCount];
        Arrays.fill(lastEven, -1);
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0 && lastCount != 0) {
                lastCount--;
                lastEven[index] = numbers[i];
                index++;
            }
        }
        for (int i = lastEven.length - 1; i >= 0; i--) {

            if(lastEven[i] == -1){
                continue;
            }
            if (i == 0) {
                System.out.print(lastEven[i]);
            }else if (lastEven[i - 1] != -1){
                System.out.print(lastEven[i] + ", ");
            }else{
                System.out.print(lastEven[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private static void printFirstOdd(int[] numbers, int firstCount) {
        System.out.print("[");
        int[] firstOdd = new int[firstCount];

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && firstCount != 0) {
                firstCount--;
                firstOdd[index] = numbers[i];
                index++;
            }
        }
        for (int i = 0; i < firstOdd.length; i++) {
            if(firstOdd[i] == 0){
                continue;
            }
            if (i == firstOdd.length - 1) {
                System.out.print(firstOdd[i]);
            } else if(firstOdd[i + 1] != 0) {
                System.out.print(firstOdd[i] + ", ");
            }else{
                System.out.print(firstOdd[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private static void printFirstEven(int[] numbers, int firstCount) {
        System.out.print("[");

        int[] firstEven = new int[firstCount];
        Arrays.fill(firstEven, -1);
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && firstCount != 0) {
                firstCount--;
                firstEven[index] = numbers[i];
                index++;
            }
        }
        for (int i = 0; i < firstEven.length; i++) {
            if(firstEven[i] == -1){
                continue;
            }
            if (i == firstEven.length - 1) {
                System.out.print(firstEven[i]);

            }else if (firstEven[i + 1] != -1){
                System.out.print(firstEven[i] + ", ");
            }else{
                System.out.println(firstEven[i]);
            }
        }

        System.out.print("]");
        System.out.println();
    }

    private static void printIndexMinOddNumber(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && minOdd >= numbers[i]) {
                minOdd = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printIndexMinEvenNumber(int[] numbers) {

        int minEven = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && minEven >= numbers[i]) {
                minEven = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printIndexMaxOddNumber(int[] numbers) {

        int maxOdd = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && maxOdd <= numbers[i]) {
                maxOdd = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printIndexMaxEvenNumber(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && maxEven <= numbers[i]) {
                maxEven = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void exchange(int[] numbers, int index) {

        int[] left = new int[index + 1];
        int[] right = new int[numbers.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = numbers[i];
        }
        int newIndex = 0;
        for (int i = index + 1; i < numbers.length; i++) {
            right[newIndex] = numbers[i];
            newIndex++;
        }


        for (int i = 0; i < right.length; i++) {
            numbers[i] = right[i];
        }

        for (int i = right.length; i < numbers.length; i++) {
            numbers[i] = left[i - right.length];
            newIndex++;
        }

    }

    private static boolean isValidIndex(int index, int numbers) {
        return index >= 0 && index < numbers;
    }
}