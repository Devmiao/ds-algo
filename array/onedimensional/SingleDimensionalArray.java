package array.onedimensional;

public class SingleDimensionalArray {

    int[] arr;

    public SingleDimensionalArray(int sizeOfArray) {

        arr = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {

        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
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
            for (int j : arr) {
                System.out.println(j);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }

    public void findElement(int element) {

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found in the array!!!");
    }

    public void deleteElementWithGivenValue(int element){

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == element){
                arr[i] = Integer.MIN_VALUE;
                System.out.println("Value deleted successfully!!!");
                return;
            }
        }
        System.out.println("Value not found in the array!!!");
    }

    public void deleteElementFromAnIndex(int index){

        try{
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Value deleted successfully!!!");
        }
        catch(Exception e){
            System.out.println("Unable to delete element from the given index, due to the following exception: " + e.getMessage());
        }

    }
}
