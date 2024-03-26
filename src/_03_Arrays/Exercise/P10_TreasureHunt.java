package _03_Arrays.Exercise;

import java.util.Scanner;

public class P10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] loot = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < loot.length; j++) {

                            if (commandParts[i].equals(loot[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newLoot = commandParts[i] + " " + String.join(" ", loot);
                            loot = newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandParts[1]);
                    if (dropIndex < 0 || dropIndex >= loot.length - 1) {
                        break;
                    } else {
                        String currentLoot = loot[dropIndex];

                        for (int i = dropIndex; i < loot.length - 1; i++) {
                            loot[i] = loot[i + 1];
                        }
                        loot[loot.length - 1] = currentLoot;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(commandParts[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < loot.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {
                            System.out.print(loot[loot.length - numberOfStealingItems + i]);
                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[loot.length - numberOfStealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = loot[i];
                        }
                        loot = tempChest;

                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < loot.length; i++) {
                            System.out.print(loot[i]);
                            if (i != loot.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        loot = new String[0];
                    }
                    System.out.println();


                    break;
            }


            command = scanner.nextLine();
        }
        String treasureCount = String.join("", loot);

        int count = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            count++;
        }
        double averageTreasure = 1.0 * count / loot.length;
        if (count > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
