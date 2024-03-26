package AssociativeArrays.Exercise;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Double> productPriceMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantityMap = new LinkedHashMap<>();
        while (!command.equals("buy")) {

            String[] commandParts = command.split(" ");

            String productName = commandParts[0];
            double price = Double.parseDouble(commandParts[1]);
            int quantity = Integer.parseInt(commandParts[2]);

            productQuantityMap.putIfAbsent(productName,0);
            productQuantityMap.put(productName,productQuantityMap.get(productName) + quantity);

            productPriceMap.putIfAbsent(productName,0.0);
            productPriceMap.put(productName,price);

            productPriceMap.put(productName,productQuantityMap.get(productName) * productPriceMap.get(productName));

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPriceMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
        }

    }
}
