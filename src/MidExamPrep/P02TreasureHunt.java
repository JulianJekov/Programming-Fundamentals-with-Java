package MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            String commandName = command.split(" ")[0];
            switch (commandName) {

                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        if (!treasureChest.contains(commandParts[i])) {
                            treasureChest.add(0, commandParts[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        treasureChest.add(treasureChest.remove(index));
                    }
                    break;
                case "Steal":
                    int stealedItems = Integer.parseInt(commandParts[1]);
                    int startIndex = treasureChest.size() - stealedItems;
                    List<String> stolenItems = new ArrayList<>();
                    if (startIndex < 0) {
                        startIndex = 0;
                    }

                    for (int i = startIndex; i < treasureChest.size(); i++) {
                        stolenItems.add(treasureChest.get(i));
                    }
                    if(startIndex != 0) {
                        for (int i = 0; i < stealedItems; i++) {
                            treasureChest.remove(startIndex);
                        }
                    }else{
                        treasureChest.clear();
                    }
                    System.out.println(String.join(", ",stolenItems));


                    break;

            }

            command = scanner.nextLine();
        }
        double lootLength = 0;
        for (String item : treasureChest){
            lootLength+= item.length();
        }
        if(treasureChest.isEmpty()){
            System.out.println("Failed treasure hunt.");
        }else{
            System.out.printf("Average treasure gain: %.2f pirate credits.",lootLength / treasureChest.size());
        }
    }
}
