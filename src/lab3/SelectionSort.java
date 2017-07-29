package lab3;

/**
 * Created by Bi on 7/28/17.
 */
public class SelectionSort {
    int[] arr = {21,13,1,-22, 51, 5, 18};

    public void selectionSort() {
        for (int i = 0; i < arr.length; i++) {
            int minPos = minPos(i, arr.length);
            swap(i, minPos);
        }
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int minPos(int min, int max) {
        int minVal = arr[min];
        int index = min;

        for (int i = min + 1; i < max; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
                index = i;
            }
        }

        return index;
    }

    public void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        ss.printArr(ss.arr);
        ss.selectionSort();
        ss.printArr(ss.arr);

    }
}
