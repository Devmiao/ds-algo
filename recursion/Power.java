package recursion;

import java.util.Scanner;

/*
Program calculates power of positive natural numbers using recursion
 */
public class Power {

    public static void main(String[] args) {

        System.out.println("Please provide the base and the exponent: ");

        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();

        int exponent = sc.nextInt();

        System.out.println(calculatePower(base, exponent));
    }

    private static int calculatePower(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}
