package List.MoreExercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class P02_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> time = Arrays
                .stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int leftRightEndIndex = (time.size() - 1) / 2;

        double leftSum = 0;
        for (int i = 0; i < leftRightEndIndex; i++) {
            leftSum += time.get(i);
            if (time.get(i) == 0) {
                leftSum *= 0.8;
            }
        }

        double rightSum = 0;
        for (int i = time.size() - 1; i > leftRightEndIndex; i--) {
            rightSum += time.get(i);
            if (time.get(i) == 0) {
                rightSum *= 0.8;
            }
        }
        if (leftSum > rightSum) {
            System.out.printf("The winner is right with total time: %.1f", rightSum);
        } else if (rightSum > leftSum) {
            System.out.printf("The winner is left with total time: %.1f", leftSum);
        }
    }
}