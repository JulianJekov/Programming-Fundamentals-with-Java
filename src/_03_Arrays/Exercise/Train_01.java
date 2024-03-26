package _03_Arrays.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());

        int[] passengers = new int[wagonCount];

        int sum = 0;

        for (int i = 0; i < wagonCount; i++) {

            passengers[i] = Integer.parseInt(scanner.nextLine());

            sum+=passengers[i];
        }

        for (int i = 0; i < passengers.length; i++) {

            System.out.print(passengers[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
