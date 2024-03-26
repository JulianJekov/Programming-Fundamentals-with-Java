package _04_Methods.MoreExercise;

import java.util.Scanner;

public class P03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        longestLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static void longestLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        if (Math.abs(x1 - x2) + Math.abs(y1 - y2) >= Math.abs(x3 - x4) + Math.abs(y3 - y4)) {
            printClosestToCenterPoint(x1, y1, x2, y2);
        } else {
            printClosestToCenterPoint(x3, y3, x4, y4);
        }

    }

    public static void printClosestToCenterPoint(int x1, int y1, int x2, int y2) {
        if (Math.abs(x1 + y1) <= Math.abs(x2 + y2)) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
    }

}
