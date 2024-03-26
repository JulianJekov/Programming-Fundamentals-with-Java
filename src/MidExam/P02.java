package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffees = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number ; i++) {
            String[] command = scanner.nextLine().split(" ");

            if(command[0].equals("Include")){
                String coffeeName = command[1];
                coffees.add(coffeeName);

            }else if (command[0].equals("Remove")){
                String firstLast = command[1];
                int numberCoffes = Integer.parseInt(command[2]);
                if(firstLast.equals("first")){
                    if(numberCoffes < coffees.size()){
                        int start = 0;
                        for (int j = start; j < numberCoffes; j++) {
                            coffees.remove(start);
                        }
                    }
                }else if (firstLast.equals("last")){
                   if(numberCoffes < coffees.size()){
                       int start = coffees.size() - 1;
                       int end = coffees.size() - 1 - numberCoffes;
                       for (int j = start; j > end; j--) {
                           coffees.remove(coffees.size() -1);
                       }
                   }
                }

            }else if (command[0].equals("Prefer")){
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);
                if(index1 >= 0 && index1 < coffees.size() && index2 >= 0 && index2 < coffees.size() ){
                    String firstCoffee = coffees.get(index1);
                    String secondCoffee = coffees.get(index2);
                    coffees.set(index1,secondCoffee);
                    coffees.set(index2,firstCoffee);
                }

            }else if (command[0].equals("Reverse")){
                Collections.reverse(coffees);

            }

        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ",coffees));
    }
}
