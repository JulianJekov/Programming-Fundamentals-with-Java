package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] liftState = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < liftState.length; i++) {

            if (liftState[i] == 0) {
                if (people - 4 < 0) {
                    for (int j = people; j > 0; j--) {
                        people--;
                        liftState[i]++;
                    }
                    break;
                }
                liftState[i] = 4;
                people -= 4;

            } else {
                for (int j = 0; j < 4; j++) {
                    if (liftState[i] == 4 || people <= 0) {
                        break;
                    }
                    liftState[i]++;
                    people--;
                }
            }
        }
        if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            printTheLift(liftState);
        } else if (people == 0 && liftState[liftState.length - 1] != 4) {
            System.out.println("The lift has empty spots!");
            printTheLift(liftState);
        } else if (people == 0 && liftState[liftState.length - 1] == 4) {
            printTheLift(liftState);
        }

    }

    private static void printTheLift(int[] liftState) {
        for (int number : liftState) {
            System.out.print(number + " ");
        }
    }
}
