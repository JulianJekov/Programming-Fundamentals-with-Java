package AssociativeArrays.Lab;

import java.util.*;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> countMap = new TreeMap<>();
        for (int i = 0; i < numbersArr.length; i++) {
            if (!countMap.containsKey(numbersArr[i])) {
                countMap.put(numbersArr[i], 1);
            } else {
                countMap.put(numbersArr[i], countMap.get(numbersArr[i]) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());

        }

    }
}
