package _03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int digit = 0;
        int count = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    digit = numbers[i];
                }

            } else {
                count = 1;
            }

        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }

    }
}
