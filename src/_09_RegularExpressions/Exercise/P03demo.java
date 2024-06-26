package _09_RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regexInput = "%(?<name>[A-Z][a-z]+)%[^\\|\\$\\%\\.]*<(?<product>\\w+)>[^\\|\\$\\%\\.]*\\|(?<count>\\d+)\\|[^\\|\\$\\%\\.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regexInput);
        double totalSum = 0;
        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double finalSum = count * price;
                totalSum += finalSum;
                System.out.printf("%s: %s - %.2f%n", name, product, finalSum);

            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);

    }
}