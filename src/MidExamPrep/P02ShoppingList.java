package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")){
            String[] commands = command.split(" ");
            String item = commands[1];
            switch (commands[0]){
                case"Urgent":
                    if(!groceries.contains(item)){
                        groceries.add(0,item);
                    }
                    break;
                case"Unnecessary":
                    groceries.remove(item);
                    break;
                case"Correct":
                    String item2 = commands[2];
                    if(groceries.contains(item)){
                        groceries.set(groceries.indexOf(item),item2);
                    }
                    break;
                case"Rearrange":
                    if(groceries.contains(item)){
                        groceries.add(groceries.remove(groceries.indexOf(item)));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}
