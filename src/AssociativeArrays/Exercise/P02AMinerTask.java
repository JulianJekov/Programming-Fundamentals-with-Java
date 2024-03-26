package AssociativeArrays.Exercise;

import java.util.*;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!command.equals("stop")){
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            resourceMap.putIfAbsent(resource,0);
            resourceMap.put(resource,resourceMap.get(resource) + quantity);

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {

            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());

        }

    }
}
