package recursion;

public class RecursivePrinciple {

    public static void main(String[] args) {
        recursiveMethod(10);
    }

    private static void recursiveMethod(int number) {
        if (number < 1) {
            System.out.println("Number is less than 1");
        } else {
            recursiveMethod(number - 1);

            System.out.println(number);
        }
    }
}
