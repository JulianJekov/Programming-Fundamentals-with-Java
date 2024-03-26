package TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String userName : userNames) {
            boolean isValid = true;
            StringBuilder sb = new StringBuilder();
            if (userName.length() >= 3 && userName.length() <= 16) {
                for (int j = 0; j < userName.length(); j++) {
                    char symbol = userName.charAt(j);
                    if (!Character.isLetterOrDigit(symbol) &&
                            symbol != '-' && symbol != '_') {
                        isValid = false;
                        break;
                    } else {
                        sb.append(symbol);
                    }
                }
                if (isValid) {
                    System.out.println(sb);
                }
            }
        }
    }
}