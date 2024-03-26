package _03_Arrays.Exercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");


        for (String secondElement : secondArr) {

            for (String firstElement : firstArr) {

                if (secondElement.equals(firstElement)) {
                    System.out.print(secondElement + " ");
                    break;
                }

            }
        }

    }
}
