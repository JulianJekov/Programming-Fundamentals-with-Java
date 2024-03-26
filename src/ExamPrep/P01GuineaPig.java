package ExamPrep;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityOfFood = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityOfHay = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityOfCover = Double.parseDouble(scanner.nextLine()) * 1000;
        double kilograms = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int i = 1; i <= 30 ; i++) {
            quantityOfFood -= 300;
            if(i % 2 == 0){
                quantityOfHay -= quantityOfFood * 0.05;
            }
            if(i % 3 == 0){
                quantityOfCover-= kilograms / 3;
            }
        }
        if(quantityOfFood <= 0 || quantityOfHay <= 0 || quantityOfCover <= 0){
            System.out.println("Merry must go to the pet store!");
        }else{
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",quantityOfFood / 1000,
                    quantityOfHay / 1000,quantityOfCover / 1000);
        }
    }
}
