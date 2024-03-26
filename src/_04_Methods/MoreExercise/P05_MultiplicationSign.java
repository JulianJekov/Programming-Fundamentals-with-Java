package _04_Methods.MoreExercise;

import java.util.Scanner;

public class P05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printNumberSign(firstNumber, secondNumber, thirdNumber);
    }

    public static void printNumberSign(int first, int second, int third) {

        int[] numbersArr = new int[3];
        numbersArr[0] = first;
        numbersArr[1] = second;
        numbersArr[2] = third;

        boolean isZero = false;
        boolean isNegative = false;
        boolean isPositive = false;

        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr[i] == 0) {
                isZero = true;
                break;
            }
            if (numbersArr[i] < 0) {
                isNegative = !isNegative;
            } else {
                isPositive = true;
            }

        }
        if (isZero) {
            System.out.println("zero");
        } else if (isNegative) {
            System.out.println("negative");

        } else {
            System.out.println("positive");
        }
    }
}
