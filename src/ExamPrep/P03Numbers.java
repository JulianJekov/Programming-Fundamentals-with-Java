package ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        for (int number : numbers) {

            sum += number;
        }
        double average = 1.0 * sum / numbers.size();

        Collections.sort(numbers);
        Collections.reverse(numbers);

        List<Integer> finalList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            count++;
            if (numbers.get(i) > average) {
                finalList.add(numbers.get(i));
            }
            if(count == 5){
                break;
            }
        }
        if(finalList.isEmpty()){
            System.out.println("No");
        }else{
            for(int number : finalList){
                System.out.print(number + " ");
            }
        }
    }
}
