package recursion;

import java.util.Scanner;


/*
Program to find Nth term of the Fibonacci Series with recursion
For Inputs less than 0 we are returning 0
*/
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Please enter the number: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(findNthTermOfFibonacciSeries(number));
    }

    private static int findNthTermOfFibonacciSeries(int number) {

        if (number <= 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        } else {
            return findNthTermOfFibonacciSeries(number - 1) + findNthTermOfFibonacciSeries(number - 2);
        }
    }
}
