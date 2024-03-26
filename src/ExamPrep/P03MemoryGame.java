package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("end")) {
            count++;
            int index1 = Integer.parseInt(command.split(" ")[0]);
            int index2 = Integer.parseInt(command.split(" ")[1]);

            if (index1 == index2 || index1 < 0 || index1 > numbers.size() - 1 || index2 < 0 || index2 > numbers.size() - 1) {

                int middleIndex = numbers.size() / 2;
                numbers.add(middleIndex, "-" + count + "a");
                numbers.add(middleIndex, "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (numbers.get(index1).equals(numbers.get(index2))) {
                    String firstElement = numbers.get(index1);
                    String secondElement = numbers.get(index2);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", numbers.get(index1));
                    numbers.remove(firstElement);
                    numbers.remove(secondElement);
                }else{

                    System.out.println("Try again!");
                }
            }
            if(numbers.isEmpty()){

                break;
            }

            command = scanner.nextLine();
        }
        if(numbers.isEmpty()) {
            System.out.printf("You have won in %d turns!",count);
        }else{
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", numbers));
        }
    }
}
