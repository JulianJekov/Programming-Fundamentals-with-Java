package _04_Methods.Exercise;

import java.util.Scanner;

public class P07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        matrixNXN(n);

    }

    public static void matrixNXN(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print(n + " ");
            }
            System.out.println();
        }

    }

}
