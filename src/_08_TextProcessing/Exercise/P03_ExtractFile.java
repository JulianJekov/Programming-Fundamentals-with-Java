package _08_TextProcessing.Exercise;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pathToFile = scanner.nextLine().split("\\\\");

        for (String s : pathToFile) {
            if (s.contains(".")) {
                String name = s.split("[.]", 0)[0];
                String extension = s.split("\\.")[1];

                System.out.printf("File name: %s%nFile extension: %s", name, extension);
            }
        }
    }
}
