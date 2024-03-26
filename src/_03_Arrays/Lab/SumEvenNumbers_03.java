package _03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < numbersArr.length; i++) {

            int currentElement = numbersArr[i];

            if(currentElement % 2 ==0){
                sum+= currentElement;
            }

        }
        System.out.println(sum);
    }
}
