package _03_Arrays.MoreExercise;


import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namesCount = Integer.parseInt(scanner.nextLine());

        int[] encryptedArr = new int[namesCount];


        for (int i = 0; i < namesCount; i++) {

            String names = scanner.nextLine();

            int sum = 0;

            for (int j = 0; j < names.length(); j++) {
                char ch = names.charAt(j);

                if (names.charAt(j) == 'a' || names.charAt(j) == 'e' || names.charAt(j) == 'i' ||
                        names.charAt(j) == 'o' || names.charAt(j) == 'u' || names.charAt(j) == 'A' ||
                        names.charAt(j) == 'E' || names.charAt(j) == 'I' ||
                        names.charAt(j) == 'O' || names.charAt(j) == 'U') {
                    sum += ch * names.length();
                } else {
                    sum += ch / names.length();
                }
            }
            encryptedArr[i] = sum;

        }
        Arrays.sort(encryptedArr);
        for (int i = 0; i < encryptedArr.length; i++) {
            System.out.println(encryptedArr[i]);
        }

    }
}
