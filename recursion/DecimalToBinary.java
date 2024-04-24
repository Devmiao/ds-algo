package recursion;

import java.util.Scanner;

/*
Program to convert a decimal to binary using recursion
 */
public class DecimalToBinary {

    public static void main(String[] args) {

        System.out.println("Please enter the decimal number: ");

        Scanner scanner = new Scanner(System.in);

        int decimalNumber = scanner.nextInt();

        System.out.print("Binary Equivalent: " + convertToDecimal(decimalNumber));
    }

    private static String convertToDecimal(int number){

        if (number == 0){
            return "";
        }
        else{
            return convertToDecimal(number/2) + number%2;
        }
    }
}
