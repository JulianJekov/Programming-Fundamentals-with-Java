package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxVolumeName = "";
        for (int i = 1; i <= numberOfKegs; i++) {

            String nameOfKeg = scanner.nextLine();
            double radiusOfKeg = Double.parseDouble(scanner.nextLine());
            int heightOfKeg = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radiusOfKeg, 2) * heightOfKeg;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxVolumeName = nameOfKeg;
            }
        }
        System.out.println(maxVolumeName);
    }
}
