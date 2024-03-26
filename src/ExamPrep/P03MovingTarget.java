package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String commandName = command.split("\\s+")[0];
            int index = Integer.parseInt(command.split("\\s+")[1]);
            switch (commandName){
                case"Shoot":

                    int power = Integer.parseInt(command.split("\\s+")[2]);
                    if(index >= 0 && index < targets.size()){
                        targets.set(index,targets.get(index) - power);
                        if(targets.get(index) <= 0){
                            targets.remove(index);
                        }
                    }
                    break;
                case"Add":
                    int value = Integer.parseInt(command.split("\\s+")[2]);
                    if(index >= 0 && index < targets.size()) {
                        targets.add(index,value);
                    }else{
                        System.out.println("Invalid placement!");
                    }
                    break;
                case"Strike":
                    int radius = Integer.parseInt(command.split("\\s+")[2]);
                    int start = index - radius;
                    int end = index + radius;
                    if(start < 0 || end >= targets.size()){
                        System.out.println("Strike missed!");
                        break;
                    }else{
                        for (int i = start; i <=end ; i++) {
                            targets.remove(start);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(targets.toString()
                .replaceAll("[\\[\\],]","")
                .replaceAll(" ","|"));
    }
}
