package _05_List.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class DEMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n-> n < 0);

        Collections.reverse(numbers);
        if(numbers.size() == 0){
            System.out.println("empty");
        }else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
