package _07_AssociativeArrays.Exercise;

import java.util.*;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        LinkedHashMap<Character, Integer> countChars = new LinkedHashMap<>();

        for (char symbol : text) {
            if (symbol != ' ') {
                countChars.putIfAbsent(symbol, 0);
                countChars.put(symbol, countChars.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}