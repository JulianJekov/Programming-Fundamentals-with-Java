package _01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10_PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightSabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        int freeBelts = countStudents / 6;

        double priceLightSabers = Math.ceil(countStudents * 1.1) * lightSabers;
        double priceRobes = countStudents * robes;
        double priceBelts = (countStudents - freeBelts) * belts;
        double finalPrice = priceLightSabers + priceRobes + priceBelts;
        double diff = Math.abs(budget - finalPrice);

        if (budget >= finalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
