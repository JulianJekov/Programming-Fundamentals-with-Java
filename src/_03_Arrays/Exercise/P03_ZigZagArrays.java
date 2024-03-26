package _03_Arrays.Exercise;

import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {

            String[] currentNum = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArr[i] = currentNum[0];
                secondArr[i] = currentNum[1];
            } else {
                firstArr[i] = currentNum[1];
                secondArr[i] = currentNum[0];
            }
        }
        System.out.print(String.join(" ", firstArr));
        System.out.println();
        System.out.print(String.join(" ", secondArr));
    }
}