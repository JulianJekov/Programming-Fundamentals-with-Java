package AssociativeArrays.Lab;

import java.util.*;


public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays
                .stream(scanner.nextLine().split(" "))
                .filter(p -> p.length() % 2 == 0)
                .toArray(String[]::new);

        for(String word : words){
            System.out.println(word);
        }
    }
}
