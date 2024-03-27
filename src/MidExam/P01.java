package MidExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        double currentExp = 0;
        int count = 0;
        for (int i = 1; i <= countBattles; i++) {
            double earnedExp = Double.parseDouble(scanner.nextLine());

            count++;
            if (i % 3 == 0 && i % 15 != 0) {
                currentExp += earnedExp * 1.15;
            } else if (i % 5 == 0 && i % 15 != 0) {
                currentExp += earnedExp * 0.9;
            } else if (i % 15 == 0) {
                currentExp += earnedExp * 1.10;
            } else {
                currentExp += earnedExp;
            }

            if (currentExp >= experience) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", count);
                return;
            }
        }
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experience - currentExp);
    }
}
