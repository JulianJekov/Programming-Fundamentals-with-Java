package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int startPower = pokePowerN;
        int countTargets = 0;

        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            countTargets++;

            if (pokePowerN == startPower / 2) {
                if (exhaustionFactorY != 0) {
                    pokePowerN /= exhaustionFactorY;
                }
            }
        }


        System.out.println(pokePowerN);
        System.out.println(countTargets);
    }
}
