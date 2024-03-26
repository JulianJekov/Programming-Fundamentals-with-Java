package TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedText = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

      for (String banWord : bannedText){
          StringBuilder sb = new StringBuilder();
          int count = banWord.length();
          sb.append("*".repeat(count));
          text = text.replace(banWord,sb);
      }
        System.out.println(text);
    }
}