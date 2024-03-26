package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Double> studentsGrades = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> studentsCount = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsCount.putIfAbsent(name,0);
            studentsCount.put(name,studentsCount.get(name) + 1);

            studentsGrades.putIfAbsent(name,0.0);
            studentsGrades.put(name,studentsGrades.get(name) + grade);


        }
        for (Map.Entry<String, Double> entry : studentsGrades.entrySet()) {
            if(entry.getValue() / studentsCount.get(entry.getKey()) >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() / studentsCount.get(entry.getKey()));
            }
        }

    }
}
