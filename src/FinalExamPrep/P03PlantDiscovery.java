package FinalExamPrep;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Double>> ratings = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] plantsData = scanner.nextLine().split("<->");
            String plant = plantsData[0];
            int rarity = Integer.parseInt(plantsData[1]);

            plants.put(plant, rarity);

            ratings.put(plant, new ArrayList<>());
        }
        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandArr = command.split(": ");
            String[] tokens = commandArr[1].split(" - ");
            String plant = tokens[0];

            if (!ratings.containsKey(plant)) {
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }
            switch (commandArr[0]) {
                case "Rate":
                    double rating = Double.parseDouble(tokens[1]);
                    ratings.get(plant).add(rating);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(tokens[1]);
                    plants.put(plant, rarity);
                    break;
                case "Reset":
                    ratings.get(plant).clear();
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plants.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(),
                    ratings.get(entry.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
        }
//        for (Map.Entry<String, Integer> entry : plants.entrySet()) {
//
//            System.out.printf("- %s; Rarity: %d; ", entry.getKey(), entry.getValue());
//
//            double totalrate =0;
//            for (Double rating: ratings.get(entry.getKey())) {
//                totalrate+= rating;
//
//            }
//            if(totalrate == 0){
//                System.out.println("Rating: 0.00");
//            }else {
//                double avv = totalrate / ratings.get(entry.getKey()).size();
//                System.out.printf("Rating: %.2f%n",avv);
//            }
        }
    }