package _08_TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05_HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();
        String space = "    ";
        System.out.printf("<h1>%n%s%s%n</h1>%n", space, title);
        System.out.printf("<article>%n%s%s%n</article>%n", space, content);

        String command = scanner.nextLine();

        while (!command.contains("end")) {
            System.out.printf("<div>%n%s%s%n</div>%n", space, command);

            command = scanner.nextLine();
        }

    }
}
