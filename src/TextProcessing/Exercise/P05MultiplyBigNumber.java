package TextProcessing.Exercise;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        if(bigNumber.isEmpty()){
            bigNumber = "0";
        }
        int multiply = Integer.parseInt(scanner.nextLine());
        if(multiply == 0){
            System.out.println("0");
            return;
        }
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {

            int numberMultiply = Integer.parseInt(bigNumber.charAt(i) + "");

            int numResult = numberMultiply * multiply;
            if (numResult > 9 && reminder == 0) {
                result.append(numResult % 10);
                reminder = numResult / 10;
            } else if (numResult > 9 && reminder > 0) {
                numResult += reminder;
                result.append(numResult % 10);
                reminder = numResult / 10;
            } else if (numResult < 10 && reminder > 0 && numResult + reminder < 10) {
                numResult += reminder;
                result.append(numResult);
                reminder = 0;
            } else if (numResult < 10 && reminder > 0 && numResult + reminder > 9) {
                numResult += reminder;
                result.append(numResult % 10);
                reminder = numResult / 10;
            } else if(numResult < 10 && reminder == 0){
                result.append(numResult);
            }
            if (i == 0 && reminder > 0) {
                result.append(reminder);
            }

        }
        result.reverse();
        System.out.println(result);

    }
}