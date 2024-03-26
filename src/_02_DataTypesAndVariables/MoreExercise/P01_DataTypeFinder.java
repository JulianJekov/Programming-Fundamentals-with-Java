package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("END")) {
            Scanner scanner1 = new Scanner(input);
            if(scanner.hasNextBoolean()){
                System.out.println(input + " is boolean type");
            }else if(scanner1.hasNextInt()){
                System.out.println(input + " is integer type");
            }else if(scanner1.hasNextDouble()) {
                System.out.println(input + " is floating point type");
            }else if(input.length()==1){
                System.out.println(input + " is character type");
            }else if(scanner1.hasNextLine()){
            System.out.println(input + " is string type");
        }

            input = scanner.nextLine();
        }

    }
}
