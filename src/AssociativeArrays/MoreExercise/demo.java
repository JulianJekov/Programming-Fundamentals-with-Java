package AssociativeArrays.MoreExercise;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // map to store contests and their passwords
        Map<String, String> contests = new HashMap<>();

        // read contests and their passwords
        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];
            contests.put(contest, password);
            input = scanner.nextLine();
        }

        // map to store users, contests and their points
        Map<String, Map<String, Integer>> users = new TreeMap<>();

        // read submissions and update user points
        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String user = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if (contests.containsKey(contest) && contests.get(contest).equals(password)) {
                if (!users.containsKey(user)) {
                    users.put(user, new HashMap<>());
                }
                if (!users.get(user).containsKey(contest)) {
                    users.get(user).put(contest, 0);
                }
                int currentPoints = users.get(user).get(contest);
                if (points > currentPoints) {
                    users.get(user).put(contest, points);
                }
            }

            input = scanner.nextLine();
        }

        // find the best user
        String bestUser = "";
        int bestPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> userEntry : users.entrySet()) {
            String user = userEntry.getKey();
            int totalPoints = 0;
            Map<String, Integer> contestPoints = userEntry.getValue();
            for (int points : contestPoints.values()) {
                totalPoints += points;
            }
            if (totalPoints > bestPoints) {
                bestUser = user;
                bestPoints = totalPoints;
            }
        }

        // print the best user
        System.out.printf("Best candidate is %s with total %d points.\n", bestUser, bestPoints);

        // print all users ordered by name
        for (Map.Entry<String, Map<String, Integer>> userEntry : users.entrySet()) {
            String user = userEntry.getKey();
            System.out.println(user);
            Map<String, Integer> contestPoints = userEntry.getValue();
            for (Map.Entry<String, Integer> contestEntry : contestPoints.entrySet()) {
                String contest = contestEntry.getKey();
                int points = contestEntry.getValue();
                System.out.printf("#  %s -> %d\n", contest, points);
            }
        }
    }
}
