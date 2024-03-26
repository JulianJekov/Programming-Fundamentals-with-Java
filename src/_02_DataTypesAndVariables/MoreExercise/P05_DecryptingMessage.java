package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int charRotation = Integer.parseInt(scanner.nextLine());
        StringBuilder decryptedText = new StringBuilder();
        char lastChar = 0;

        for (int i = 1; i <= charRotation; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            lastChar += (char) (currentChar + key);
            decryptedText.append(lastChar);
            lastChar = 0;
        }
        System.out.println(decryptedText);
    }
}
