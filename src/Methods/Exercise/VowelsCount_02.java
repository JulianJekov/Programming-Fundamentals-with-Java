package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelCount(text);

    }
    public static void printVowelCount (String text){
        int count = 0;
        for(char symbol : text.toLowerCase().toCharArray()){

            if(symbol == 'a' || symbol == 'A' || symbol == 'e' || symbol == 'E' || symbol == 'i' || symbol == 'I' ||
                    symbol == 'o' || symbol == 'O' || symbol == 'u' || symbol == 'U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
