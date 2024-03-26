package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class dem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");

            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    items.put(material, items.get(material) + quantity);
                } else {
                    junkItems.putIfAbsent(material, 0);
                    junkItems.put(material, junkItems.get(material) + quantity);
                }
                if (items.get("shards") >= 250) {
                    items.put("shards", items.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    items.put("fragments", items.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    isWin = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    items.put("motes", items.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    isWin = true;
                    break;
                }
            }
        }

        printMaps(items);
        printMaps(junkItems);

    }

    public static void printMaps(Map<String, Integer> items) {
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}