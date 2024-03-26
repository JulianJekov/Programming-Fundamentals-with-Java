package ExamPrep;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plundersPerDay = Integer.parseInt(scanner.nextLine());
        double targetCountPlunders = Double.parseDouble(scanner.nextLine());

        double totalPlunders = 0;
        for (int i = 1; i <= days; i++) {
            totalPlunders += plundersPerDay;

            if (i % 3 == 0) {
                double extraPlunders = plundersPerDay * 0.5;
                totalPlunders += extraPlunders;
            }
            if (i % 5 == 0) {
                totalPlunders *= 0.7;
            }
        }
        if (totalPlunders >= targetCountPlunders) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunders);
        } else {
            double percent = totalPlunders / targetCountPlunders * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }
    }
}