package lab3;

/**
 * Created by Bi on 7/28/17.
 */
public class InsertionSort {
    int[] arr = {21,13,1,-22, 51, 5, 18};

    public void insertionSort() {
        int len = arr.length;
        int temp = 0; // store value of current element in loop
        int j = 0; // store current index of element

        for (int i = 1; i < len; i++) {
            temp = arr[i];
            j = i;

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;
        }
    }

    public void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        is.printArr(is.arr);
        is.insertionSort();
        is.printArr(is.arr);

    }

}
