package ObjectsAndClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

        for (int i = 0; i < words.size() ; i++) {

            int index = rnd.nextInt(words.size());
            String lastWord = words.get(i);
            words.set(i,words.get(index));
            words.set(index,lastWord);


        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
