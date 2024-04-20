package _07_AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> registeredUsers = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] commandParts = scanner.nextLine().split(" ");
            String commandName = commandParts[0];
            String username = commandParts[1];


            if (commandName.equals("register")) {
                String plateNumber = commandParts[2];
                if (!registeredUsers.containsKey(username)) {
                    registeredUsers.put(username, plateNumber);
                    System.out.printf("%s registered %s successfully%n", username, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }

            } else if (commandName.equals("unregister")) {
                if (!registeredUsers.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registeredUsers.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        for (Map.Entry<String, String> entry : registeredUsers.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
