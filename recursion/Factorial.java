package recursion;

import java.util.Scanner;

/*
Program to calculate factorial of a number using recursion
Program assumes the input will always be a positive number
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println("Please enter the number: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(findFactorial(number));
    }

    private static int findFactorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * findFactorial(number - 1);
        }
    }
}
