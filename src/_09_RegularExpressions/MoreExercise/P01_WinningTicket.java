package _09_RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_WinningTicket {

    // not sure how to use positive lookahead and lookbehind regex so this solution is 90/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tickets = scanner.nextLine().split(",\\s+");
        Pattern winPattern = Pattern.compile("([@#$^]{6,})");

        for (int i = 0; i < tickets.length; i++) {

            String ticket = tickets[i].trim();

            if (ticket.length() == 20) {
                String left = ticket.substring(0, 10);
                String right = ticket.substring(10);

                Matcher matcherLeft = winPattern.matcher(left);
                Matcher matcherRight = winPattern.matcher(right);

                StringBuilder sbLeft = new StringBuilder();
                StringBuilder sbRight = new StringBuilder();

                if (matcherLeft.find()) {
                    sbLeft.append(matcherLeft.group());
                }
                if (matcherRight.find()) {
                    sbRight.append(matcherRight.group());
                }
                if (sbLeft.charAt(0) == sbRight.charAt(0)) {
                    int matchCount = Math.min(sbLeft.length(), sbRight.length());

                    if (matchCount == 10) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", ticket, matchCount, sbLeft.charAt(0));
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s%n", ticket, matchCount, sbLeft.charAt(0));
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}


//                if(sb.length() < 10 && sb.length() > 0){
//                    System.out.printf("ticket \"%s\" - %d%c%n", ticket,sb.length(),sb.charAt(0));
//                }else if (sb.length() > 9){
//                    System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", ticket,sb.length(),sb.charAt(0));
//                }