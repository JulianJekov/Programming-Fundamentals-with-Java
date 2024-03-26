package _03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int currentNumber : numbersArr) {
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
