package Methods.Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (commandInput) {

            case "add":
                //TODO invoke add method
                printAdd(firstNumInput, secondNumInput);
                break;
            case "multiply":
                //TODO invoke multiply method
                printMultiply(firstNumInput, secondNumInput);
                break;
            case "subtract":
                //TODO invoke subtract method
                printSubtract(firstNumInput, secondNumInput);
                break;
            case "divide":
                //TODO invoke divide method
                printDivide(firstNumInput, secondNumInput);
                break;

        }

    }
    public static void printAdd(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void printMultiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void printSubtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void printDivide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}