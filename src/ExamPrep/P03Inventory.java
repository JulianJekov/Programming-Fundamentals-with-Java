package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listItems = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String commandName = command.split(" - ")[0];
            String item = command.split(" - ")[1];
            switch (commandName) {
                case "Collect":
                    if (!listItems.contains(item)) {
                        listItems.add(item);
                    }
                    break;
                case "Drop":
                    listItems.remove(item);
                    break;
                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    int index = listItems.indexOf(oldItem);
                    if (listItems.contains(oldItem)) {
                        listItems.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (listItems.contains(item)) {
                        int indexOfItem = listItems.indexOf(item);
                        String renewedItem = listItems.get(indexOfItem);
                        listItems.remove(renewedItem);
                        listItems.add(renewedItem);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ",listItems));
    }
}
