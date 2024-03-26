package _04_Methods.MoreExercise;

import java.util.Scanner;

public class P01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println((printInt(input, number)));
                break;
            case "real":
                double floatNumber = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", printDouble(input, floatNumber));
                break;
            case "string":
                input = scanner.nextLine();
                printString(input);
                break;
        }

    }

    public static int printInt(String input, int number) {

        return number * 2;
    }

    public static double printDouble(String input, double floatNumber) {
        return floatNumber * 1.5;
    }

    public static void printString(String input) {

        System.out.println("$" + input + "$");
    }
}

