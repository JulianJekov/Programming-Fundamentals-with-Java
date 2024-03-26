package FinalExamPrep;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            String[] commandData = command.split(">>>");
            switch (commandData[0]) {
                case "Contains":
                    String substring = commandData[1];
                    if (text.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", text, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip": {
                    String upperOrLower = commandData[1];
                    int startIndex = Integer.parseInt(commandData[2]);
                    int endIndex = Integer.parseInt(commandData[3]);
                    String substringModify = text.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")) {
                        String substringToUpper = text.toString().replace(substringModify, substringModify.toUpperCase());
                        text = new StringBuilder(substringToUpper);
                        System.out.println(text);
                    } else {
                        String substringToLower = text.toString().replace(substringModify, substringModify.toLowerCase());
                        text = new StringBuilder(substringToLower);
                        System.out.println(text);
                    }
                }
                break;
                case "Slice":
                    int startIndex = Integer.parseInt(commandData[1]);
                    int endIndex = Integer.parseInt(commandData[2]);
                    text.delete(startIndex, endIndex);
                    System.out.println(text);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + text);
    }
}
