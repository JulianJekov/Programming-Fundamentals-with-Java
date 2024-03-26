package _01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P04_TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = hours * 60 + minutes + 30;

        int newHours = timeInMinutes / 60;
        int newMinutes = timeInMinutes % 60;

        if (newHours > 23) {
            newHours = 0;
        }

        if (newMinutes < 10) {
            System.out.printf("%d:%02d", newHours, newMinutes);
        } else  {
            System.out.printf("%d:%d", newHours, newMinutes);
        }
    }
}
