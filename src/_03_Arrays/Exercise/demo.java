package _03_Arrays.Exercise;

import java.util.Scanner;


public class demo {
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

                        boolean isAlreadyContain = false;

                        for (int j = 0; j < loot.length; j++) {
                            if (loot[j].equals(commandParts[i])) {
                                isAlreadyContain = true;
                                break;
                            }
                        }
                        if (!isAlreadyContain) {
                            String newLoot = commandParts[i] + " " + String.join(" ", loot);
                            loot = newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index < 0 || index > loot.length - 1) {
                        break;
                    } else {
                        String droppedElement = loot[index];
                        for (int i = index; i < loot.length - 1; i++) {

                            loot[i] = loot[i + 1];
                        }
                        loot[loot.length - 1] = droppedElement;
                    }
                    break;
                case "Steal":
                    int stolenItems = Integer.parseInt(commandParts[1]);
                    if (stolenItems >= 0 && stolenItems < loot.length) {
                        for (int i = 0; i < stolenItems; i++) {
                            System.out.print(loot[loot.length - stolenItems + i]);
                            if (i != stolenItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempLoot = new String[loot.length - stolenItems];
                        System.arraycopy(loot, 0, tempLoot, 0, tempLoot.length);
                        loot = tempLoot;
                    } else if(stolenItems >= 0){
                        for (int i = 0; i < loot.length; i++) {
                            System.out.print(loot[i]);
                            if(i != loot.length - 1){
                                System.out.print(", ");
                            }
                        }
                        loot = new String[0];
                    }


                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println();
        String lootLength = String.join("",loot);
        int count = lootLength.length();

        if(loot.length > 0){
            System.out.printf("Average treasure gain: %.2f pirate credits.", 1.0 * count / loot.length);
        }else{
            System.out.println("Failed treasure hunt.");
        }

    }
}
