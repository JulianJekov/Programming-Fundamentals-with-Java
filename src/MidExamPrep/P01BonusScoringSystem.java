package MidExamPrep;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double totalBonus = 0;
        double maxBonus = Double.MIN_VALUE;
        int valueOfAttendance = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());

            totalBonus = Math.round(1.0 * attendance / numberOfLectures * (5 + bonus));
            if (maxBonus <= totalBonus) {
                maxBonus = totalBonus;
                valueOfAttendance = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", valueOfAttendance);

    }
}
