package ObjectsAndClasses.Exercise.P01AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Message message = new Message();
        for (int i = 1; i <= n ; i++) {

            String output = message.randomMessage();
            System.out.println(output);
        }
    }
}
