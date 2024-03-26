package TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("find")) {
            StringBuilder texts = new StringBuilder();
            int keyInd = 0;
            for (int i = 0; i < input.toCharArray().length; i++) {
                if (keyInd >= key.length) {
                    keyInd = 0;
                }
                texts.append(input.toCharArray()[i] = (char) (input.toCharArray()[i] - key[keyInd]));
                keyInd++;
            }

//            char[] text = input.toCharArray();
//
//            int keyIndex = 0;
//
//            for (int i = 0; i < text.length; i++) {
//
//                if (keyIndex >= key.length) {
//                    keyIndex = 0;
//                }
//
//                text[i] = (char) (text[i] - key[keyIndex]);
//                keyIndex++;
//
//            }
            // printFoundedTreasure(text);
            print(texts);

            input = scanner.nextLine();
        }

    }

    public static void print(StringBuilder text) {
        int start = text.indexOf("&");
        int end = text.lastIndexOf("&");
        System.out.print("Found " + text.substring(start + 1, end));
        start = text.indexOf("<");
        end = text.indexOf(">");
        System.out.println(" at " + text.substring(start + 1, end));
    }
}
//    public static void printFoundedTreasure(char[] text) {
//        String textToString = Arrays.toString(text);
//        int typeStartIndex = textToString.indexOf("&");
//        int typeEndIndex = textToString.lastIndexOf("&");
//        String typeTreasure = textToString.substring(typeStartIndex + 1, typeEndIndex);
//        String trimedTypeTreasure = typeTreasure.replaceAll(", ", "");
//
//        int coordinatesStartIndex = textToString.indexOf("<");
//        int coordinatesEndIndex = textToString.lastIndexOf(">");
//        String coordinatesTreasure = textToString.substring(coordinatesStartIndex + 1, coordinatesEndIndex);
//        String trimedCoordinatesTreasure = coordinatesTreasure.replaceAll(", ", "");
//
//        System.out.printf("Found %s at %s%n", trimedTypeTreasure, trimedCoordinatesTreasure);
//
//    }
//}
