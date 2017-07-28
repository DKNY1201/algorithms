package lab3;

/**
 * Created by Bi on 7/28/17.
 */
public class BubbleSort {
    int[] arr = {3,5,1,7,6,5,3,2};
    int[] arr1 = {1,2,3,4,5,6,7,8,9};

    public void bubbleShort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
//        bs.printArr(bs.arr);
//        bs.bubbleShort(bs.arr);
//        bs.printArr(bs.arr);

        bs.printArr(bs.arr1);
        bs.bubbleShort(bs.arr1);
        bs.printArr(bs.arr1);
    }

}
