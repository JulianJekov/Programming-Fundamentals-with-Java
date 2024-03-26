package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i < numbers.size() / 2; i++) {

            System.out.print(numbers.get(i)+(numbers.get(numbers.size() - 1 - i)) + " ");

        }
        if(numbers.size() % 2 != 0){
            System.out.println(numbers.get(numbers.size() /2));
        }

    }
}
