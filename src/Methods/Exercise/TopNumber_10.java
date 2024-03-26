package Methods.Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < number; i++) {

            if(isSumOfDigitsIsDivisibleBy8(i) && isContainsOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isSumOfDigitsIsDivisibleBy8(int number) {

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
//        if (sum % 8 == 0) {
//            return true;
//        }else{
//            return false;
//        }
        return sum % 8 == 0;
    }

    public static boolean isContainsOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}
