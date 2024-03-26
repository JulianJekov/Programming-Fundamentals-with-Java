package ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List<Integer> neighborhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int index = 0;
        int lastIndex = 0;
        while (!command.equals("Love!")) {
            index += Integer.parseInt(command.split(" ")[1]);
            if (index < neighborhood.length) {
                if (neighborhood[index] == 0) {
                    printAlreadyHas(index);
                } else {
                    neighborhood[index] -= 2;
                    if (neighborhood[index] == 0) {
                       printHas(index);
                    }
                }
            } else {
                index = 0;
                if (neighborhood[index] == 0) {
                   printAlreadyHas(index);
                } else {
                    neighborhood[index] -= 2;
                    if (neighborhood[index] == 0) {
                        printHas(index);
                    }
                }
            }
            lastIndex = index;
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastIndex);
        if (isEmpty(neighborhood)) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failedPlaces(neighborhood));
        }
    }

    public static int failedPlaces(int[] hood) {
        int fullIndex = 0;
        for (int i = 0; i < hood.length; i++) {
            if (hood[i] != 0) {
                fullIndex++;
            }
        }
        return fullIndex;
    }

    public static boolean isEmpty(int[] hood) {

        for (int num : hood) {

            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public static void printHas(int index){
        System.out.printf("Place %d has Valentine's day.%n", index);
    }
    public static void printAlreadyHas(int index){
        System.out.printf("Place %d already had Valentine's day.%n", index);
    }

}
