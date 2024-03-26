package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = 0; i < rooms.size(); i++) {
            String commandName = rooms.get(i).split(" ")[0];
            int number = Integer.parseInt(rooms.get(i).split(" ")[1]);

            if (commandName.equals("potion")) {
                if (health + number > 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - health);
                    health = 100;
                } else {
                    System.out.printf("You healed for %d hp.%n",number);
                    health += number;
                }
                System.out.printf("Current health: %d hp.%n", health);
            } else if (commandName.equals("chest")) {
                System.out.printf("You found %d bitcoins.%n", number);
                bitcoins += number;

            } else {
                health -= number;

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", commandName);
                } else {
                    System.out.printf("You died! Killed by %s.%n", commandName);
                    System.out.printf("Best room: %d", i + 1);
                    break;
                }
            }
        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
