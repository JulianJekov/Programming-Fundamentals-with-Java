package AssociativeArrays.MoreExercise;

import java.util.*;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> data = new LinkedHashMap<>();

        while (!input.equals("end of contests")) {
            String[] inputData = input.split(":");
            String contest = inputData[0];
            String password = inputData[1];

            if (!data.containsKey(contest)) {
                data.put(contest, password);
            }
            input = scanner.nextLine();
        }

        String otherInput = scanner.nextLine();

        Map<String, Map<String, Integer>> userPoints = new TreeMap<>();

        while (!otherInput.equals("end of submissions")) {
            String[] otherInputData = otherInput.split("=>");
            String contest = otherInputData[0];
            String password = otherInputData[1];
            String username = otherInputData[2];
            int points = Integer.parseInt(otherInputData[3]);

            if (data.containsKey(contest) && data.get(contest).equals(password)) {

                if (!userPoints.containsKey(username)) {
                    userPoints.put(username, new LinkedHashMap<>());
                    userPoints.get(username).put(contest, points);
                } else if (userPoints.containsKey(username) && userPoints.get(username).containsKey(contest)) {

                    if (userPoints.get(username).get(contest) < points) {
                        userPoints.get(username).put(contest, points);
                    }
                } else {
                    userPoints.get(username).put(contest, points);
                }
            }
            otherInput = scanner.nextLine();

        }

        int bestSum = 0;
        String bestName = "";
        for (Map.Entry<String, Map<String, Integer>> entry : userPoints.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (bestSum < sum) {
                bestSum = sum;
                bestName = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestName, bestSum);
        
        System.out.println("Ranking:");
        userPoints.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("# %s -> %d%n", i.getKey(), i.getValue()));
        });

    }
}