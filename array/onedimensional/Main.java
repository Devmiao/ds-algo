package array.onedimensional;

public class Main {

    public static void main(String[] args) {

        SingleDimensionalArray singleDimensionalArray = new SingleDimensionalArray(10);

        singleDimensionalArray.insert(0, 0);
        singleDimensionalArray.insert(1, 10);
        singleDimensionalArray.insert(2, 100);
        singleDimensionalArray.insert(3, 1000);
        singleDimensionalArray.insert(4, 10000);
        singleDimensionalArray.insert(5, 100000);
        singleDimensionalArray.insert(6, 1000000);
        singleDimensionalArray.insert(7, 10000000);

        singleDimensionalArray.traverseArray();

        singleDimensionalArray.findElement(100);
    }
}
