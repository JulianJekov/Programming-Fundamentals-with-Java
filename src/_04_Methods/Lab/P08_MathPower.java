package _04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(mathPower(number, power)));

    }

    public static double mathPower(double number, int power) {

        double pow = 1;
        for (int i = 1; i <= power; i++) {

            pow *= number;

        }
        return pow;
    }

}
