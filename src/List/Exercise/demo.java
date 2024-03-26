package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                if (startIndex <= input.size() - 1 && endIndex >= 0 && endIndex <= input.size() - 1) {
                    String mergedElements = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        mergedElements += input.get(i);
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        input.remove(startIndex);
                    }
                    input.add(startIndex, mergedElements);
                }

            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= input.size() - 1) {

                    String textToDivide = input.get(index);
                    input.remove(index);
                    int countSymbolsPerPart = textToDivide.length() / parts;

                    int beginIndex = 0;
                    for (int i = 1; i < parts ; i++) {

                        String textParts = textToDivide.substring(beginIndex,beginIndex + countSymbolsPerPart);
                        input.add(index,textParts);
                        index++;
                        beginIndex+=countSymbolsPerPart;
                    }
                    String textLastPart = textToDivide.substring(beginIndex,textToDivide.length());
                    input.add(index,textLastPart);


                }

            }


            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", input));
    }
}
