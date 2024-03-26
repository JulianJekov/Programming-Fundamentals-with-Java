package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String, Integer> userPoints = new LinkedHashMap<>();
        Map<String, Integer> countLanguage = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] inputData = input.split("-");

            if (inputData.length > 2) {
                String userName = inputData[0];
                String language = inputData[1];
                int points = Integer.parseInt(inputData[2]);

                if (!userPoints.containsKey(userName)) {
                    userPoints.put(userName, points);
                }else if(userPoints.get(userName) < points){
                    userPoints.put(userName, points);
                }
                if (!countLanguage.containsKey(language)) {
                    countLanguage.put(language, 0);
                }
                countLanguage.put(language, countLanguage.get(language) + 1);
            } else {
                String userName = inputData[0];
                userPoints.remove(userName);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");

        for (Map.Entry<String, Integer> entry : userPoints.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println("Submissions:");

        for (Map.Entry<String, Integer> entry : countLanguage.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }

    }
}