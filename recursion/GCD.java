package recursion;

import java.util.Scanner;

/*
Program to find the GCD/HCF of two numbers using recursion
 */
public class GCD {

    public static void main(String[] args) {

        System.out.println("Please enter the numbers: ");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();

        int secondNumber = scanner.nextInt();

        System.out.print("The GCD is: " + findGCD(Math.max(firstNumber, secondNumber), Math.min(firstNumber, secondNumber)));
    }

    private static int findGCD(int greaterNumber, int smallerNumber){

        if (greaterNumber%smallerNumber == 0){
            return smallerNumber;
        }
        else{
            return findGCD(smallerNumber, greaterNumber%smallerNumber);
        }
    }
}
