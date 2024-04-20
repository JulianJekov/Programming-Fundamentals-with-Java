package _07_AssociativeArrays.MoreExercise;

import java.util.*;

public class P03_MobaChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> players = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Season end")) {
            String[] tokens = input.split("\\s+");

            if (input.contains("->")) {
                String player = tokens[0];
                String position = tokens[2];
                int skill = Integer.parseInt(tokens[4]);

                players.putIfAbsent(player, new HashMap<>());
                players.get(player).put(position, Math.max(skill, players.get(player).getOrDefault(position, 0)));
            } else if (input.contains("vs")) {
                String player1 = tokens[0];
                String player2 = tokens[2];

                if (players.containsKey(player1) && players.containsKey(player2)) {
                    Map<String, Integer> skills1 = players.get(player1);
                    Map<String, Integer> skills2 = players.get(player2);

                    int totalSkill1 = skills1.values().stream().mapToInt(Integer::intValue).sum();
                    int totalSkill2 = skills2.values().stream().mapToInt(Integer::intValue).sum();

                    Set<String> commonPositions = new HashSet<>(skills1.keySet());
                    commonPositions.retainAll(skills2.keySet());

                    if (!commonPositions.isEmpty()) {
                        if (totalSkill1 > totalSkill2) {
                            players.remove(player2);
                        } else if (totalSkill2 > totalSkill1) {
                            players.remove(player1);
                        }
                    }
                }
            }
        }

        players.entrySet().stream()
                .sorted((p1, p2) -> {
                    int totalSkill1 = p1.getValue().values().stream().mapToInt(Integer::intValue).sum();
                    int totalSkill2 = p2.getValue().values().stream().mapToInt(Integer::intValue).sum();
                    if (totalSkill2 != totalSkill1) {
                        return Integer.compare(totalSkill2, totalSkill1);
                    } else {
                        return p1.getKey().compareTo(p2.getKey());
                    }
                })
                .forEach(playerEntry -> {
                    int totalSkill = playerEntry.getValue().values().stream().mapToInt(Integer::intValue).sum();
                    System.out.printf("%s: %d skill%n", playerEntry.getKey(), totalSkill);

                    playerEntry.getValue().entrySet().stream()
                            .sorted((p1, p2) -> {
                                if (p2.getValue() != p1.getValue()) {
                                    return Integer.compare(p2.getValue(), p1.getValue());
                                } else {
                                    return p1.getKey().compareTo(p2.getKey());
                                }
                            })
                            .forEach(positionEntry -> {
                                System.out.printf("- %s <::> %d%n", positionEntry.getKey(), positionEntry.getValue());
                            });
                });
    }

}
