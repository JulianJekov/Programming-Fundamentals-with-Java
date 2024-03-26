package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        double totalPrice = 0;
        System.out.println("Bought furniture:");
        while (!text.equals("Purchase")) {

            String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {

                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalPrice += price * quantity;
                System.out.println(furniture);
            }

            text = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}