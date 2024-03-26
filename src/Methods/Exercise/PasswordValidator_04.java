package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isContentValid(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isCountDigitsValid(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength(password) && isCountDigitsValid(password) && isContentValid(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String password) {

        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isContentValid(String password) {

        char[] charArray = password.toCharArray();
        for (char symbol : charArray) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCountDigitsValid(String password) {

        int countDigits = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return countDigits >= 2;
    }
}
