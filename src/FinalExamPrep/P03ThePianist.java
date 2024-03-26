package FinalExamPrep;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> pieces = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] currentPieces = scanner.nextLine().split("\\|");

            String piece = currentPieces[0];
            String composer = currentPieces[1];
            String key = currentPieces[2];

            pieces.put(piece, new ArrayList<>());
            pieces.get(piece).add(composer);
            pieces.get(piece).add(key);

        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commands = command.split("\\|");

            switch (commands[0]) {
                case "Add": {
                    String piece = commands[1];
                    String composer = commands[2];
                    String key = commands[3];
                    if (!pieces.containsKey(piece)) {
                        pieces.put(piece, new ArrayList<>());
                        pieces.get(piece).add(composer);
                        pieces.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                }
                break;
                case "Remove": {
                    String piece = commands[1];
                    if (pieces.containsKey(piece)) {
                        pieces.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                }
                break;
                case "ChangeKey":
                    String piece = commands[1];
                    String newKey = commands[2];
                    if (pieces.containsKey(piece)) {
                        pieces.get(piece).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : pieces.entrySet()) {

            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));

        }

    }
}