package AssociativeArrays.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, ArrayList<String>> courseMap = new LinkedHashMap<>();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" : ");
            String courseName = commandParts[0];
            String studentName = commandParts[1];

            courseMap.putIfAbsent(courseName, new ArrayList<>());
            courseMap.get(courseName).add(studentName);

            command = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : courseMap.entrySet()) {

            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }

        }

    }
}
