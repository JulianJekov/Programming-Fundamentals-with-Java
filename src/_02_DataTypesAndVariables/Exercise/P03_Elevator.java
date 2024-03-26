package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        if (number <= number2) {
            System.out.println(1);
        } else if (number % number2 == 0) {
            System.out.println(number / number2);
        } else if (number % number2 != 0) {
            int courses ;
            courses = (int) Math.ceil(1.0 * number / number2);
            System.out.println(courses);
        }

    }
}

