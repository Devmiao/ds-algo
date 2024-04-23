package recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println("Please enter the number: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(findSumOfDigits(number));
    }

    private static int findSumOfDigits(int number) {

        if (number <= 9){
            return number;
        }
        else {
            return number%10 + findSumOfDigits(number/10);
        }
    }
}
