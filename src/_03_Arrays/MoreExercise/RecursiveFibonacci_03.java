package _03_Arrays.MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] fibonacciArr = new int[n];

        fibonacciArr[0] = 1;


        for (int i = 2; i < fibonacciArr.length; i++) {
            fibonacciArr[1] = 1;
            fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];

        }
        System.out.println(fibonacciArr[fibonacciArr.length-1]);
    }
}
