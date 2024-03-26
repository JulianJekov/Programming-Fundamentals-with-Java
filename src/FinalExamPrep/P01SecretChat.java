package FinalExamPrep;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {

            String[] commands = input.split(":\\|:");
            String commandName = commands[0];

            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(commands[1]);
                    String firstPart = text.substring(0, index);
                    String secondPart = text.substring(index);
                    text = firstPart.concat(" ").concat(secondPart);
                    System.out.println(text);
                    sb.insert(index," ");
                    System.out.println(sb);
                    break;
                case "Reverse":
                    String substring = commands[1];

                    if(sb.indexOf(substring) >=0){
                        String reverse = new StringBuilder(substring).reverse().toString();
                        sb.delete(sb.indexOf(substring),sb.indexOf(substring) + substring.length());
                        sb.append(reverse);
                        System.out.println(sb);
                    }
                    if (text.contains(substring)) {
                        String reverse = new StringBuilder(substring).reverse().toString();
                        text = text.replaceFirst(Pattern.quote(substring), "") + reverse;
                        System.out.println(text);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldString = commands[1];
                    String newString = commands[2];
                    text = text.replaceAll(oldString, newString);
                    System.out.println(text);

                   String newone =  sb.toString().replace(oldString,newString);
                   sb = new StringBuilder(newone);

                    System.out.println(sb);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", text);
    }
}
