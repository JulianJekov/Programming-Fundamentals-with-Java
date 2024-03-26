package _03_Arrays.MoreExercise;

import java.util.Scanner;

public class Kamino_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthSequences = Integer.parseInt(scanner.nextLine());

        String commnad = scanner.nextLine();

        int counter = 0;
        int bestLength = 0;
        int bestSum = 0;
        int bestCounter = 0;
        String bestDna = "";
        int bestIndex = 0;
        while (!commnad.equals("Clone them!")) {
            counter++;
            String sequences = commnad.replaceAll("!", "");
            String[] dnas = sequences.split("0");

            int maxLength = 0;
            int sum = 0;
            String bestLockalDna = "";
            for (int i = 0; i < dnas.length; i++) {
                if (dnas[i].length() > maxLength) {
                    maxLength = dnas[i].length();
                    bestLockalDna = dnas[i];
                }
                sum += dnas[i].length();

            }
            int beginIndex = sequences.indexOf(bestLockalDna);
            if (maxLength > bestLength) {
                bestLength = maxLength;
                bestSum = sum;
                bestCounter = counter;
                bestDna = sequences;
                bestIndex = beginIndex;
            } else if(maxLength == bestLength && bestIndex > beginIndex || sum > bestSum){
                bestLength = maxLength;
                bestSum = sum;
                bestCounter = counter;
                bestDna = sequences;
                bestIndex = beginIndex;
            } else if (counter == 1){
                bestLength = maxLength;
                bestSum = sum;
                bestCounter = counter;
                bestDna = sequences;
                bestIndex = beginIndex;
            }

            commnad = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCounter,bestSum);
        for (int i = 0; i < bestDna.length(); i++) {
            System.out.print(bestDna.charAt(i) + " ");
        }

    }
}
