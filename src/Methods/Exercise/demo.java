package Methods.Exercise;


import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {


            if(isSumOfDigitsDivisibleBy8(i) && iSAtleastOneOddDigit(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isSumOfDigitsDivisibleBy8(int n){

        int sum = 0;
        while(n > 0){

            int lastDigit = n % 10;
            sum+= lastDigit;
            n/=10;

        }
      return sum % 8 == 0;
    }
    public static boolean iSAtleastOneOddDigit(int n){

        while (n > 0){
            int lastDigit = n % 10;
            if(lastDigit % 2 != 0){
                return true;
            }else{
                n/=10;
            }
        }
        return false;
    }
}
