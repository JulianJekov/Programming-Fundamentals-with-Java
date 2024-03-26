package _03_Arrays.Exercise;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numsArr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String firstElement = numsArr[0];

            for (int j = 0; j < numsArr.length - 1; j++) {

                numsArr[j] = numsArr[j + 1];

            }
            numsArr[numsArr.length - 1] = firstElement;
        }

        System.out.print(String.join(" ", numsArr));
    }
}
