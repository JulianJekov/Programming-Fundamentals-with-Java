package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yields = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int startingYield = yields;
        int sum = 0;

        while (startingYield >= 100) {
            yields -= 26;
            sum += yields;
            startingYield -= 10;
            days++;
            yields = startingYield;
        }
        if (sum >= 26) {
            sum -= 26;
        }

        System.out.println(days);
        System.out.println(sum);
    }
}
