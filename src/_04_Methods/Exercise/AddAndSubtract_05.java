package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractOfSumMinusThirdNum(num1, num2, num3));
    }

    public static int sumOfFirstTwoNums(int num1, int num2) {

        return num1 + num2;
    }

    public static int subtractOfSumMinusThirdNum(int num1, int num2, int num3) {

        return sumOfFirstTwoNums(num1, num2) - num3;
    }
}
