package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Retire")){
            String commandName = command.split(" ")[0];

            switch (commandName){
                case"Fire":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int damage = Integer.parseInt(command.split(" ")[2]);
                    if(index >=0 && index < warShip.size()){
                        warShip.set(index, warShip.get(index) - damage);
                        if(warShip.get(index) <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case"Defend":
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int endIndex = Integer.parseInt(command.split(" ")[2]);
                    int dmg = Integer.parseInt(command.split(" ")[3]);
                    if(startIndex >= 0 && startIndex < pirateShip.size() && endIndex < pirateShip.size() && endIndex >= 0){
                        for (int i = startIndex; i <= endIndex ; i++) {
                            pirateShip.set(i,pirateShip.get(i) - dmg);
                            if(pirateShip.get(i) <= 0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case"Repair":
                    int index1 = Integer.parseInt(command.split(" ")[1]);
                    int health = Integer.parseInt(command.split(" ")[2]);
                    if (index1 >=0 && index1 < pirateShip.size()){
                        pirateShip.set(index1, pirateShip.get(index1) + health);
                        if(pirateShip.get(index1) > maxHealth){
                            pirateShip.set(index1, maxHealth);
                        }
                    }
                    break;
                case"Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if(pirateShip.get(i) < (maxHealth * 0.2)){
                            count++;
                        }
                    }
                    if(count > 0){
                        System.out.println(count + " sections need repair.");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        int pirateShipSum = 0;
        for(int number : pirateShip){
            pirateShipSum+=number;
        }

        int warShipSum = 0;
        for(int number : warShip){
            warShipSum+=number;
        }
        System.out.printf("Pirate ship status: %d%nWarship status: %d",pirateShipSum,warShipSum);
    }
}
