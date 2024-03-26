package TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
                digit.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letter.append(symbol);
            } else {
                other.append(symbol);
            }
        }
        System.out.printf("%s%n%s%n%s",digit,letter,other);

    }
}
