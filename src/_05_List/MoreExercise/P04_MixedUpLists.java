package _05_List.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04_MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {

            finalList.add(firstList.get(i));
            finalList.add(secondList.get(secondList.size() - 1 - i));

        }
        Collections.sort(finalList);

        if (firstList.size() > secondList.size()) {
            firstList.subList(0, minSize).clear();
            Collections.sort(firstList);
            for (int i = 0; i < finalList.size(); i++) {

                if (finalList.get(i) > firstList.get(0) && finalList.get(i) < firstList.get(1)) {
                    System.out.print(finalList.get(i) + " ");
                }

            }
        } else if (secondList.size() > firstList.size()) {
            Collections.reverse(secondList);
            secondList.subList(0, minSize).clear();
            Collections.sort(secondList);
            for (int i = 0; i < finalList.size(); i++) {


                if (finalList.get(i) > secondList.get(0) && finalList.get(i) < secondList.get(1)) {
                    System.out.print(finalList.get(i) + " ");
                }

            }
        }


    }
}
