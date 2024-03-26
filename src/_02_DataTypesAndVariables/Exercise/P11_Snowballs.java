package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 1; i <= numberSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (maxValue <= snowballValue) {
                maxValue = snowballValue;
                first = snowballSnow;
                second = snowballTime;
                third = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", first, second, maxValue, third);

    }
}
