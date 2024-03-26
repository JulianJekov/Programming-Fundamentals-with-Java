package MidExam;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experienceNeeded = Double.parseDouble(scanner.nextLine());
        int battleCount = Integer.parseInt(scanner.nextLine());
        double totalExperience = 0;
        int count = 0;


        for (int i = 1; i <= battleCount; i++) {
            double experiencePerBattle = Double.parseDouble(scanner.nextLine());
            if (totalExperience >= experienceNeeded) {

                break;
            }
            if (i % 3 == 0) {
                experiencePerBattle *= 1.15;
            }
            if (i % 5 == 0) {
                experiencePerBattle *= 0.9;
            }
            if (i % 15 == 0) {
                experiencePerBattle *= 1.05;
            }

            totalExperience += experiencePerBattle;

            count++;

        }

        double neededExperience = experienceNeeded - totalExperience;
        if (totalExperience >= experienceNeeded) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", count);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience);
        }
    }
}
