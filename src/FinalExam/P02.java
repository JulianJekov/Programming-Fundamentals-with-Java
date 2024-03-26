package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<string>[A-Za-z]{8,})\\]");
            Matcher matcher = pattern.matcher(text);

            int count = 0;
            String command = "";
            String string = "";
            StringBuilder sb = new StringBuilder();
            while (matcher.find()){
                count++;
                command = matcher.group("command");
                string = matcher.group("string");
               for(char symbol : string.toCharArray()){
                   sb.append((int)symbol).append(" ");
               }
            }
            if(count ==0){
                System.out.println("The message is invalid");
            }else{
                System.out.printf("%s: %s%n",command,sb);
            }
        }

    }
}
