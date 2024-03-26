package FinalExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String commands = scanner.nextLine();

        while (!commands.equals("End")) {

            String[] commandsData = commands.split("\\s+");

            switch (commandsData[0]) {

                case "Translate":
                    String oldChar = commandsData[1];
                    String newChar = commandsData[2];
                    String replace = input.toString().replace(oldChar, newChar);
                    input = new StringBuilder(replace);
                    System.out.println(input);
                    break;
                case "Includes":
                    String substring = commandsData[1];
                    if (input.toString().contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String substring1 = commandsData[1];
                    if (input.toString().startsWith(substring1)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    String toLowerCase = input.toString().toLowerCase();
                    input = new StringBuilder(toLowerCase);
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String indexOfLastChar = commandsData[1];
                    int index = input.lastIndexOf(indexOfLastChar);
                    System.out.println(index);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(commandsData[1]);
                    int endIndex = startIndex + Integer.parseInt(commandsData[2]);
                    input.delete(startIndex, endIndex);
                    System.out.println(input);
                    break;

            }

            commands = scanner.nextLine();
        }

    }
}
