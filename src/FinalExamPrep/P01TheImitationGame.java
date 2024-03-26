package FinalExamPrep;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder sb = new StringBuilder(message);

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] tokens = input.split("\\|");
            String command = tokens[0];

            switch (command) {
                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    message = message.replace(substring, replacement);

//                    String change = sb.toString().replace(substring,replacement);
//                    sb = new StringBuilder(change);

                    break;
                case "Insert": {
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];

                    String firstPart = message.substring(0, index);
                    String secondPart = message.substring(index);
                    message = firstPart.concat(value).concat(secondPart);

                    //sb.insert(index,value);

                    break;
                }
                case "Move":
                    int numLetters = Integer.parseInt(tokens[1]);

                    String firstPart = message.substring(0, numLetters);
                    String secondPart = message.substring(numLetters);
                    message = secondPart.concat(firstPart);

//                    String append = sb.substring(0,numLetters);
//                    sb.delete(0,numLetters).append(append);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", message);
    }
}
