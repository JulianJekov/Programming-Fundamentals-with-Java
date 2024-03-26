package FinalExamPrep;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> targets = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String[] inputData = input.split("\\|+");
            String town = inputData[0];
            int population = Integer.parseInt(inputData[1]);
            int gold = Integer.parseInt(inputData[2]);

            if (!targets.containsKey(town)) {
                targets.put(town, new ArrayList<>());
                targets.get(town).add(population);
                targets.get(town).add(gold);
            } else {
                targets.get(town).set(0, targets.get(town).get(0) + population);
                targets.get(town).set(1, targets.get(town).get(1) + gold);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputData = input.split("=>");
            switch (inputData[0]) {
                case "Plunder": {
                    String town = inputData[1];
                    int people = Integer.parseInt(inputData[2]);
                    int gold = Integer.parseInt(inputData[3]);
                    targets.get(town).set(0, targets.get(town).get(0) - people);
                    targets.get(town).set(1, targets.get(town).get(1) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if (targets.get(town).get(0) <= 0 || targets.get(town).get(1) <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        targets.remove(town);
                    }
                }
                break;
                case "Prosper":
                    String town = inputData[1];
                    int gold = Integer.parseInt(inputData[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        targets.get(town).set(1, targets.get(town).get(1) + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, targets.get(town).get(1));
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        if (targets.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", targets.size());
            for (Map.Entry<String, List<Integer>> entry : targets.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                        , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }
        }
    }
}
