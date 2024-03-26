package Methods.Exercise;

import java.util.Scanner;


public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        charactersBetweenFirstAndSecond(first,second);


    }
    public static void charactersBetweenFirstAndSecond(char first, char second){
        if(first > second){
            for (int i = second + 1; i <= first - 1 ; i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = first + 1; i <= second - 1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
