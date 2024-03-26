package Methods.MoreExercise;

import java.util.Scanner;

public class TribinacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] tribonacci = tribonacci(n);
        for (int i : tribonacci) {
            System.out.print(i + " ");
        }
    }

    public static int[] tribonacci(int n) {

        int[] tribonacci = new int[n];

        for (int i = 0; i < tribonacci.length; i++) {
            if (i == 0 || i == 1) {
                tribonacci[i] = 1;
            } else if (i == 2) {
                tribonacci[i] = tribonacci[0] + tribonacci[1];
            } else {
                tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
            }
        }
        return tribonacci;
    }
}