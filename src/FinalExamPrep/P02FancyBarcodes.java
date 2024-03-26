package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("@[#]+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+");
            Matcher matcher = pattern.matcher(input);

            int validBarcodesCount = 0;
            StringBuilder productGroup = new StringBuilder();
            boolean isAnyDigits = false;
            while (matcher.find()){
                validBarcodesCount++;
                String barcode = matcher.group("barcode");

                for(char symbol : barcode.toCharArray()){
                    if(Character.isDigit(symbol)){
                        productGroup.append(symbol);
                        isAnyDigits = true;
                    }
                }
            }
            if(validBarcodesCount == 0){
                System.out.println("Invalid barcode");
            }else{
                if(isAnyDigits){
                    System.out.printf("Product group: %s%n",productGroup);
                }else{
                    System.out.println("Product group: 00");
                }
            }
        }
    }
}