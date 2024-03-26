package FinalExamPrep;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder passBuilder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {

            if (input.contains("TakeOdd")) {
                StringBuilder modifyPass = new StringBuilder();
                for (int i = 0; i < passBuilder.length(); i++) {

                    if (i % 2 != 0) {
                        modifyPass.append(passBuilder.charAt(i));
                    }
                }
                passBuilder = new StringBuilder(modifyPass);
                System.out.println(passBuilder);
            } else if (input.contains("Cut")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int endIndex = Integer.parseInt(input.split("\\s+")[2]) + startIndex;
                passBuilder.delete(startIndex, endIndex);
                System.out.println(passBuilder);
            } else if (input.contains("Substitute")) {
                String oldString = input.split("\\s+")[1];
                String newString = input.split("\\s+")[2];

                if (passBuilder.toString().contains(oldString)) {
                    String replace = passBuilder.toString().replace(oldString, newString);
                    passBuilder = new StringBuilder(replace);
                    System.out.println(passBuilder);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + passBuilder);
    }
}
