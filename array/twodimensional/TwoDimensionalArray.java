package array.twodimensional;

public class TwoDimensionalArray {

    int[][] arr;

    public TwoDimensionalArray(int noOfColumns, int noOfRows) {

        arr = new int[noOfRows][noOfColumns];

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int rowNumber, int columnNumber, int valueToBeInserted) {

        try {
            if (arr[rowNumber][columnNumber] == Integer.MIN_VALUE) {
                arr[rowNumber][columnNumber] = valueToBeInserted;
                System.out.println("Value inserted successfully!!!");
            } else {
                System.out.println("Element already present at the given location!!!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("INVALID INDEX!!!");
        }
    }

    public void traverseArray() {

        try {
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }

    public void accessCell(int row, int column) {
        System.out.println("Accessing row: " + row + " column: " + column);

        try {
            System.out.println("Cell value is: " + arr[row][column]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("INVALID INDEX!!!");
        }
    }

    public void searchForElement(int element) {

        for (int[] intArray : arr) {
            for (int a : intArray) {
                if (a == element) {
                    System.out.println("Element found!!!");
                    return;
                }
            }
        }
        System.out.println("Element not found!!!");
    }

    public void deleteElement(int row, int column) {

        try {
            System.out.println("Element " + arr[row][column] + " deleted successfully!!!");

            arr[row][column] = Integer.MIN_VALUE;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("INVALID INDEX!!!");
        }

    }
}
