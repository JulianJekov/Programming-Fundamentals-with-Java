package ExamPrep;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int countWonBattles = 0;
        boolean isEnergy = true;
        while (!command.equals("End of battle")) {

            int distance = Integer.parseInt(command);

            if (energy - distance < 0) {
                isEnergy = false;

                break;
            } else {

                countWonBattles++;
                energy -= distance;

                if(countWonBattles % 3 == 0){

                    energy+=countWonBattles;
                }

            }

            command = scanner.nextLine();
        }
        if(isEnergy){
            System.out.printf("Won battles: %d. Energy left: %d",countWonBattles,energy);
        }else{
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWonBattles, energy);
        }

    }
}
