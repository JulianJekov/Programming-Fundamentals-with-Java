package _03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < nums.length; i++) {

            int firstElement = nums[i];
            int topInteger = 0;

            if (i == nums.length - 1) {
                topInteger = firstElement;
                System.out.print(topInteger);
                break;
            }

            for (int j = i + 1; j < nums.length; j++) {


                if (firstElement > nums[j]) {
                    topInteger = firstElement;
                } else {
                    topInteger = 0;
                    break;
                }
            }
            if (topInteger > 0) {
                System.out.print(topInteger + " ");
            }

        }

    }
}
