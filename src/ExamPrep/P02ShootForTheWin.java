package ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int shootTargets = 0;
        while (!command.equals("End")){
            int index = Integer.parseInt(command);

            if(index >= 0 && index < targets.length){
                int value = targets[index];
                if (targets[index] != -1) {
                    shootTargets++;
                    targets[index] = -1;

                    for (int i = 0; i < targets.length; i++) {
                        if(targets[i] != -1 && targets[i] > value){
                            targets[i] -= value;
                        }else if (targets[i] != -1 && targets[i] <= value){
                            targets[i] += value;
                        }
                    }
                }

            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shootTargets);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
