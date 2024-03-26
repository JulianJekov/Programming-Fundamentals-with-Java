package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double diff = Math.abs(a - b);
        double eps = 0.000001;
        if (diff > eps) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
