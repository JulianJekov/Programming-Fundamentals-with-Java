package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTank = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int littersInTanker = 0;

        for (int i = 1; i <= n; i++) {
            int currentLites = Integer.parseInt(scanner.nextLine());

            if (littersInTanker + currentLites > waterTank) {
                System.out.println("Insufficient capacity!");
            } else {
                littersInTanker += currentLites;
            }
        }
        System.out.println(littersInTanker);
    }
}
