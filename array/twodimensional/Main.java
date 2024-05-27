package array.twodimensional;

public class Main {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2, 2);

        twoDimensionalArray.insert(0, 0, 0);
        twoDimensionalArray.insert(0, 1, 1);
        twoDimensionalArray.insert(1, 0, 19);
        twoDimensionalArray.insert(1, 1, 1000);

        twoDimensionalArray.traverseArray();

        twoDimensionalArray.insert(0, 1, 10);

        twoDimensionalArray.accessCell(2, 2);

        twoDimensionalArray.accessCell(1, 1);

        twoDimensionalArray.searchForElement(19);
        twoDimensionalArray.searchForElement(0);

        twoDimensionalArray.searchForElement(100);

        twoDimensionalArray.deleteElement(1, 0);
    }
}
