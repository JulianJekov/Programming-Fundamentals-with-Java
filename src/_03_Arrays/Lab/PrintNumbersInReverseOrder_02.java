package _03_Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] numbersArr = new int [n];

        for (int i = 0; i < n; i++) {

            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbersArr.length -1; i >=0 ; i--) {

            System.out.printf("%d ",numbersArr[i]);
        }
    }
}
