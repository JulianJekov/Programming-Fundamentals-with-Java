package _08_TextProcessing.Lab;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strToRemove = scanner.nextLine();
        String text = scanner.nextLine();
//        int index = text.indexOf(strToRemove);
//        while (index != -1) {
//            text = text.replace(strToRemove, "");
//            index = text.indexOf(strToRemove);
//        }
        while (text.contains(strToRemove)) {
            text = text.replace(strToRemove, "");
        }
        System.out.println(text);
    }
}
